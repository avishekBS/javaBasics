package com.learning.webservice.client.main;

import com.learning.webservice.client.stub.CalculatorFunctions;
import com.learning.webservice.client.stub.CalculatorImplService;

public class MyCompanyExecution {

	public static void main(String[] args) {
		CalculatorImplService service = new CalculatorImplService();
		CalculatorFunctions implPortBinding = service.getCalculatorImplPort();
		int add = implPortBinding.add(1, 1);
		System.out.println("Addition value:"+add);
	}
}
