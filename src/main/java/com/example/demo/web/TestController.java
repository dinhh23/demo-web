package com.example.demo.web;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.business.Pumpkin;

@RestController
@RequestMapping("/tests")
public class TestController {
	private List<Pumpkin> pumpkins = new ArrayList<>();
	
	@GetMapping("/")					
	public String testing() {
		return "Testing 1,2,3!!!";
	}
	
	@GetMapping("/pumpkin")
	public Pumpkin makePumpkin() {
		Pumpkin p = new Pumpkin(1,"orange",11.5, 12, 15, true);
		return p;
	}
	
	@GetMapping("/pumpkin-1")
	public List<Pumpkin> makePumpkin(@RequestParam int id, @RequestParam String color, @RequestParam double weight, @RequestParam double height, 
			@RequestParam double width, @RequestParam boolean decorated) {
		Pumpkin p = new Pumpkin(id,color,weight,height,width,decorated);
		pumpkins.add(p);
		return pumpkins;
	}
}
