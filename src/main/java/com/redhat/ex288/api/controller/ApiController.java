package com.redhat.ex288.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@GetMapping("/home")
	public String apiHome(){
	return "Home API";
	}
	
	@RequestMapping(value = "/v1/list", produces = "application/json")
    public List<String> listV1() {
        return Arrays.asList("item2 - v1" , "item2 - v1", "item3 - v1", "item4 - v1");
    }
	
	@GetMapping("/config")
    public String getConfigMapValue() {
		String configMapValue = System.getenv().getOrDefault("CONFIG_MAP_VALUE", "DEFAULT");
		System.out.println("config: " + configMapValue);
		return "CONFIG MAP VALUE: " + configMapValue;
	}
	
}