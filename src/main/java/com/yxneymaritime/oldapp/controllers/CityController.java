package com.yxneymaritime.oldapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.yxneymaritime.oldapp.model.City;
import com.yxneymaritime.oldapp.service.ICityService;

@Controller
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CityController {
	   @Autowired
	    private ICityService cityService;

	    @GetMapping("/showCities")
	    public String findCities(Model model) {

	    	List<City> cities = (List<City>) cityService.findAll();

	        model.addAttribute("cities", (List<City>) cityService.findAll());

	        return "showCities";
	    }
}
