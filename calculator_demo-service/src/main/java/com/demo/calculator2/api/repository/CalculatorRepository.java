package com.demo.calculator2.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.calculator2.api.model.Calculator;


public interface CalculatorRepository extends CrudRepository<Calculator, Integer>{
}
