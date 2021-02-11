package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;

@Entity
@Table(name = "pass_tbl")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passId;
	@Column(length = 100,nullable = false)
	private String name;
	@Column(length = 255,nullable = false)
	private String email;
	@Column(length = 10,nullable = false)
	private String phoneNumber;
	
	@ManyToOne
	@JoinColumn(name = "flight_id")
	private Flight bookedFlight;
	@OneToOne(mappedBy = "p" , cascade = CascadeType.ALL)
	private Reservation res;
	public Passenger() {
		
	}

	public Passenger(Integer passId, String name, String email, String phoneNumber) {
		super();
		this.passId = passId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public Passenger(String name, String email, String phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Integer getPassId() {
		return passId;
	}

	public void setPassId(Integer passId) {
		this.passId = passId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	@Override
	public String toString() {
		return "Passenger [passId=" + passId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+bookedFlight+ "]";
	}
	//helper methods
	public Flight getBookedFlight() {
		return bookedFlight;
	}

	public void setBookedFlight(Flight bookedFlight) {
		this.bookedFlight = bookedFlight;
	}
	
}
