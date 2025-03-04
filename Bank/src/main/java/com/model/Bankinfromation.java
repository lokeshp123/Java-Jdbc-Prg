package com.model;

public class Bankinfromation {
	private int  AccountNo;
	private String ANameHoder;
	private String AaddressHoder;
	private String  AcityName;
	private double  AHoderBalance;
	public int getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	public String getANameHoder() {
		return ANameHoder;
	}
	public void setANameHoder(String aNameHoder) {
		ANameHoder = aNameHoder;
	}
	public String getAaddressHoder() {
		return AaddressHoder;
	}
	public void setAaddressHoder(String aaddressHoder) {
		AaddressHoder = aaddressHoder;
	}
	public String getAcityName() {
		return AcityName;
	}
	public void setAcityName(String acityName) {
		AcityName = acityName;
	}
	public double getAHoderBalance() {
		return AHoderBalance;
	}
	public void setAHoderBalance(double aHoderBalance) {
		AHoderBalance = aHoderBalance;
	}
	@Override
	public String toString() {
		return "Bankinfromation [AccountNo=" + AccountNo + ", ANameHoder=" + ANameHoder + ", AaddressHoder="
				+ AaddressHoder + ", AcityName=" + AcityName + ", AHoderBalance=" + AHoderBalance + "]";
	}

	
}
