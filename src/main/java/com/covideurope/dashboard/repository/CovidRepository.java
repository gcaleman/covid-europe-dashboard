package com.covideurope.dashboard.repository;

import com.covideurope.dashboard.model.Covid;
import org.apache.tomcat.jni.Local;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CovidRepository extends CrudRepository<Covid, Long> {

    List<Covid> getByLocationOrderByDateAsc(String countryName);

    @Query("select distinct c.date from Covid c")
    List<LocalDate> getListOfDates();

    @Query("select sum(c.newCases) from Covid c where c.date=:date and c.continent='Europe'")
    Integer getSumOfNewCasesAllCountries(@Param("date") LocalDate date);

    @Query("select sum(c.totalCases) from Covid c where c.date=:date and c.continent='Europe'")
    Integer getSumOfTotalCasesAllCountries(@Param("date") LocalDate date);

    @Query("select sum(c.totalDeaths) from Covid c where c.date=:date and c.continent='Europe'")
    Integer getSumOfTotalDeathsAllCountries(@Param("date") LocalDate date);

    @Query("select sum(c.newDeaths) from Covid c where c.date=:date and c.continent='Europe'")
    Integer getSumOfNewDeathsAllCountries(@Param("date") LocalDate date);

    @Query("select sum(c.icuPatients) from Covid c where c.date=:date and c.continent='Europe'")
    Integer getSumOfIcuPatientsAllCountries(@Param("date") LocalDate date);

    @Query("select sum(c.hospPatients) from Covid c where c.date=:date and c.continent='Europe'")
    Integer getSumOfHospPatientsAllCountries(@Param("date") LocalDate date);

    @Query("select sum(c.peopleVaccinated) from Covid c where c.date=:date and c.continent='Europe'")
    Integer getSumOfPeopleVaccinatedAllCountries(@Param("date") LocalDate date);

    @Query("select sum(c.peopleFullyVaccinated) from Covid c where c.date=:date and c.continent='Europe'")
    Integer getSumOfPeopleFullyVaccinatedAllCountries(@Param("date") LocalDate date);

    @Query("select sum(c.newVaccinations) from Covid c where c.date=:date and c.continent='Europe'")
    Integer getSumOfNewVaccinationsAllCountries(@Param("date") LocalDate date);

    @Query("select avg(c.peopleVaccinatedPerHundred) from Covid c where c.date=:date and c.continent='Europe'")
    Double getSumOfPeopleVaccinatedPerHundredAllCountries(@Param("date") LocalDate date);


}
