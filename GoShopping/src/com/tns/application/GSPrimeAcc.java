package com.tns.application;
import com.tns.framework.*;
public class GSPrimeAcc extends PrimeAcc{
	private static final float charges=0;
	public float getCharges() {
		return charges;
	}
	//constructor
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super (accNo, accNm, charges, isPrime);
		//todo auto generated constructor stub
	}
	@Override
	public void bookProduct(float f)
	{ 
		super.bookProduct(f);
		//System.out.println("Dear Prime User,Your Product Charges are:"+charges);
		
	}
@Override
public String toString() {
	return"Welcome to GoShooping\n" + super.toString();
	
}

}
