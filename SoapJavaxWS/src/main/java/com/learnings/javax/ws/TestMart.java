package com.learnings.javax.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * Used for JAVAX. DOCUMENT STYLE
 * 
 */
@WebService(
name = "MyTestMart", //--> defines the port type name
portName = "MyTestMartPort", //--> defines the port name
serviceName = "MyTestMartService", //--> defines the service name
targetNamespace = "http://webservices.javax.learnings.com/") // default is the package name
public class TestMart {
	@WebMethod(action = "fetch_catalog", operationName = "fetchProductCatalog")
	public ArrayList<String> getProductCatalog(){
		ArrayList<String> catalogs = new ArrayList<String>();
		catalogs.add("Music");
		catalogs.add("books");
		catalogs.add("snacks");
		return catalogs;
	}
	
	@WebMethod(exclude = true) //excludes this method from WSDL
	public ArrayList<String> TestMartRetailer(){
		ArrayList<String> retailers = new ArrayList<String>();
		retailers.add("Nippon");
		retailers.add("Samsung");
		retailers.add("HardRock");
		return retailers;
	}
}
