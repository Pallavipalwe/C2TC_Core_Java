package com.tns.framework1;
public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAcc(int accNo,String accNM,float accBal,boolean isSalarird);
	public abstract CurrentAcc getNewCurrentAcc(int accNo,String accNM, float accBal, float creditLimit);


}
