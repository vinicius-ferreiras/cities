package com.github.viniciusferreiras.citiesapi.controller;

import java.util.List;

import com.github.viniciusferreiras.citiesapi.model.State;
import com.github.viniciusferreiras.citiesapi.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}