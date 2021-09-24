package com.demo.calculator.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.calculator.api.model.Calculator;
import com.demo.calculator.api.service.CalculatorService;

@Controller
@RequestMapping("/calculator")
public class CalculatorResource {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@PostMapping("/")
	public  @ResponseBody  Calculator operation(@RequestBody Calculator calculator) {
		/*  Since JAVAEE is not present we cant retrun the MODEL AND VIEW in jsp.
		 * so we are returing it to POSTMAN or other web clients
		ModelAndView mv = new ModelAndView();
		mv.addObject(calculatorService.operation(calculator));
		mv.setViewName("/result");*/
		return calculatorService.operation(calculator);
	}

}
