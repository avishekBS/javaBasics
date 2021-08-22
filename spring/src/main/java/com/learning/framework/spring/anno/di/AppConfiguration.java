package com.learning.framework.spring.anno.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.learning.framework.spring.anno.di")
public class AppConfiguration {
	
	/* Instead of adding Bean for every dependency use @ComponentScan
	@Bean
	public Bike getBike() {
		return new Bike();
	}
	*/
}
