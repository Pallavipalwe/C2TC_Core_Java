package com.tns.application1;
import com.tns.framework1.*;
public class MMCurrentAcc extends CurrentAcc {
	//constructor
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo,accNm,accBal, creditLimit);
	}
	
	public void withdraw(float amt) {
		super.withdraw(amt);
		System.out.println("AVAILABLE BALANCE: " + getAccBal());
		System.out.println("CREDIT LIMIT:" + getCreditLimit());
	}
}
		
	
