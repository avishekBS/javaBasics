package com.learnings.javax.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class HelloSoapWS {
	@WebMethod
	public ArrayList<String> getNames() {
		ArrayList<String> names = new ArrayList<>();
		names.add("AVishek");
		names.add("poushali");
		names.add("Hope");
		return names;
	}
}
