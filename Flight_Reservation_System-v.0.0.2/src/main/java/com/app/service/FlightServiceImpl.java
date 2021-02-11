package com.app.service;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.FlightRepository;
import com.app.pojos.Flight;

@Service
@Transactional
public class FlightServiceImpl implements IFlightService{

	@Autowired
	private FlightRepository repo;
	@Override
	public List<Flight> listAllFlights() {

		return repo.findAll();
	}
	@Override
	public Flight getFlightDetailsById(int id) {
		
		return repo.findByFlightId(id);
	}
	@Override
	public List<Flight> getFlightDetailsByDepCityAndArrCityAndDepDate(String from, String to, Date depdate) {

		return repo.findByDepCityAndArrCityAndDepDate(from, to, depdate);
	}

}
