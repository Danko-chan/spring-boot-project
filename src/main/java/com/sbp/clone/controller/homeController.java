package com.sbp.clone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class homeController {
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
