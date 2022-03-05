package com.tns.framework1;
public abstract class SavingAcc extends BankAcc{
	//is Salaride
	private boolean isSalaride;
	public boolean getisSalaride() {
		return isSalaride;
	}
	//minimum balance
	private static final float MINBAL = 5000;
	public static float getMINBAL() {
	return MINBAL;	
	}

//Constructor
public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaride) {
	 super(accNo, accNm,accBal);
     this.isSalaride = isSalaride;
}
@Override
public void withdraw(float amt){
	if (isSalaride && (getAccBal() - amt <0)) {
		 System.out.println("insufficient balance".toUpperCase());
	}else if (!isSalaride && (getAccBal() - MINBAL < amt)) {
		 System.out.println("Money Withdraw not possible".toUpperCase());
	}else {
		setAccBal(getAccBal() - amt);
		 System.out.println("Trasaction Complete.");
	}
}
@Override
public String toString() {
	 System.out.println(super.toString());
	 System.out.println("Your account Number is" + (getAccNo()) + "& Your Account Balance is" +getAccBal());
	return "SavingAcc [isSalaride=" + isSalaride + ", getisSalaride()=" + getisSalaride() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
}