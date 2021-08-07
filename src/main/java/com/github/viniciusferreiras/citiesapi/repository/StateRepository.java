package com.github.viniciusferreiras.citiesapi.repository;

import com.github.viniciusferreiras.citiesapi.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
