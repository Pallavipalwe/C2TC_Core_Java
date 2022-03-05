package com.tns.application;
import com.tns.framework.*;
public class GSNormalAcc extends NormalAcc
{
	//constuctor
	public GSNormalAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
		}
@Override
public void bookProduct(float f) {
	super.bookProduct(f);
}
//public GSNormalAcc()
//{
//	super(accNo, accNM, deliverycharge, deliveryCharge);
	//TODO Auto-generated constructor stub
	
//}
//public void bookProduct(float charges)
//{
	//System.out.println("Dear Normal User, Your charges are: "+charges+" with Delivery Charges is:"+deliveryCharge);
//}
@Override
public String toString() {
return "Welcome to GoShopping\n"+ super.toString();
}
}
