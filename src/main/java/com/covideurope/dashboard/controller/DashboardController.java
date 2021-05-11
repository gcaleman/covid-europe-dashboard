package com.covideurope.dashboard.controller;

import com.covideurope.dashboard.data.CovidInput;
import com.covideurope.dashboard.model.Country;
import com.covideurope.dashboard.model.Covid;
import com.covideurope.dashboard.service.DashboardService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
public class DashboardController {

    private DashboardService service;

    public DashboardController(DashboardService service) {
        this.service = service;
    }

    @GetMapping("/country/{name}")
    public Country getCovidCasesByCountry(@PathVariable String name) {
        return service.getCountryDataByName(name);
    }

    @GetMapping("/countries")
    public List<String> getListCountries() {
        return service.getAllCountriesNames();
    }

    @GetMapping("/all-from-initial-date")
    public List<Covid> getAllDataFromDates() {
        return service.getDataFromStartToRecentAllCountries();
    }

}
