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

    @Query("select c from Covid c where c.date=(select max(c.date) from Covid c) and c.location=:name")
    Covid getAllMostRecentData(@Param("name") String name);

    @Query("select distinct c.date from Covid c where c.date=(select max(c.date) from Covid c)")
    LocalDate getLatestDate();

    @Query("select distinct c.date from Covid c")
    List<LocalDate> getListOfDates();

    @Query("select c from Covid c where c.date=:date")
    List<Covid> getDataFromSelectedDate(@Param("date") LocalDate date);

    @Query("select sum(c.newCases) from Covid c where c.date=:date")
    Integer getSumOfNewCasesAllCountries(@Param("date") LocalDate date);

    @Query("select sum(c.totalCases) from Covid c where c.date=:date")
    Integer getSumOfTotalCasesAllCountries(@Param("date") LocalDate date);

//    @Query("select sum(c.newCases) from Covid c")
//    Integer getSumOfTotalCasesAllCountriesToDate();

    @Query("select sum(c.totalDeaths) from Covid c where c.date=:date")
    Integer getSumOfTotalDeathsAllCountries(@Param("date") LocalDate date);

}
