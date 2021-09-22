package com.learning.springboot.microservices.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.learning.springboot.microservices.model.CatalogItem;
import com.learning.springboot.microservices.model.CatalogItemListWrapper;
import com.learning.springboot.microservices.model.Movie;
import com.learning.springboot.microservices.model.Rating;

@Service
public class CatlogService {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	public CatalogItemListWrapper getCatalog(String userId) {
		
		List<Rating> ratings = Arrays.asList(
				new Rating("first movie", 3),
				new Rating("2nd movie", 4),
				new Rating("3rd movie", 5)
				);
		
		//Use REST template to call RESFUL microservice
		
		//Iterate over ratings List --> ratings.stream().map(rating ->{}).collect(Collectors.toList());
		 List<CatalogItem> catalogItems = ratings.stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://localhost:8091/movies/"+rating, Movie.class);
			return new CatalogItem(movie.getName(), userId, rating.getRating());
		}).collect(Collectors.toList());
		 CatalogItemListWrapper catalogItemListWrapper = new CatalogItemListWrapper();
		 catalogItemListWrapper.setListofCatalogItem(catalogItems);
		 return catalogItemListWrapper;
	}
}

/*Movie movie = webClientBuilder.build()
.get()
.uri("http://localhost:8091/movies/"+rating)
.retrieve()
.bodyToMono(Movie.class)
.block();*/
