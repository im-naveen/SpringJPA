package com.lti.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.app.exceptions.FlightException;
import com.lti.app.pojo.Flight;
import com.lti.app.service.FlightService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        FlightService fservice = context.getBean(FlightService.class);     
        
        
        Flight f02=new Flight("AE097","BONDD","Mumbai","Chennai");
//      try {
//			fservice.updateFlight(f02);
//		} catch (FlightException e) {
//			System.out.println(e.getMessage());
//		}
//      System.out.println("flight updated");
//      
//      try {
//		fservice.deleteFlight("AE08888");
//		} catch (FlightException e) {
//			System.out.println(e.getMessage());
//			
//		}
//      System.out.println(fservice.showAllFlights());
      List<Flight> fight=fservice.showAllFlights();
      for(Flight x: fight) {
      	System.out.println(x);
      }
    }
}
