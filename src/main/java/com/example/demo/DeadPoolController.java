package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeadPoolController {
	@GetMapping(path="/savePerson")
	public String savePerson() {
		return "Person saved.";
	}
	@GetMapping(path="/killVillan")
	public String killVillan() {
		return "Villan killed";
	}

}
