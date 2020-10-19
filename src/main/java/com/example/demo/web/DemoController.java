package com.example.demo.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demos")
public class DemoController {
	
	@GetMapping("/hello")					
	public String HelloWorld() {
		return "Hello Spring World!!!";
	}
	
	@GetMapping("/hello-name")					
	public String HelloWorld(@RequestParam(defaultValue="World") String name) {
		return "Hello " +name+"!!!";
	}

}
