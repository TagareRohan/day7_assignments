package com.interfaces;

public interface Hospital {

	public void displayDoctor(int doctorId);
	public void displayPatient(int patientId);
	public void displayAllDoctors();
	public void displayAllPatients();
	public boolean cancelAppointment(int doctorId, int patientId);
	public boolean addAppointment(int doctorId,int patientId);
	public boolean addDoctor(int doctorId, String doctorName, int doctorAge);
	public boolean addPatient(int patientId, String patientName, int patientAge);
	public void displayAllAppointments();
}
