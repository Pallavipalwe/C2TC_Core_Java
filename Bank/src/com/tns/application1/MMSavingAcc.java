package com.tns.application1;
import com.tns.framework1.SavingAcc;
public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL = SavingAcc.getMINBAL();
	
	public static float getMinbal() {
		return MINBAL;
	}
	//constructor

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaride) {
		super(accNo, accNm, accBal, isSalaride);
	}
	@Override
	public void withdraw(float amt) {
		super.withdraw(amt);
		System.out.println("AVAILABLE BALANCE:" + getAccBal());
	}
}