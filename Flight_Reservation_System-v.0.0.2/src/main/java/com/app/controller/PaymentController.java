package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.PassengerRepository;
import com.app.dao.ReservationRepository;
import com.app.pojos.Reservation;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PassengerRepository repo;
	@Autowired
	private ReservationRepository repo2;
	
	@GetMapping("/card_dtls")
	public String showCardForm() {
		System.out.println("In show card details form!");
		return "/payment/card_dtls";
	}
	@PostMapping("/card_dtls")
	public String processCardDetails() {
		System.out.println("In process card details form");
		return "redirect:/payment/status";
	}
	@GetMapping("/status")
	public String showStatusPage(HttpSession hs,Model map) {
		
		
		Reservation res = (Reservation) hs.getAttribute("reservation_details");
		System.out.println("Reservation before status page: "+res);
		map.addAttribute("reservation", res);
		return "/payment/status";
	}
	
	
}
