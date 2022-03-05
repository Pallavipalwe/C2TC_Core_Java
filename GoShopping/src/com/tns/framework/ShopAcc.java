package com.tns.framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	public String accNm() {
		return accNm;
		
	}
	private float charges;
	public float getCharges() {
		return charges;
	}
//public void setAccNo(int accNO) {
	//this.accNo=accNo;
//}
//public void setCharges(float charges) {
	//this.charges=charges;
//}

public void setAccNm(String accNm) {
	this.accNm = accNm;
}//constructor
public ShopAcc(int accNo, String accNm, float charges)
{
	this.accNo=accNo;
	this.accNm=accNm;
	this.charges=charges;
}
public abstract void bookProduct(float a);
	//System.out.println("Product booked and charges are:"+charges);
//}
public void items(float x)
{
	System.out.println("1.Mobile - 10000 \n2. Laptop - 50000\n3.watch - 2000 \n4.shirt - 800\n5. T-shirt - 400\n");
}
@Override
public String toString()
{
	return"Continue your Shopping "+accNm +".\n";
}

}
