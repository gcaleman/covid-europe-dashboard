package com.covideurope.dashboard.service;

import com.covideurope.dashboard.model.Country;
import com.covideurope.dashboard.model.Covid;
import com.covideurope.dashboard.repository.CountryRepository;
import com.covideurope.dashboard.repository.CovidRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DashboardService {

    private CountryRepository countryRepository;
    private CovidRepository covidRepository;

    public DashboardService(CountryRepository countryRepository, CovidRepository covidRepository) {
        this.countryRepository = countryRepository;
        this.covidRepository = covidRepository;
    }


    public Country getCountryDataByName(String name) {
        Country country = countryRepository.getByCountryName(name);
        country.setCovidCases(covidRepository.getByLocationOrderByDateAsc(name));
        return country;
    }

    public List<String> getAllCountriesNames() {
        List<String> countriesName = new ArrayList<>();
        List<String> sortedNames;
        countryRepository.findAll().forEach(country -> {
            countriesName.add(country.getCountryName());
        });
        sortedNames = countriesName.stream().sorted().collect(Collectors.toList());
        return (sortedNames);
    }

    public List<Covid> getAllCovidData() {
        return (List<Covid>) covidRepository.findAll();
    }

    public LocalDate getLatestDateWithData() {
        return covidRepository.getLatestDate();
    }

    public List<LocalDate> getListOfDates() {
        return covidRepository.getListOfDates();
    }

    public List<Covid> getDataFromStartToRecentAllCountries() {
        List<Covid> dataFromAllOnDates = new ArrayList<>();
        List<LocalDate> listOfDates = getListOfDates();

        for (int i = 0; i < listOfDates.size(); i = i + 26) {
            covidRepository.getSumOfNewCasesAllCountries(listOfDates.get(i));
            covidRepository.getSumOfTotalCasesAllCountries(listOfDates.get(i));
            dataFromAllOnDates.add(new Covid(listOfDates.get(i), covidRepository.getSumOfTotalCasesAllCountries(listOfDates.get(i)),
                    covidRepository.getSumOfNewCasesAllCountries(listOfDates.get(i))));
        }

        if (!dataFromAllOnDates.contains(getLatestDateWithData()))
            dataFromAllOnDates.add(new Covid(getLatestDateWithData(), covidRepository.getSumOfTotalCasesAllCountries(getLatestDateWithData()), covidRepository.getSumOfNewCasesAllCountries(getLatestDateWithData())));

        return dataFromAllOnDates;
    }

}
