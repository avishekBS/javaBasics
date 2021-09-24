package com.demo.calculator.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.calculator.api.model.Calculator;

public interface CalculatorRepository extends CrudRepository<Calculator, Integer>{
}
