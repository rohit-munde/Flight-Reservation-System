package com.app.service;

import com.app.pojos.Passenger;

public interface IPassengerService {
	
	Passenger addPassenger(Passenger p);
	Passenger findPassenger(String email,String name);
}
