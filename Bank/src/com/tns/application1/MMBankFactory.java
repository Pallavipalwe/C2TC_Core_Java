package com.tns.application1;

import com.tns.framework1.*;
public class MMBankFactory extends BankFactory {
	@Override
	pubilc MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaride) {
		MMSavingAcc obj = new MMSavingAcc(accNo,accNm,accBal,isSalaride);
		return obj;
	}
	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc obj = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return obj;
		
	}

}
