package com.demo.calculator2.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.calculator2.api.model.Calculator;
import com.demo.calculator2.api.repository.CalculatorRepository;


@Service
public class CalculatorService {
	
	@Autowired
	private CalculatorRepository calculatorRepository;

	public Calculator getOperationById(int id) {
		Calculator calculator = (Calculator)calculatorRepository.findById(id).orElse(null);
		return calculator;
	}

}
