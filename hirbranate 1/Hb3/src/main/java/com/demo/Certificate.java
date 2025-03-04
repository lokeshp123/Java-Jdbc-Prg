package com.demo;

public class Certificate {
	private String Coureses;
	private String Duration;
	
	public String getCoureses() {
		return Coureses;
	}
	public void setCoureses(String coureses) {
		Coureses = coureses;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public Certificate(String coureses, String duration) {
		super();
		Coureses = coureses;
		Duration = duration;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
