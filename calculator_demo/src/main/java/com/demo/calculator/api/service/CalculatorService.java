package com.demo.calculator.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.calculator.api.model.Calculator;
import com.demo.calculator.api.repository.CalculatorRepository;

@Service
public class CalculatorService {
	
	@Autowired
	private CalculatorRepository calculatorRepository;

	public Calculator operation(Calculator calculator) {
		
		if (!calculator.getOperation().isEmpty()) {
			if("addition".equalsIgnoreCase(calculator.getOperation()))
				calculator.setResult(calculator.getNum1() + calculator.getNum2());
			else if ("substraction".equalsIgnoreCase(calculator.getOperation()))
				calculator.setResult(calculator.getNum1() - calculator.getNum2());
			else if ("multiplication".equalsIgnoreCase(calculator.getOperation()))
				calculator.setResult(calculator.getNum1() * calculator.getNum2());
			else if (("division".equalsIgnoreCase(calculator.getOperation())))
				calculator.setResult(calculator.getNum1() / calculator.getNum2());
			return calculatorRepository.save(calculator);
		}
		calculator.setOperation("Not performed as key needs to be addition/ substraction/ multiplication/ division");
		return calculator;
	}

}
