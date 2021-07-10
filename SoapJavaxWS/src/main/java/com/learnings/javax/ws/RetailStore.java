package com.learnings.javax.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class RetailStore {

	@WebMethod
	@WebResult(partName = "returnStores")
	public ArrayList<String> getRetailStoresforPIN(@WebParam(partName = "pincode")String pincode){
		ArrayList<String> stores = new ArrayList<>();
		if("799001".equals(pincode)) {
			stores.add("gobindo stores");
			stores.add("kalimata stores");
			stores.add("das stores");
		}
		return stores;
	}
}
