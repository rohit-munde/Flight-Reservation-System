package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Flight;
import com.app.pojos.Passenger;
import com.app.pojos.Reservation;
import com.app.service.IFlightService;
import com.app.service.IPassengerService;
import com.app.service.IReservationService;

@Controller
@RequestMapping("/passenger")
public class PassengerController {
	@Autowired
	private IFlightService repo;
	@Autowired
	private IPassengerService repo2;
	@Autowired
	private IReservationService repo3;
	
	@GetMapping("/passenger")
	public String showPassengerForm(@RequestParam int bid, Model map,Passenger passenger,HttpSession hs) {
		//need a method to get Flight details finding using flightId(bid)
		System.out.println("In show passenger form");
		Flight f = repo.getFlightDetailsById(bid);
		passenger.setBookedFlight(f);
		map.addAttribute("chosen_flight", repo.getFlightDetailsById(bid));
		hs.setAttribute("flight", f);
		return "/passenger/passenger";
	}
	@PostMapping("/passenger")
	public String processPayment(Passenger passenger,HttpSession hs) {
		System.out.println("Passenger details: "+passenger);
		Flight f = (Flight) hs.getAttribute("flight");
		passenger.setBookedFlight(f);
		Reservation rs = new Reservation();
		Passenger p = repo2.addPassenger(passenger);
		
		Passenger findPassenger = repo2.findPassenger(passenger.getEmail(), passenger.getName());
		rs.setP(findPassenger);
		rs.setStatus(true);
		//require add rervation to database method
		repo3.addReservation(rs);
		System.out.println("Reservation Details: "+rs);
		hs.setAttribute("reservation_details", rs);
		System.out.println("Passenger details: "+p);
		hs.setAttribute("passenger_details", p);
		return "redirect:/payment/card_dtls";
	}
}
