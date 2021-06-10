package com.covideurope.dashboard.data;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class CovidInput {

    private String id;
    private String iso_code;
    private String continent;
    private String location;
    private String date;
    private String total_cases;
    private String new_cases;
    private String new_cases_smoothed;
    private String total_deaths;
    private String new_deaths;
    private String new_deaths_smoothed;
    private String total_cases_per_million;
    private String new_cases_per_million;
    private String new_cases_smoothed_per_million;
    private String total_deaths_per_million;
    private String new_deaths_per_million;
    private String new_deaths_smoothed_per_million;
    private String reproduction_rate;
    private String icu_patients;
    private String icu_patients_per_million;
    private String hosp_patients;
    private String hosp_patients_per_million;
    private String weekly_icu_admissions;
    private String weekly_icu_admissions_per_million;
    private String weekly_hosp_admissions;
    private String weekly_hosp_admissions_per_million;
    private String new_tests;
    private String total_tests;
    private String total_tests_per_thousand;
    private String new_tests_per_thousand;
    private String new_tests_smoothed;
    private String new_tests_smoothed_per_thousand;
    private String positive_rate;
    private String tests_per_case;
    private String tests_units;
    private String total_vaccinations;
    private String people_vaccinated;
    private String people_fully_vaccinated;
    private String new_vaccinations;
    private String new_vaccinations_smoothed;
    private String total_vaccinations_per_hundred;
    private String people_vaccinated_per_hundred;
    private String people_fully_vaccinated_per_hundred;
    private String new_vaccinations_smoothed_per_million;
    private String stringency_index;
    private String population;
    private String population_density;
    private String median_age;
    private String aged_65_older;
    private String aged_70_older;
    private String gdp_per_capita;
    private String extreme_poverty;
    private String cardiovasc_death_rate;
    private String diabetes_prevalence;
    private String female_smokers;
    private String male_smokers;
    private String handwashing_facilities;
    private String hospital_beds_per_thousand;
    private String life_expectancy;
    private String human_development_index;
    private String excess_mortality;

    public CovidInput() {
    }

    public CovidInput(String id, String iso_code, String continent, String location, String date, String total_cases, String new_cases, String new_cases_smoothed, String total_deaths, String new_deaths, String new_deaths_smoothed, String total_cases_per_million, String new_cases_per_million, String new_cases_smoothed_per_million, String total_deaths_per_million, String new_deaths_per_million, String new_deaths_smoothed_per_million, String reproduction_rate, String icu_patients, String icu_patients_per_million, String hosp_patients, String hosp_patients_per_million, String weekly_icu_admissions, String weekly_icu_admissions_per_million, String weekly_hosp_admissions, String weekly_hosp_admissions_per_million, String new_tests, String total_tests, String total_tests_per_thousand, String new_tests_per_thousand, String new_tests_smoothed, String new_tests_smoothed_per_thousand, String positive_rate, String tests_per_case, String tests_units, String total_vaccinations, String people_vaccinated, String people_fully_vaccinated, String new_vaccinations, String new_vaccinations_smoothed, String total_vaccinations_per_hundred, String people_vaccinated_per_hundred, String people_fully_vaccinated_per_hundred, String new_vaccinations_smoothed_per_million, String stringency_index, String population, String population_density, String median_age, String aged_65_older, String aged_70_older, String gdp_per_capita, String extreme_poverty, String cardiovasc_death_rate, String diabetes_prevalence, String female_smokers, String male_smokers, String handwashing_facilities, String hospital_beds_per_thousand, String life_expectancy, String human_development_index) {
        this.id = id;
        this.iso_code = iso_code;
        this.continent = continent;
        this.location = location;
        this.date = date;
        this.total_cases = total_cases;
        this.new_cases = new_cases;
        this.new_cases_smoothed = new_cases_smoothed;
        this.total_deaths = total_deaths;
        this.new_deaths = new_deaths;
        this.new_deaths_smoothed = new_deaths_smoothed;
        this.total_cases_per_million = total_cases_per_million;
        this.new_cases_per_million = new_cases_per_million;
        this.new_cases_smoothed_per_million = new_cases_smoothed_per_million;
        this.total_deaths_per_million = total_deaths_per_million;
        this.new_deaths_per_million = new_deaths_per_million;
        this.new_deaths_smoothed_per_million = new_deaths_smoothed_per_million;
        this.reproduction_rate = reproduction_rate;
        this.icu_patients = icu_patients;
        this.icu_patients_per_million = icu_patients_per_million;
        this.hosp_patients = hosp_patients;
        this.hosp_patients_per_million = hosp_patients_per_million;
        this.weekly_icu_admissions = weekly_icu_admissions;
        this.weekly_icu_admissions_per_million = weekly_icu_admissions_per_million;
        this.weekly_hosp_admissions = weekly_hosp_admissions;
        this.weekly_hosp_admissions_per_million = weekly_hosp_admissions_per_million;
        this.new_tests = new_tests;
        this.total_tests = total_tests;
        this.total_tests_per_thousand = total_tests_per_thousand;
        this.new_tests_per_thousand = new_tests_per_thousand;
        this.new_tests_smoothed = new_tests_smoothed;
        this.new_tests_smoothed_per_thousand = new_tests_smoothed_per_thousand;
        this.positive_rate = positive_rate;
        this.tests_per_case = tests_per_case;
        this.tests_units = tests_units;
        this.total_vaccinations = total_vaccinations;
        this.people_vaccinated = people_vaccinated;
        this.people_fully_vaccinated = people_fully_vaccinated;
        this.new_vaccinations = new_vaccinations;
        this.new_vaccinations_smoothed = new_vaccinations_smoothed;
        this.total_vaccinations_per_hundred = total_vaccinations_per_hundred;
        this.people_vaccinated_per_hundred = people_vaccinated_per_hundred;
        this.people_fully_vaccinated_per_hundred = people_fully_vaccinated_per_hundred;
        this.new_vaccinations_smoothed_per_million = new_vaccinations_smoothed_per_million;
        this.stringency_index = stringency_index;
        this.population = population;
        this.population_density = population_density;
        this.median_age = median_age;
        this.aged_65_older = aged_65_older;
        this.aged_70_older = aged_70_older;
        this.gdp_per_capita = gdp_per_capita;
        this.extreme_poverty = extreme_poverty;
        this.cardiovasc_death_rate = cardiovasc_death_rate;
        this.diabetes_prevalence = diabetes_prevalence;
        this.female_smokers = female_smokers;
        this.male_smokers = male_smokers;
        this.handwashing_facilities = handwashing_facilities;
        this.hospital_beds_per_thousand = hospital_beds_per_thousand;
        this.life_expectancy = life_expectancy;
        this.human_development_index = human_development_index;
    }

    public CovidInput(String id, String iso_code, String continent, String location, String date, String total_cases, String new_cases, String new_cases_smoothed, String total_deaths, String new_deaths, String new_deaths_smoothed, String total_cases_per_million, String new_cases_per_million, String new_cases_smoothed_per_million, String total_deaths_per_million, String new_deaths_per_million, String new_deaths_smoothed_per_million, String reproduction_rate, String icu_patients, String icu_patients_per_million, String hosp_patients, String hosp_patients_per_million, String weekly_icu_admissions, String weekly_icu_admissions_per_million, String weekly_hosp_admissions, String weekly_hosp_admissions_per_million, String new_tests, String total_tests, String total_tests_per_thousand, String new_tests_per_thousand, String new_tests_smoothed, String new_tests_smoothed_per_thousand, String positive_rate, String tests_per_case, String tests_units, String total_vaccinations, String people_vaccinated, String people_fully_vaccinated, String new_vaccinations, String new_vaccinations_smoothed, String total_vaccinations_per_hundred, String people_vaccinated_per_hundred, String people_fully_vaccinated_per_hundred, String new_vaccinations_smoothed_per_million, String stringency_index, String population, String population_density, String median_age, String aged_65_older, String aged_70_older, String gdp_per_capita, String extreme_poverty, String cardiovasc_death_rate, String diabetes_prevalence, String female_smokers, String male_smokers, String handwashing_facilities, String hospital_beds_per_thousand, String life_expectancy, String human_development_index, String excess_mortality) {
        this.id = id;
        this.iso_code = iso_code;
        this.continent = continent;
        this.location = location;
        this.date = date;
        this.total_cases = total_cases;
        this.new_cases = new_cases;
        this.new_cases_smoothed = new_cases_smoothed;
        this.total_deaths = total_deaths;
        this.new_deaths = new_deaths;
        this.new_deaths_smoothed = new_deaths_smoothed;
        this.total_cases_per_million = total_cases_per_million;
        this.new_cases_per_million = new_cases_per_million;
        this.new_cases_smoothed_per_million = new_cases_smoothed_per_million;
        this.total_deaths_per_million = total_deaths_per_million;
        this.new_deaths_per_million = new_deaths_per_million;
        this.new_deaths_smoothed_per_million = new_deaths_smoothed_per_million;
        this.reproduction_rate = reproduction_rate;
        this.icu_patients = icu_patients;
        this.icu_patients_per_million = icu_patients_per_million;
        this.hosp_patients = hosp_patients;
        this.hosp_patients_per_million = hosp_patients_per_million;
        this.weekly_icu_admissions = weekly_icu_admissions;
        this.weekly_icu_admissions_per_million = weekly_icu_admissions_per_million;
        this.weekly_hosp_admissions = weekly_hosp_admissions;
        this.weekly_hosp_admissions_per_million = weekly_hosp_admissions_per_million;
        this.new_tests = new_tests;
        this.total_tests = total_tests;
        this.total_tests_per_thousand = total_tests_per_thousand;
        this.new_tests_per_thousand = new_tests_per_thousand;
        this.new_tests_smoothed = new_tests_smoothed;
        this.new_tests_smoothed_per_thousand = new_tests_smoothed_per_thousand;
        this.positive_rate = positive_rate;
        this.tests_per_case = tests_per_case;
        this.tests_units = tests_units;
        this.total_vaccinations = total_vaccinations;
        this.people_vaccinated = people_vaccinated;
        this.people_fully_vaccinated = people_fully_vaccinated;
        this.new_vaccinations = new_vaccinations;
        this.new_vaccinations_smoothed = new_vaccinations_smoothed;
        this.total_vaccinations_per_hundred = total_vaccinations_per_hundred;
        this.people_vaccinated_per_hundred = people_vaccinated_per_hundred;
        this.people_fully_vaccinated_per_hundred = people_fully_vaccinated_per_hundred;
        this.new_vaccinations_smoothed_per_million = new_vaccinations_smoothed_per_million;
        this.stringency_index = stringency_index;
        this.population = population;
        this.population_density = population_density;
        this.median_age = median_age;
        this.aged_65_older = aged_65_older;
        this.aged_70_older = aged_70_older;
        this.gdp_per_capita = gdp_per_capita;
        this.extreme_poverty = extreme_poverty;
        this.cardiovasc_death_rate = cardiovasc_death_rate;
        this.diabetes_prevalence = diabetes_prevalence;
        this.female_smokers = female_smokers;
        this.male_smokers = male_smokers;
        this.handwashing_facilities = handwashing_facilities;
        this.hospital_beds_per_thousand = hospital_beds_per_thousand;
        this.life_expectancy = life_expectancy;
        this.human_development_index = human_development_index;
        this.excess_mortality = excess_mortality;
    }

    public String getExcess_mortality() {
        return excess_mortality;
    }

    public void setExcess_mortality(String excess_mortality) {
        this.excess_mortality = excess_mortality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIso_code() {
        return iso_code;
    }

    public void setIso_code(String iso_code) {
        this.iso_code = iso_code;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal_cases() {
        return total_cases;
    }

    public void setTotal_cases(String total_cases) {
        this.total_cases = total_cases;
    }

    public String getNew_cases() {
        return new_cases;
    }

    public void setNew_cases(String new_cases) {
        this.new_cases = new_cases;
    }

    public String getNew_cases_smoothed() {
        return new_cases_smoothed;
    }

    public void setNew_cases_smoothed(String new_cases_smoothed) {
        this.new_cases_smoothed = new_cases_smoothed;
    }

    public String getTotal_deaths() {
        return total_deaths;
    }

    public void setTotal_deaths(String total_deaths) {
        this.total_deaths = total_deaths;
    }

    public String getNew_deaths() {
        return new_deaths;
    }

    public void setNew_deaths(String new_deaths) {
        this.new_deaths = new_deaths;
    }

    public String getNew_deaths_smoothed() {
        return new_deaths_smoothed;
    }

    public void setNew_deaths_smoothed(String new_deaths_smoothed) {
        this.new_deaths_smoothed = new_deaths_smoothed;
    }

    public String getTotal_cases_per_million() {
        return total_cases_per_million;
    }

    public void setTotal_cases_per_million(String total_cases_per_million) {
        this.total_cases_per_million = total_cases_per_million;
    }

    public String getNew_cases_per_million() {
        return new_cases_per_million;
    }

    public void setNew_cases_per_million(String new_cases_per_million) {
        this.new_cases_per_million = new_cases_per_million;
    }

    public String getNew_cases_smoothed_per_million() {
        return new_cases_smoothed_per_million;
    }

    public void setNew_cases_smoothed_per_million(String new_cases_smoothed_per_million) {
        this.new_cases_smoothed_per_million = new_cases_smoothed_per_million;
    }

    public String getTotal_deaths_per_million() {
        return total_deaths_per_million;
    }

    public void setTotal_deaths_per_million(String total_deaths_per_million) {
        this.total_deaths_per_million = total_deaths_per_million;
    }

    public String getNew_deaths_per_million() {
        return new_deaths_per_million;
    }

    public void setNew_deaths_per_million(String new_deaths_per_million) {
        this.new_deaths_per_million = new_deaths_per_million;
    }

    public String getNew_deaths_smoothed_per_million() {
        return new_deaths_smoothed_per_million;
    }

    public void setNew_deaths_smoothed_per_million(String new_deaths_smoothed_per_million) {
        this.new_deaths_smoothed_per_million = new_deaths_smoothed_per_million;
    }

    public String getReproduction_rate() {
        return reproduction_rate;
    }

    public void setReproduction_rate(String reproduction_rate) {
        this.reproduction_rate = reproduction_rate;
    }

    public String getIcu_patients() {
        return icu_patients;
    }

    public void setIcu_patients(String icu_patients) {
        this.icu_patients = icu_patients;
    }

    public String getIcu_patients_per_million() {
        return icu_patients_per_million;
    }

    public void setIcu_patients_per_million(String icu_patients_per_million) {
        this.icu_patients_per_million = icu_patients_per_million;
    }

    public String getHosp_patients() {
        return hosp_patients;
    }

    public void setHosp_patients(String hosp_patients) {
        this.hosp_patients = hosp_patients;
    }

    public String getHosp_patients_per_million() {
        return hosp_patients_per_million;
    }

    public void setHosp_patients_per_million(String hosp_patients_per_million) {
        this.hosp_patients_per_million = hosp_patients_per_million;
    }

    public String getWeekly_icu_admissions() {
        return weekly_icu_admissions;
    }

    public void setWeekly_icu_admissions(String weekly_icu_admissions) {
        this.weekly_icu_admissions = weekly_icu_admissions;
    }

    public String getWeekly_icu_admissions_per_million() {
        return weekly_icu_admissions_per_million;
    }

    public void setWeekly_icu_admissions_per_million(String weekly_icu_admissions_per_million) {
        this.weekly_icu_admissions_per_million = weekly_icu_admissions_per_million;
    }

    public String getWeekly_hosp_admissions() {
        return weekly_hosp_admissions;
    }

    public void setWeekly_hosp_admissions(String weekly_hosp_admissions) {
        this.weekly_hosp_admissions = weekly_hosp_admissions;
    }

    public String getWeekly_hosp_admissions_per_million() {
        return weekly_hosp_admissions_per_million;
    }

    public void setWeekly_hosp_admissions_per_million(String weekly_hosp_admissions_per_million) {
        this.weekly_hosp_admissions_per_million = weekly_hosp_admissions_per_million;
    }

    public String getNew_tests() {
        return new_tests;
    }

    public void setNew_tests(String new_tests) {
        this.new_tests = new_tests;
    }

    public String getTotal_tests() {
        return total_tests;
    }

    public void setTotal_tests(String total_tests) {
        this.total_tests = total_tests;
    }

    public String getTotal_tests_per_thousand() {
        return total_tests_per_thousand;
    }

    public void setTotal_tests_per_thousand(String total_tests_per_thousand) {
        this.total_tests_per_thousand = total_tests_per_thousand;
    }

    public String getNew_tests_per_thousand() {
        return new_tests_per_thousand;
    }

    public void setNew_tests_per_thousand(String new_tests_per_thousand) {
        this.new_tests_per_thousand = new_tests_per_thousand;
    }

    public String getNew_tests_smoothed() {
        return new_tests_smoothed;
    }

    public void setNew_tests_smoothed(String new_tests_smoothed) {
        this.new_tests_smoothed = new_tests_smoothed;
    }

    public String getNew_tests_smoothed_per_thousand() {
        return new_tests_smoothed_per_thousand;
    }

    public void setNew_tests_smoothed_per_thousand(String new_tests_smoothed_per_thousand) {
        this.new_tests_smoothed_per_thousand = new_tests_smoothed_per_thousand;
    }

    public String getPositive_rate() {
        return positive_rate;
    }

    public void setPositive_rate(String positive_rate) {
        this.positive_rate = positive_rate;
    }

    public String getTests_per_case() {
        return tests_per_case;
    }

    public void setTests_per_case(String tests_per_case) {
        this.tests_per_case = tests_per_case;
    }

    public String getTests_units() {
        return tests_units;
    }

    public void setTests_units(String tests_units) {
        this.tests_units = tests_units;
    }

    public String getTotal_vaccinations() {
        return total_vaccinations;
    }

    public void setTotal_vaccinations(String total_vaccinations) {
        this.total_vaccinations = total_vaccinations;
    }

    public String getPeople_vaccinated() {
        return people_vaccinated;
    }

    public void setPeople_vaccinated(String people_vaccinated) {
        this.people_vaccinated = people_vaccinated;
    }

    public String getPeople_fully_vaccinated() {
        return people_fully_vaccinated;
    }

    public void setPeople_fully_vaccinated(String people_fully_vaccinated) {
        this.people_fully_vaccinated = people_fully_vaccinated;
    }

    public String getNew_vaccinations() {
        return new_vaccinations;
    }

    public void setNew_vaccinations(String new_vaccinations) {
        this.new_vaccinations = new_vaccinations;
    }

    public String getNew_vaccinations_smoothed() {
        return new_vaccinations_smoothed;
    }

    public void setNew_vaccinations_smoothed(String new_vaccinations_smoothed) {
        this.new_vaccinations_smoothed = new_vaccinations_smoothed;
    }

    public String getTotal_vaccinations_per_hundred() {
        return total_vaccinations_per_hundred;
    }

    public void setTotal_vaccinations_per_hundred(String total_vaccinations_per_hundred) {
        this.total_vaccinations_per_hundred = total_vaccinations_per_hundred;
    }

    public String getPeople_vaccinated_per_hundred() {
        return people_vaccinated_per_hundred;
    }

    public void setPeople_vaccinated_per_hundred(String people_vaccinated_per_hundred) {
        this.people_vaccinated_per_hundred = people_vaccinated_per_hundred;
    }

    public String getPeople_fully_vaccinated_per_hundred() {
        return people_fully_vaccinated_per_hundred;
    }

    public void setPeople_fully_vaccinated_per_hundred(String people_fully_vaccinated_per_hundred) {
        this.people_fully_vaccinated_per_hundred = people_fully_vaccinated_per_hundred;
    }

    public String getNew_vaccinations_smoothed_per_million() {
        return new_vaccinations_smoothed_per_million;
    }

    public void setNew_vaccinations_smoothed_per_million(String new_vaccinations_smoothed_per_million) {
        this.new_vaccinations_smoothed_per_million = new_vaccinations_smoothed_per_million;
    }

    public String getStringency_index() {
        return stringency_index;
    }

    public void setStringency_index(String stringency_index) {
        this.stringency_index = stringency_index;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPopulation_density() {
        return population_density;
    }

    public void setPopulation_density(String population_density) {
        this.population_density = population_density;
    }

    public String getMedian_age() {
        return median_age;
    }

    public void setMedian_age(String median_age) {
        this.median_age = median_age;
    }

    public String getAged_65_older() {
        return aged_65_older;
    }

    public void setAged_65_older(String aged_65_older) {
        this.aged_65_older = aged_65_older;
    }

    public String getAged_70_older() {
        return aged_70_older;
    }

    public void setAged_70_older(String aged_70_older) {
        this.aged_70_older = aged_70_older;
    }

    public String getGdp_per_capita() {
        return gdp_per_capita;
    }

    public void setGdp_per_capita(String gdp_per_capita) {
        this.gdp_per_capita = gdp_per_capita;
    }

    public String getExtreme_poverty() {
        return extreme_poverty;
    }

    public void setExtreme_poverty(String extreme_poverty) {
        this.extreme_poverty = extreme_poverty;
    }

    public String getCardiovasc_death_rate() {
        return cardiovasc_death_rate;
    }

    public void setCardiovasc_death_rate(String cardiovasc_death_rate) {
        this.cardiovasc_death_rate = cardiovasc_death_rate;
    }

    public String getDiabetes_prevalence() {
        return diabetes_prevalence;
    }

    public void setDiabetes_prevalence(String diabetes_prevalence) {
        this.diabetes_prevalence = diabetes_prevalence;
    }

    public String getFemale_smokers() {
        return female_smokers;
    }

    public void setFemale_smokers(String female_smokers) {
        this.female_smokers = female_smokers;
    }

    public String getMale_smokers() {
        return male_smokers;
    }

    public void setMale_smokers(String male_smokers) {
        this.male_smokers = male_smokers;
    }

    public String getHandwashing_facilities() {
        return handwashing_facilities;
    }

    public void setHandwashing_facilities(String handwashing_facilities) {
        this.handwashing_facilities = handwashing_facilities;
    }

    public String getHospital_beds_per_thousand() {
        return hospital_beds_per_thousand;
    }

    public void setHospital_beds_per_thousand(String hospital_beds_per_thousand) {
        this.hospital_beds_per_thousand = hospital_beds_per_thousand;
    }

    public String getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(String life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public String getHuman_development_index() {
        return human_development_index;
    }

    public void setHuman_development_index(String human_development_index) {
        this.human_development_index = human_development_index;
    }
}
