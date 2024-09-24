package com.example.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {
//    @Bean("myBean")
	@Bean
//	@Qualifier("bean1")      *****Used Qualifiers so that
	public FirstClass firstClass(){
		return new FirstClass("First Bean");
	}

//	@Bean("myBean")
	@Bean
//	@Qualifier("bean1")
	public FirstClass secondClass(){
		return new FirstClass("Second Bean");
	}
	@Bean
	@Primary
	public FirstClass thirdClass(){
		return new FirstClass("Third Class");
	}
	@Bean
	public SecondClass newSecondClass(){
		return new SecondClass( "This is from the second class");
	}
}
