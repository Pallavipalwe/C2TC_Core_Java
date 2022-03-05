package com.tns.framework;

public  abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime = true;
	public boolean getisPrime() {
		return this.isPrime;
	}
	private static final float deliveryCharges = 0;
	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
		
	}
	@Override
	public void bookProduct(float f)
	{
		System.out.println("your order is placed");
	}
	@Override
	public String toString() {
		return "You are a Prime Member your deelivery charges on any product is" + deliveryCharges +"\n"+super.toString();
		}
//public boolean isPrime() {
	//return isPrime;
//}
//public void setPrime(boolean isPrime) {
	//this.isPrime=isPrime;
}
//}
