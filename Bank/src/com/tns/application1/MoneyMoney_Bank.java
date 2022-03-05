package com.tns.application1;
import java.util.*;
import com.tns.framework1.*;
public class MoneyMoney_Bank {
	static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//variable creation
		int accNo = 110;
		String accNm = "default";
		float accBal = 10000;
		boolean isSalaride = false;
		float creditLimit = 5000;
		float amt = 0;
		//arrayList<BankAcc> bankAcc = neew ArrayList<BankAcc>();
		
		MMCurrentAcc cAcc = new MMCurrentAcc(101, "Raj", accBal, creditLimit);
		MMSavingAcc SAcc = new MMSavingAcc(105, "Jay", accBal, true);
		
		System.out.println("************** WELCOME TO *************");
		welcome();
		System.out.println("PRESS 1/2:");
		System.out.println("1. CREATE NEW ACCOUNT\n2. LOGIN");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			isSalaried = true;
			break;
		case 2:
			isSalaried = false;
			break;
		default:
			System.out.println("INVALID OUTPUT");
			break;
		}
		System.out.println("YOUR Account Opening Balance must be minimum 1000rs:");
		System.out.println("Enter Amount:");
		accBal = sc.nextFloat();
		while (accBal < sAcc.getMinbal()) {
			if(accBal < sAcc.getMinbal()) {
				System.out.println("**Please pay Remaining Amount " + (sAcc.getMinbal() - accBal) + "**");
				System.out.println("Enter Amount:");
				accBal = accBal + sc.nextFloat();
			}
		}
		//saving account object creation
		SavingAcc sAccNew = new MMSavingAcc(++accNo,accNm,accBal, isSalaried);
		System.out.println(sAccNew.toString());
		welcome();
		System.out.println("1.Deposite 2. Withdraw 3. Exit");
		choice = sc.nextInt();
		switch  (choice) {
		case 1:
			System.out.println("Enter Ammount:");
			amt = sc.nextFloat();
			sAccNew.deposite(amt);
			break;
		case 2:
			System.out.println("Enter Amount:");
			amt = sc.nextFloat();
			sAccNew.withdraw(amt);
			break;
		case 3:
			System.out.println("Logout Successfully");
		default :
			System.out.println("Invalid Option");
			break;
		}
		break;
		case 2://current
			accBal = 0;
			System.out.println("Your Account Opening Balance must be minimum 5000rs.");
			System.out.println("Enter Ammount:");
			accBal = sc.nextFloat();
			while (accBal < 5000) {
				if (accBal < 5000) {
					System.out.println("***Please pay Remining Amount" + (5000 - accBal) +"***");
					System.out.println("Enter Ammount:");
					accBal = accBal + sc.nextFloat();
					
				}
			}
	// current account object creation
			MMCurrentAcc cAccNew = new MMCurrentAcc(accNo++ ,accNm ,accBal ,creditLimit);
			cAccNew.toString();
			welcome();
			System.out.println("1.Deposite 2. Withdraw 3. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Ammount:");
				amt = sc.nextFloat();
				cAccNew.deposite(amt);
				System.out.println("CREDIT LIMIT:" + "Raj");
				break;
			case 2:
				System.out.println("Enter Ammount:");
				amt = sc.nextFloat();
				cAccNew.withdraw(amt);
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Ammount:");
				break;
			}
			break;
        default:
				System.out.println("Invalid Option");
				break;
	}
	break;
	case 2: //login
		System.out.println("Enter Account Number:");
		int accNochoice = sc.nextInt();
		if(accNoPrice == 105) {
			//previous code of saving account impelmentation
			System.out.println("Welcome".toUpperCase()+sAcc.getAccNm());
			welcome();
			System.out.println("1.Deposite 2. Withdraw 3. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Ammount:");
				amt = sc.nextFloat();
				sAcc.deposite(amt);
				break;
			case 2:
				System.out.println("Enter Amount:");
				amt = sc.nextFloat();
				sAcc.withdraw(amt);
				break;
			case 3:
				System.out.println("Logout Successfully");
			default :
				System.out.println("Invalid Option");
				break;
			}
			break;
		}else if (accNochoice == 101) {
			//previous code of current account implementation
			System.out.println("Welcome".toUpperCase() + cAcc.getAccNm());
			welcome();
			System.out.println("1.Deposite 2. Withdraw 3. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Ammount:");
				amt = sc.nextFloat();
				cAcc.deposite(amt);
				System.out.println("CREDIT LIMIT:" + cAcc.getCreditLimit());
				break;
			case 2:
				System.out.println("Enter Ammount:");
				amt = sc.nextFloat();
				cAcc.withdraw(amt);
				break;
			case 3:
				break;
			default:
				System.out.println("Invalid Ammount:");
				break;
			}
			break;
		}else
			System.out.println("Wrong Account Number, Please check again..");
		break;
		default:
			System.out.println("Invalid Option");
			break;
      }
   }
   static public void welcome() {
	   System.out.println("#########################");
	   System.out.println("***** MoneyMoney_Bank*****");
	   System.out.println("##########################");
	   System.out.println("****************************");
	   }
		
			
			
			
	
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	    
		


