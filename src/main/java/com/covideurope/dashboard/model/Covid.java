package com.covideurope.dashboard.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Covid {

    @Id
    private Long id;
    private String continent;
    private String location;
    private LocalDate date;
    private Integer totalCases;
    private Integer newCases;
    private Integer totalDeaths;
    private Integer newDeaths;
    private Integer icuPatients;
    private Integer hospPatients;
    private Double weeklyIcuAdmissions;
    private Double weeklyHospAdmissions;
    private Double positiveRate;
    private Integer peopleVaccinated;
    private Integer peopleFullyVaccinated;
    private Integer newVaccinations;
    private Double totalVaccinationsPerHundred;
    private Double peopleVaccinatedPerHundred;
    private Double peopleFullyVaccinatedPerHundred;
    private Integer population;

    public Covid() {
    }

    public Covid(Long id, String continent, String location, LocalDate date, Integer totalCases, Integer newCases, Integer totalDeaths, Integer newDeaths, Integer icuPatients, Integer hospPatients, Double weeklyIcuAdmissions, Double weeklyHospAdmissions, Double positiveRate, Integer peopleVaccinated, Integer peopleFullyVaccinated, Integer newVaccinations, Double totalVaccinationsPerHundred, Double peopleVaccinatedPerHundred, Double peopleFullyVaccinatedPerHundred, Integer population) {
        this.id = id;
        this.continent = continent;
        this.location = location;
        this.date = date;
        this.totalCases = totalCases;
        this.newCases = newCases;
        this.totalDeaths = totalDeaths;
        this.newDeaths = newDeaths;
        this.icuPatients = icuPatients;
        this.hospPatients = hospPatients;
        this.weeklyIcuAdmissions = weeklyIcuAdmissions;
        this.weeklyHospAdmissions = weeklyHospAdmissions;
        this.positiveRate = positiveRate;
        this.peopleVaccinated = peopleVaccinated;
        this.peopleFullyVaccinated = peopleFullyVaccinated;
        this.newVaccinations = newVaccinations;
        this.totalVaccinationsPerHundred = totalVaccinationsPerHundred;
        this.peopleVaccinatedPerHundred = peopleVaccinatedPerHundred;
        this.peopleFullyVaccinatedPerHundred = peopleFullyVaccinatedPerHundred;
        this.population = population;
    }

    public Covid(LocalDate date, Integer totalCases, Integer newCases) {
        this.date = date;
        this.totalCases = totalCases;
        this.newCases = newCases;
    }

    public Covid(LocalDate date, Integer totalCases, Integer newCases, Integer totalDeaths, Integer newDeaths, Integer icuPatients, Integer hospPatients, Integer peopleVaccinated, Integer peopleFullyVaccinated, Integer newVaccinations, Double peopleVaccinatedPerHundred) {
        this.date = date;
        this.totalCases = totalCases;
        this.newCases = newCases;
        this.totalDeaths = totalDeaths;
        this.newDeaths = newDeaths;
        this.icuPatients = icuPatients;
        this.hospPatients = hospPatients;
        this.peopleVaccinated = peopleVaccinated;
        this.peopleFullyVaccinated = peopleFullyVaccinated;
        this.newVaccinations = newVaccinations;
        this.peopleVaccinatedPerHundred = peopleVaccinatedPerHundred;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Integer totalCases) {
        this.totalCases = totalCases;
    }

    public Integer getNewCases() {
        return newCases;
    }

    public void setNewCases(Integer newCases) {
        this.newCases = newCases;
    }

    public Integer getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(Integer totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public Integer getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(Integer newDeaths) {
        this.newDeaths = newDeaths;
    }

    public Integer getIcuPatients() {
        return icuPatients;
    }

    public void setIcuPatients(Integer icuPatients) {
        this.icuPatients = icuPatients;
    }

    public Integer getHospPatients() {
        return hospPatients;
    }

    public void setHospPatients(Integer hospPatients) {
        this.hospPatients = hospPatients;
    }

    public Double getWeeklyIcuAdmissions() {
        return weeklyIcuAdmissions;
    }

    public void setWeeklyIcuAdmissions(Double weeklyIcuAdmissions) {
        this.weeklyIcuAdmissions = weeklyIcuAdmissions;
    }

    public Double getWeeklyHospAdmissions() {
        return weeklyHospAdmissions;
    }

    public void setWeeklyHospAdmissions(Double weeklyHospAdmissions) {
        this.weeklyHospAdmissions = weeklyHospAdmissions;
    }

    public Double getPositiveRate() {
        return positiveRate;
    }

    public void setPositiveRate(Double positiveRate) {
        this.positiveRate = positiveRate;
    }

    public Integer getPeopleVaccinated() {
        return peopleVaccinated;
    }

    public void setPeopleVaccinated(Integer peopleVaccinated) {
        this.peopleVaccinated = peopleVaccinated;
    }

    public Integer getPeopleFullyVaccinated() {
        return peopleFullyVaccinated;
    }

    public void setPeopleFullyVaccinated(Integer peopleFullyVaccinated) {
        this.peopleFullyVaccinated = peopleFullyVaccinated;
    }

    public Integer getNewVaccinations() {
        return newVaccinations;
    }

    public void setNewVaccinations(Integer newVaccinations) {
        this.newVaccinations = newVaccinations;
    }

    public Double getTotalVaccinationsPerHundred() {
        return totalVaccinationsPerHundred;
    }

    public void setTotalVaccinationsPerHundred(Double totalVaccinationsPerHundred) {
        this.totalVaccinationsPerHundred = totalVaccinationsPerHundred;
    }

    public Double getPeopleVaccinatedPerHundred() {
        return peopleVaccinatedPerHundred;
    }

    public void setPeopleVaccinatedPerHundred(Double peopleVaccinatedPerHundred) {
        this.peopleVaccinatedPerHundred = peopleVaccinatedPerHundred;
    }

    public Double getPeopleFullyVaccinatedPerHundred() {
        return peopleFullyVaccinatedPerHundred;
    }

    public void setPeopleFullyVaccinatedPerHundred(Double peopleFullyVaccinatedPerHundred) {
        this.peopleFullyVaccinatedPerHundred = peopleFullyVaccinatedPerHundred;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}