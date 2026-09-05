package com.bhoomika.practice.restfull_services.helloWorld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
private MessageSource messageSource;
	
	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	
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
	
	@GetMapping(path = "/hello-world-internationalized")
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale );
		
	}

}
