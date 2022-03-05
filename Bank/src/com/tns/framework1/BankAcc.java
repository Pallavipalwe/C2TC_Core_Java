package com.tns.framework1;

public abstract class BankAcc {
	private int accNo;     //accNo
	public int getAccNo() {
		return accNo;
	}
	private String accNm;  //accNm
	public String getAccNm() {
		return accNm;
	}
	private float accBal; //accBal
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	//constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public abstract void withdraw(float amt);
	public void deposite(float amt) {
		accBal += amt;
		System.out.println(amt + "Deposited");
		 System.out.println("Transaction Complete.");
		 System.out.println("AVAILABLE BALANCE:" + getAccBal()); 
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getaccBal()=" + getaccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
