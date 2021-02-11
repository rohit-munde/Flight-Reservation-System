package com.app.pojos;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "flight_details")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flightId;
	@Column(length = 50,nullable = false)
	private String airline;
	@Column(length = 20,nullable = false)
	private String depCity;
	@Column(length = 20,nullable = false)
	private String arrCity;
	@Column
	private Time depTime;
	@Column
	private Date depDate;
	@Column
	private Time arrTime;
	@Column
	private Date arrDate;
	@OneToMany(mappedBy = "bookedFlight", cascade = CascadeType.ALL)
	private List<Passenger> passengers = new ArrayList<>();
	
	public Flight() {
		
	}

	public Flight(Integer flightId, String airline, String depCity, String arrCity, Time depTime, Date depDate,
			Time arrTime, Date arrDate) {
		super();
		this.flightId = flightId;
		this.airline = airline;
		this.depCity = depCity;
		this.arrCity = arrCity;
		this.depTime = depTime;
		this.depDate = depDate;
		this.arrTime = arrTime;
		this.arrDate = arrDate;
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDepCity() {
		return depCity;
	}

	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getArrCity() {
		return arrCity;
	}

	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}

	public Time getDepTime() {
		return depTime;
	}

	public void setDepTime(Time depTime) {
		this.depTime = depTime;
	}

	public Date getDepDate() {
		return depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	public Time getArrTime() {
		return arrTime;
	}

	public void setArrTime(Time arrTime) {
		this.arrTime = arrTime;
	}

	public Date getArrDate() {
		return arrDate;
	}

	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}
	
	//Helper methods

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airline=" + airline + ", depCity=" + depCity + ", arrCity=" + arrCity
				+ ", depTime=" + depTime + ", depDate=" + depDate + ", arrTime=" + arrTime + ", arrDate=" + arrDate
				+ "]";
	}
	
}
