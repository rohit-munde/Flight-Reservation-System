package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.PassengerRepository;
import com.app.pojos.Passenger;

@Service
@Transactional
public class PassengerServiceImpl implements IPassengerService {

	@Autowired
	private PassengerRepository repo;
	@Override
	public Passenger addPassenger(Passenger p) {

//		Passenger p = new Passenger(name, email, pnumber);
		Passenger save = repo.save(p);
		return save;
	}
	@Override
	public Passenger findPassenger(String email, String name) {

		return repo.findByEmailAndName(email, name);
	}

}
