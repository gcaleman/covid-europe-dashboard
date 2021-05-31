package com.covideurope.dashboard.controller;

import com.covideurope.dashboard.data.CovidInput;
import com.covideurope.dashboard.model.Country;
import com.covideurope.dashboard.model.Covid;
import com.covideurope.dashboard.service.DashboardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
public class DashboardController {

    private DashboardService service;

    public DashboardController(DashboardService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Void> getRoot() {
        return new ResponseEntity<>(HttpStatus.OK);
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
