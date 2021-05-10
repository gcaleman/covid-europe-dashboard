package com.covideurope.dashboard.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String countryName;
    private String continent;
    private Integer population;
    private Integer totalCases;
    @Transient
    private List<Covid> covidCases;

    public Country(Long id, String countryName, String continent, Integer population, Integer totalCases, List<Covid> covidCases) {
        this.id = id;
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
        this.totalCases = totalCases;
        this.covidCases = covidCases;
    }

    public Country(String countryName, String continent, Integer population, Integer totalCases) {
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
        this.totalCases = totalCases;
    }

    public Country(String countryName, String continent, Integer population) {
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
    }

    public Country(String countryName, Integer totalCases) {
        this.countryName = countryName;
        this.totalCases = totalCases;
    }

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country() {
    }

    public List<Covid> getCovidCases() {
        return covidCases;
    }

    public void setCovidCases(List<Covid> covidCases) {
        this.covidCases = covidCases;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Integer totalCases) {
        this.totalCases = totalCases;
    }

}
