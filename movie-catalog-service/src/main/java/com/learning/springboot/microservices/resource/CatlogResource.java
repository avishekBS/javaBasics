package com.learning.springboot.microservices.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.microservices.model.CatalogItem;
import com.learning.springboot.microservices.model.CatalogItemListWrapper;
import com.learning.springboot.microservices.service.CatlogService;

@RestController
@RequestMapping("/catalog")
public class CatlogResource {
	
	@Autowired
	private CatlogService catlogService;
	
	@RequestMapping("/{userId}")
	 public CatalogItemListWrapper getCatalog(@PathVariable("userId") String userId) {
		return catlogService.getCatalog(userId);		 
	 }

}
