package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	private final float deliveryCharges=50;
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	//constructor
	public NormalAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges);
		//NormalAcc.deliveryCharges = deliveryCharges;
		
	}
	@Override
	
	public void bookProduct(float f)
	{
		System.out.println("Your order is placed");
	}
@Override
public String toString() {
	return"You are a Normal Member your delivery charges on any product is"+deliveryCharges +"\n"+super.toString();
//public float getDeliveryCharge() {
	//return deliveryCharge;
		
	
}
	

}
