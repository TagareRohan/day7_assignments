package com.exercise;

import java.util.*;
import com.interfaces.Hospital;

public class HospitalService implements Hospital {

	
	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Patient> patients = new ArrayList<>();
	Map<Doctor, ArrayList<Patient>> appointments=new TreeMap<>();
	
	@Override
	public void displayDoctor(int doctorId) {
		// TODO Auto-generated method stub
		int key=0;
		
		try
		{
			for(Doctor doc:doctors)
			{
				if(doc.getDoctorId()==doctorId)
				{
					key=doctors.indexOf(doc);
					System.out.println(doctors.get(key));
					break;
				}
				else
				{
					throw new Exception("doctor not found");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void displayPatient(int patientId) {
		// TODO Auto-generated method stub
		int key=0;
		
		try
		{
			for(Patient pat:patients)
			{
				if(pat.getPatientId()==patientId)
				{
					key=patients.indexOf(pat);
					System.out.println(patients.get(key));
				}
				else
				{
					throw new Exception("patient not found");
				}
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public void displayAllDoctors() {
		// TODO Auto-generated method stub
		for (Doctor doc: doctors)
		{
			System.out.println(doc);
		}
	}

	@Override
	public void displayAllPatients() {
		// TODO Auto-generated method stub
		for (Patient pat: patients)
		{
			System.out.println(pat);
		}
	}

	@Override
	public boolean cancelAppointment(int doctorId, int patientId) {
		// TODO Auto-generated method stub
		boolean result = false;
		int key1=0;
		for(Patient pat:patients)
		{
			if(pat.getPatientId()==patientId)
			{
				key1=patients.indexOf(pat);
			}
		}
		Patient patient=patients.get(key1);
		
		int key2=0;
		for(Doctor doc: doctors)
		{
			if(doc.getDoctorId()==doctorId)
			{
				key2=doctors.indexOf(doc);
				
			}
		}
		
		Doctor doctor=doctors.get(key2);
		ArrayList<Patient> patientList=appointments.get(doctor);
		
		result=patientList.remove(patient);
		
		try
		{
			if (result==false)
			{
				throw new Exception("no appointment found");
			}
			else
			{
				appointments.put(doctor, patientList);
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
		return result;
	}

	public HospitalService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addAppointment(int doctorId,int patientId) {
		// TODO Auto-generated method stub
		boolean result = false;
		int key1=0;
		for(Patient pat:patients)
		{
			if(pat.getPatientId()==patientId)
			{
				key1=patients.indexOf(pat);
			}
		}
		Patient patient=patients.get(key1);
		
		int key2=0;
		for(Doctor doc: doctors)
		{
			if(doc.getDoctorId()==doctorId)
			{
				key2=doctors.indexOf(doc);
				
			}
		}
		
		Doctor doctor=doctors.get(key2);
		ArrayList<Patient> patientList=appointments.get(doctor);
		patientList.add(patient);
		appointments.put(doctor, patientList);
		result=true;
		return result;
	}

	@Override
	public boolean addDoctor(int doctorId, String doctorName, int doctorAge) {
		// TODO Auto-generated method stub
		boolean result = false;
		doctors.add(new Doctor(doctorId,doctorName,doctorAge));
		result=true;
		return result;
	}

	@Override
	public boolean addPatient(int patientId, String patientName, int patientAge) {
		// TODO Auto-generated method stub
		boolean result = false;
		patients.add(new Patient(patientId,patientName,patientAge,null));
		result=true;
		return result;
	}

	@Override
	public void displayAllAppointments() {
		// TODO Auto-generated method stub
		for(Map.Entry<Doctor, ArrayList<Patient>> entry: appointments.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
