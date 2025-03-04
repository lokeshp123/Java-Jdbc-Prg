package com.model;

public class Student {
	private  int Sid;
	private   String Sname;
	private  String SmobaileNo;
	private  double Ssalary;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSmobaileNo() {
		return SmobaileNo;
	}
	public void setSmobaileNo(String smobaileNo) {
		SmobaileNo = smobaileNo;
	}
	public double getSsalary() {
		return Ssalary;
	}
	public void setSsalary(double ssalary) {
		Ssalary = ssalary;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", SmobaileNo=" + SmobaileNo + ", Ssalary=" + Ssalary + "]";
	}
	
}
