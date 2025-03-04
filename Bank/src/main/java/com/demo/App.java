package com.demo;


import com.Dao.BankinfromationDao;
import com.model.Bankinfromation;


public class App 
{
    public static void main( String[] args )
    {
    	Bankinfromation b = new Bankinfromation();
    	BankinfromationDao bd = new BankinfromationDao();
        b.setAccountNo(1);
        b.setANameHoder("lokesh");
        b.setAaddressHoder(" A/p vadchil");
        b.setAcityName("pune");
        b.setAHoderBalance(52000.00);
        System.out.println(bd.insertBankinfromation(b));
    }
}
