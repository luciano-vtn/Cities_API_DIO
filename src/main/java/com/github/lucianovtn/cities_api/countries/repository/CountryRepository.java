package com.github.lucianovtn.cities_api.countries.repository;

import com.github.lucianovtn.cities_api.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
