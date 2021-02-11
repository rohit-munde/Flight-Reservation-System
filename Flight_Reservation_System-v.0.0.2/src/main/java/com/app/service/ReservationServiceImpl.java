package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ReservationRepository;
import com.app.pojos.Reservation;

@Service
@Transactional
public class ReservationServiceImpl implements IReservationService {

	@Autowired
	private ReservationRepository repo;
	@Override
	public Reservation addReservation(Reservation rs) {
		Reservation save = repo.save(rs);
		return save;
	}

}
