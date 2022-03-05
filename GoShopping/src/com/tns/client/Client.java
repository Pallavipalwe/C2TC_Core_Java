package com.tns.client;
import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopAcc;
import com.tns.framework.ShopFactory;

public class Client {
public static void main(String[] args)
{
	//Step 1-step a
	GSShopFactory gsfactory = new GSShopFactory();
	gsfactory.getNewPrimeAccount(123,"Pallavi",100,true);
	gsfactory.getNewNormalAccount(111,"Pallavi2",500,20);
	//step 2
	GSPrimeAcc GsPrime = new GSPrimeAcc();
	GsPrime.getaccNm();
	GsPrime.getaccNo();
	GsPrime.getCharges();
	//step4/step d.
	GsPrime.bookProduct(100);
	//step5 /step e.
	GsPrime.toString();
	//step 3
	GSNormalAcc GsNormal = new GSNormalAcc();
	GsNormal.getaccNo();
	GsNormal.getaccNm();
	GsNormal.getCharges();
	GsNormal.getDeliveryCharges();
	//step 4/step d.
	GsNormal.bookProduct(100);
	//step 5/step e.
	GsNormal.toString();

	
}
}
