package com.Flight_Reservation_Application.Entities;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Flights extends AbstractEntity {


	private String flightNumber;
	private String operatingAirLines;
	private String departureCityString;
	private String arrivalCityString;
	private Date dateOfdepartureDate;
	private Timestamp estimatedDepartureTimestamp;
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirLines() {
		return operatingAirLines;
	}
	public void setOperatingAirLines(String operatingAirLines) {
		this.operatingAirLines = operatingAirLines;
	}
	public String getDepartureCityString() {
		return departureCityString;
	}
	public void setDepartureCityString(String departureCityString) {
		this.departureCityString = departureCityString;
	}
	public String getArrivalCityString() {
		return arrivalCityString;
	}
	public void setArrivalCityString(String arrivalCityString) {
		this.arrivalCityString = arrivalCityString;
	}
	public Date getDateOfdepartureDate() {
		return dateOfdepartureDate;
	}
	public void setDateOfdepartureDate(Date dateOfdepartureDate) {
		this.dateOfdepartureDate = dateOfdepartureDate;
	}
	public Timestamp getEstimatedDepartureTimestamp() {
		return estimatedDepartureTimestamp;
	}
	public void setEstimatedDepartureTimestamp(Timestamp estimatedDepartureTimestamp) {
		this.estimatedDepartureTimestamp = estimatedDepartureTimestamp;
	}
	
}
