package com.exercise;

import com.exercise.HospitalService;;

public class Application {

	
	
	public static void main(String[] args)
	{
		HospitalService service = new HospitalService();
		
		
		
		service.addPatient(100,"ram",23);
		service.addPatient(101,"sam",34);
	
		service.addDoctor(200,"raj",45);
		
		service.addAppointment(200,100);
		
		service.displayAllAppointments();
	}
	
}
