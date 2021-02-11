package com.app.service;

import java.sql.Date;
import java.util.List;
import com.app.pojos.Flight;

public interface IFlightService {

	List<Flight> listAllFlights();
	Flight getFlightDetailsById(int id);
	List <Flight> getFlightDetailsByDepCityAndArrCityAndDepDate(String from, String to, Date depdate);
}
