package com.example.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class ExampleApplication {
//Restful Api
	public static void main(String[] args){
		SpringApplication.run(ExampleApplication.class,args) ;
	}



	//Basics
//	public static void main(String[] args) {
////		SpringApplication.run(ExampleApplication.class, args);
//		var app=new SpringApplication(ExampleApplication.class);
//		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","dev"));
//		var ctx = app.run(args);
////		var ctx = SpringApplication.run(ExampleApplication.class, args);
//
////		FirstClass firstClass=new FirstClass();
////		FirstClass firstClass=ctx.getBean( "myBean",FirstClass.class);
//		MyFirstService myFirstService =ctx.getBean(MyFirstService.class);
//		SecondService secondService =ctx.getBean(SecondService.class);
//		System.out.println(myFirstService.tellAStory());
//		System.out.println(myFirstService.getJavaVersion());
//		System.out.println(myFirstService.ReadProp());
//		System.out.println(secondService.SecondStory());
//		System.out.println(secondService.getCustomPropertyFromAnotherFile());
////		System.out.println(firstClass.Hello());
//	}


}
