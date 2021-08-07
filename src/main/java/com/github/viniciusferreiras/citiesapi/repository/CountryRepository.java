package com.github.viniciusferreiras.citiesapi.repository;

import com.github.viniciusferreiras.citiesapi.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
