package com.covideurope.dashboard.dataProcessing;

import com.covideurope.dashboard.data.CovidInput;
import com.covideurope.dashboard.model.Covid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class CovidItemProcessor implements ItemProcessor<CovidInput, Covid> {

    private static final Logger log = LoggerFactory.getLogger(CovidItemProcessor.class);

    @Override
    public Covid process(final CovidInput covidInput) throws Exception {

        Covid covid = new Covid();
        covid.setId(Long.parseLong(covidInput.getId()));
        covid.setLocation(covidInput.getLocation());
        covid.setContinent(covidInput.getContinent());
        covid.setDate(LocalDate.parse(covidInput.getDate()));
        covid.setTotalCases(Integer.parseInt(covidInput.getTotal_cases()));
        covid.setNewCases(Integer.parseInt(covidInput.getNew_cases()));
        covid.setTotalDeaths(Integer.parseInt(covidInput.getTotal_deaths()));
        covid.setNewDeaths(Integer.parseInt(covidInput.getNew_deaths()));
        covid.setIcuPatients(Integer.parseInt(covidInput.getIcu_patients()));
        covid.setHospPatients(Integer.parseInt(covidInput.getHosp_patients()));
        covid.setWeeklyIcuAdmissions(Double.parseDouble(covidInput.getWeekly_icu_admissions()));
        covid.setWeeklyHospAdmissions(Double.parseDouble(covidInput.getWeekly_hosp_admissions()));
        covid.setPositiveRate(Double.parseDouble(covidInput.getPositive_rate()));
        covid.setPeopleVaccinated(Integer.parseInt(covidInput.getPeople_vaccinated()));
        covid.setPeopleFullyVaccinated(Integer.parseInt(covidInput.getPeople_fully_vaccinated()));
        covid.setNewVaccinations(Integer.parseInt(covidInput.getNew_vaccinations()));
        covid.setTotalVaccinationsPerHundred(Double.parseDouble(covidInput.getTotal_vaccinations_per_hundred()));
        covid.setPopulation(Integer.parseInt(covidInput.getPopulation()));

        return covid;
    }

}
