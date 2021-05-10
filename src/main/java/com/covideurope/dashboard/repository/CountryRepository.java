package com.covideurope.dashboard.repository;

import com.covideurope.dashboard.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

    Country getByCountryName(String name);

}
