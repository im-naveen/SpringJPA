package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Flight;


@Repository
public class FlightDAOImpl implements FlightDAO {
	
	@PersistenceContext
	EntityManager eMan;

	@Override
	public void addFlight(Flight flight) 
	{
		eMan.persist(flight);
		
	}

	@Override
	public void updateFlight(Flight flight) {
		
		eMan.merge(flight);
		
	}

	@Override
	public void deleteFlight(String flightNo) {
		
		Flight f=eMan.find(Flight.class,flightNo);
		eMan.remove(f);
	}

	

	
	
	
	
}
