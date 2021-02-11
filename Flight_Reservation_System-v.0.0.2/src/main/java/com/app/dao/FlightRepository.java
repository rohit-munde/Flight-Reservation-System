package com.app.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

	Flight findByFlightId(int id);
	List<Flight> findByDepCityAndArrCityAndDepDate(String from, String to, Date depdate);
}
