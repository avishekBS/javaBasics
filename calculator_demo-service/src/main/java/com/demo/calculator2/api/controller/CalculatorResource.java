package com.demo.calculator2.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.calculator2.api.model.Calculator;
import com.demo.calculator2.api.service.CalculatorService;

@Controller
@RequestMapping("/calculatorService")
public class CalculatorResource {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@GetMapping("/{id}")
	public  @ResponseBody  Calculator getOperationById(@PathVariable("id") int id) {
		System.out.println("request received at calculator2 getOperationById()");
		return calculatorService.getOperationById(id);
	}

}
