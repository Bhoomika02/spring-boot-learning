package com.bhoomika.practice.restfull_services.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "hello-world")
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping(path = "hello-world-bean")
	public HelloWorldBean helloworldbean() {
		return  new HelloWorldBean("Hello World Bean");
	}

	
	@GetMapping(path = "hello-world-variable/{name}")
	public HelloWorldBean helloworldvariable(@PathVariable String name) {
		return new HelloWorldBean("Hello World Variable "+ name);
	}


}
