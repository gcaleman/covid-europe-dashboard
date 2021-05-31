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

    public List<LocalDate> getListOfDates() {
        return covidRepository.getListOfDates();
    }

    public LocalDate getLatestDateWithData() {
        return getListOfDates().get(getListOfDates().size() - 1);
    }

    public List<Covid> getDataFromStartToRecentAllCountries() {
        List<Covid> dataFromAllOnDates = new ArrayList<>();
        List<LocalDate> listOfDates = getListOfDates();

        for (int i = 0; i < listOfDates.size() - 2; i = i + 11) {
            Integer newCases = covidRepository.getSumOfNewCasesAllCountries(listOfDates.get(i));
            Integer totalCases = covidRepository.getSumOfTotalCasesAllCountries(listOfDates.get(i));
            Integer totalDeaths = covidRepository.getSumOfTotalDeathsAllCountries(listOfDates.get(i));
            Integer newDeaths = covidRepository.getSumOfNewDeathsAllCountries(listOfDates.get(i));
            Integer icuPatients = covidRepository.getSumOfIcuPatientsAllCountries(listOfDates.get(i));
            Integer hospPatients = covidRepository.getSumOfHospPatientsAllCountries(listOfDates.get(i));
            Integer peopleVac = covidRepository.getSumOfPeopleVaccinatedAllCountries(listOfDates.get(i));
            Integer peopleFullyVac = covidRepository.getSumOfPeopleFullyVaccinatedAllCountries(listOfDates.get(i));
            Integer newVaccination = covidRepository.getSumOfNewVaccinationsAllCountries(listOfDates.get(i));
            Double peopleVaccinatedPerHundred = covidRepository.getSumOfPeopleVaccinatedPerHundredAllCountries(listOfDates.get(i));

            dataFromAllOnDates.add(new Covid(listOfDates.get(i), totalCases,
                    newCases, totalDeaths, newDeaths, icuPatients, hospPatients, peopleVac, peopleFullyVac, newVaccination, peopleVaccinatedPerHundred));
        }

        if (!dataFromAllOnDates.contains(getLatestDateWithData())) {

            Integer newCases = covidRepository.getSumOfNewCasesAllCountries(getLatestDateWithData());
            Integer totalCases = covidRepository.getSumOfTotalCasesAllCountries(getLatestDateWithData());
            Integer totalDeaths = covidRepository.getSumOfTotalDeathsAllCountries(getLatestDateWithData());
            Integer newDeaths = covidRepository.getSumOfNewDeathsAllCountries(getLatestDateWithData());
            Integer icuPatients = covidRepository.getSumOfIcuPatientsAllCountries(getLatestDateWithData());
            Integer hospPatients = covidRepository.getSumOfHospPatientsAllCountries(getLatestDateWithData());
            Integer peopleVac = covidRepository.getSumOfPeopleVaccinatedAllCountries(getLatestDateWithData());
            Integer peopleFullyVac = covidRepository.getSumOfPeopleFullyVaccinatedAllCountries(getLatestDateWithData());
            Integer newVaccination = covidRepository.getSumOfNewVaccinationsAllCountries(getLatestDateWithData());
            Double peopleVaccinatedPerHundred = covidRepository.getSumOfPeopleVaccinatedPerHundredAllCountries(getLatestDateWithData());

            dataFromAllOnDates.add(new Covid(getLatestDateWithData(), totalCases,
                    newCases, totalDeaths, newDeaths, icuPatients, hospPatients, peopleVac, peopleFullyVac, newVaccination, peopleVaccinatedPerHundred));

        }

        return dataFromAllOnDates;
    }

}
