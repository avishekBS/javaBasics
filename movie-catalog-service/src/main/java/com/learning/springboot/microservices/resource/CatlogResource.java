package com.learning.springboot.microservices.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.microservices.model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class CatlogResource {
	
	@RequestMapping("/{userId}")
	 public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		System.out.println("inside getCatlog Resource........");
		return Collections.singletonList(new CatalogItem("Money Heist", "AB", 9));		 
	 }

}
