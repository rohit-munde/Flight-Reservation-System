package com.app.pojos;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reservationNumber;
	@OneToOne
	@JoinColumn(name = "pass_id")
	private Passenger p;
	@Column(nullable = false, columnDefinition = "TINYINT(1)")
	private boolean status;
	
	public Reservation() {
		
	}

	public Reservation(Integer reservationNumber, Passenger p, boolean status) {
		super();
		this.reservationNumber = reservationNumber;
		this.p = p;
		this.status = status;
	}

	public Integer getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(Integer reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public Passenger getP() {
		return p;
	}

	public void setP(Passenger p) {
		this.p = p;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reservation [reservationNumber=" + reservationNumber + ", p=" + p + ", status=" + status + "]";
	}
	
	public String getFlightName() {
		return p.getBookedFlight().getAirline();
	}
	public Integer getFlightId() {
		return p.getBookedFlight().getFlightId();
	}
	public String getDepCity() {
		return p.getBookedFlight().getDepCity();
	}
	public String getArrCity() {
		return p.getBookedFlight().getArrCity();
	}
	public Date getDepDate() {
		return p.getBookedFlight().getDepDate();
	}
	public Time getDepTime() {
		return p.getBookedFlight().getDepTime();
	}
	public Date getArrDate() {
		return p.getBookedFlight().getArrDate();
	}
	public Time getArrTime() {
		return p.getBookedFlight().getArrTime();
	}
	
	
	public String getPassName() {
		return p.getName();
	}
	public String getPassEmail() {
		return p.getEmail();
	}
	public String getPassNumber() {
		return p.getPhoneNumber();
	}
}
