package com.exercise;

public class Patient extends HospitalService{

	private int patientId;
	private String patientName;
	private int patientAge;
	private String appointmentDate;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientId, String patientName, int patientAge, String appointmentDate) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.appointmentDate = appointmentDate;
	}
	public Patient(int patientId, String patientName, int patientAge) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
	}
	
	
	
	
}
