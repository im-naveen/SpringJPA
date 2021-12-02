package com.lti.app.service;

import java.util.List;

import com.lti.app.exceptions.FlightException;
import com.lti.app.pojo.Flight;

public interface FlightService
{
	
	public void addFlight(Flight flight) throws FlightException;
	
	public void updateFlight(Flight flight) throws FlightException;
	
	public void deleteFlight(String flightNo)throws FlightException;
	
	public List<Flight> showAllFlights();

}
