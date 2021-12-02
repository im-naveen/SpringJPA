package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Flight;

public interface FlightDAO
{
		public void addFlight(Flight flight);
		public void updateFlight(Flight flight);
		public void deleteFlight(String flightNo);
		
		

		
}
