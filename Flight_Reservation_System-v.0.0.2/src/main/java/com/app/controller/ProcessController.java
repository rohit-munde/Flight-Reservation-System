package com.app.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Flight;
import com.app.service.IFlightService;
import com.app.service.IPassengerService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
@RequestMapping("/process")
public class ProcessController {
	
	@Autowired
	private IFlightService repo;
	@Autowired
	private IPassengerService repo2;
	@GetMapping("/search")
	public String showSearchForm()
	{
		System.out.println("All Flights: "+repo.listAllFlights());
//		map.addAttribute("flights", repo.listAllFlights());
		System.out.println("In show search form");
		return "/process/search";
	}
	@PostMapping("/search")
	public String showSearchDetails(@RequestParam String from, @RequestParam String to, @RequestParam Date depdate,Model map) {
		System.out.println("Search detials: "+from+" "+to+" "+depdate);
		List<Flight> f = repo.getFlightDetailsByDepCityAndArrCityAndDepDate(from, to, depdate);
		if(!(f.isEmpty())) {
			map.addAttribute("result_flights", f);
			System.out.println("Searched flights: "+f);
			return "/process/display";
		}else {
			map.addAttribute("flight_na", "No flights available");
			return "/process/search";
		}
	}
		@GetMapping("/display")
		public String showFlightDetails(Model map) {
			map.getAttribute("result_flights");
			return "/process/display";
		}
	@PostMapping("/display")
	public String processFlightDetails() {
		
		System.out.println("In show process flight details form");
//		map.addAttribute("chosen_flight", repo.getFlightDetailsById(bid));
		return "redirect:/passenger/passenger";
	}
}
