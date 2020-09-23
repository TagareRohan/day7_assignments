package com.exercise;

public class Doctor extends HospitalService{

	private int doctorId;
	private String doctorName;
	private int doctorAge;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Doctor(int doctorId, String doctorName, int doctorAge) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}
	
}
