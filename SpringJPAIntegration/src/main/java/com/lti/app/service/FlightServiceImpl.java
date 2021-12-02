package com.lti.app.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.exceptions.FlightException;
import com.lti.app.pojo.Flight;
import com.lti.app.repository.FlightDAO;

@Service
@Transactional
public class FlightServiceImpl implements FlightService
{
	
	@Autowired
	FlightDAO flightDao;
	
	@PersistenceContext
	EntityManager eMan;

	@Override
	public void addFlight(Flight flight) throws FlightException 
	{
		
		if(flight.getSource().equals(flight.getDest()))
			throw new FlightException("Source and Dest cant be the same");
		flightDao.addFlight(flight);
		
	}

	@Override
	public void updateFlight(Flight flight) throws FlightException {
		
		if(flight.getSource().equals(flight.getDest()))
			throw new FlightException("Source and dest Cant be Same");
		flightDao.updateFlight(flight);		
	}

	@Override
	public void deleteFlight(String flightNo) throws FlightException {
		
		if(eMan.find(Flight.class,flightNo)==null)
			throw new FlightException("flight nai mila");
		flightDao.deleteFlight(flightNo);
	}

	@Override
	public List<Flight> showAllFlights() {
		Query query=eMan.createQuery("from Flight");
		List<Flight> vimaan=query.getResultList();
		
		
		return vimaan;
	}

		
	

}
