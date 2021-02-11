package com.app.controller;

import java.sql.Date;
import java.sql.Time;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Flight;
import com.app.pojos.User;
import com.app.service.IFlightService;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService repo;
	@Autowired
	private IFlightService repo2;
	public UserController() {
		System.out.println("In user controller's constructor");
	}
	
	@GetMapping("/login")
	public String showLoginPage() {
		System.out.println("In show login page");
		return "/user/login";
	}
	@PostMapping("/login")
	public String showDisplayPage(@RequestParam String email, @RequestParam String password,Model modelMap, HttpSession hs, 
			RedirectAttributes flashMap) {
			System.out.println("In show Display page");
		//invoke User Object //if object invoked then user present & proceed further else redirect to login page with invalidation msg
			User authenticateUser = repo.authenticateUser(email, password);
			hs.setAttribute("valid_user", authenticateUser);
			System.out.println("valid_user "+authenticateUser);
			try {
			if(authenticateUser.getUserId() > 0)
				{	
					System.out.println("In if statement");
					flashMap.addFlashAttribute("status", "User has been logged succesfully!");
					return "redirect:/process/search";
				}
			}
			catch (RuntimeException e) {
					modelMap.addAttribute("mesg", "Invalid credentials, please try again!");
					System.out.println("Invalid Credentials "+e.getMessage());
					return "/user/login";
				
			}
			return null;
				
	}

	
}
