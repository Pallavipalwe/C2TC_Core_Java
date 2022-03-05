package com.tns.framework1;
public abstract class CurrentAcc extends BankAcc{
	private float creditLimit;
	public float getcreditLimit() {
		return creditLimit;
	}
//constructor	

public CurrentAcc(int accNo, String accNm,float accBal,float creditLimit) {
	super(accNo, accNm ,accBal);
	this.creditLimit = creditLimit;
}
@Override
public void withdraw(float amt) {
	if (amt > getAccBal() + creditLimit) {
		 System.out.println("insufficient balance".toUpperCase());
		 System.out.println("Transaction Failed.");
	}else if (getAccBal() >= amt) {
		setAccBal(getAccBal() - amt);
		 System.out.println("Transaction Complete.");
	}else {
		amt -= getAccBal();
		creditLimit -= amt;
		setAccBal(0);
		 System.out.println("Transaction Complete.");
	}
}
@Override
public String toString() {
	 System.out.println("Your account Number is" + (getAccNo()));
	 System.out.println("Your Account Balance is" + getAccBal() +"& Your Credit Limit is" + creditLimit);
	return "CurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}
}