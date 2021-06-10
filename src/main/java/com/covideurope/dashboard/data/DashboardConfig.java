package com.covideurope.dashboard.data;

import com.covideurope.dashboard.dataProcessing.CovidItemProcessor;
import com.covideurope.dashboard.model.Covid;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class DashboardConfig {

    private final String[] ATTRIBUTES = new String[]{
            "id", "iso_code", "continent", "location", "date", "total_cases", "new_cases", "new_cases_smoothed", "total_deaths", "new_deaths", "new_deaths_smoothed", "total_cases_per_million", "new_cases_per_million", "new_cases_smoothed_per_million", "total_deaths_per_million", "new_deaths_per_million", "new_deaths_smoothed_per_million", "reproduction_rate", "icu_patients", "icu_patients_per_million", "hosp_patients", "hosp_patients_per_million", "weekly_icu_admissions", "weekly_icu_admissions_per_million", "weekly_hosp_admissions", "weekly_hosp_admissions_per_million", "new_tests", "total_tests", "total_tests_per_thousand", "new_tests_per_thousand", "new_tests_smoothed", "new_tests_smoothed_per_thousand", "positive_rate", "tests_per_case", "tests_units", "total_vaccinations", "people_vaccinated", "people_fully_vaccinated", "new_vaccinations", "new_vaccinations_smoothed", "total_vaccinations_per_hundred", "people_vaccinated_per_hundred", "people_fully_vaccinated_per_hundred", "new_vaccinations_smoothed_per_million", "stringency_index", "population", "population_density", "median_age", "aged_65_older", "aged_70_older", "gdp_per_capita", "extreme_poverty", "cardiovasc_death_rate", "diabetes_prevalence", "female_smokers", "male_smokers", "handwashing_facilities", "hospital_beds_per_thousand", "life_expectancy", "human_development_index", "excess_mortality"
    };

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public FlatFileItemReader<CovidInput> reader() {
        return new FlatFileItemReaderBuilder<CovidInput>()
                .name("personItemReader")
                .resource(new ClassPathResource("most_recent_data.csv"))
                .delimited()
                .names(ATTRIBUTES)
                .fieldSetMapper(new BeanWrapperFieldSetMapper<CovidInput>() {{
                    setTargetType(CovidInput.class);
                }})
                .build();
    }

    @Bean
    public CovidItemProcessor processor() {
        return new CovidItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<Covid> writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<Covid>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO covid (id, continent, location, date, total_cases, new_cases, total_deaths, new_deaths, icu_patients, hosp_patients, weekly_icu_admissions, weekly_hosp_admissions, positive_rate, people_vaccinated, people_fully_vaccinated, new_vaccinations, total_vaccinations_per_hundred, people_vaccinated_per_hundred, people_fully_vaccinated_per_hundred, population) " +
                        "VALUES (:id, :continent, :location, :date, :totalCases, :newCases, :totalDeaths, :newDeaths, :icuPatients, :hospPatients, :weeklyIcuAdmissions, :weeklyHospAdmissions, :positiveRate, :peopleVaccinated, :peopleFullyVaccinated, :newVaccinations, :totalVaccinationsPerHundred, :peopleVaccinatedPerHundred, :peopleFullyVaccinatedPerHundred, :population)")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<Covid> writer) {
        return stepBuilderFactory.get("step1")
                .<CovidInput, Covid>chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer)
                .build();
    }

}