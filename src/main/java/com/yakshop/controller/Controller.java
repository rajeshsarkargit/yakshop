package com.yakshop.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yakshop.model.Stock;
import com.yakshop.model.Yak;
import com.yakshop.service.IService;

@RestController
@RequestMapping(path = "/yak-shop", produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {
	
	@Autowired
	private IService service;
	
	@GetMapping("/stock/{days}")
	public Stock getStock(@PathVariable("days") Integer days) {
        
		return service.getStock(days);
    }
	@GetMapping("/herd/{days}")
	public Map<String,List<Yak>> getHerd(@PathVariable("days") Integer days) {
		
		return service.getHerds(days);
	}

}
