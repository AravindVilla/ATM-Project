package Anantapur;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer>data=new HashMap<Integer,Integer>();

	public void getLogin()throws Exception{
		int x=1;
		do {
			try {
				
			data.put(871220, 4444);
			data.put(990898, 5555);
			data.put(798995, 6666);
			
			System.out.println("Welcome to The ATM Center");
			System.out.println("Enter your customer Number");
			setCustomerNumber(menuInput.nextInt());
			
			System.out.println("Enter the pin Number");
			setpinNumber(menuInput.nextInt());
			}catch(Exception e) {
				System.out.println("\n"+"invalid Character(s)only Numbers."+"\n");
				x=2;
			}
			int cn=getpinNumber();
			int pn=getpinNumber();
			if(data.containsKey(cn)&&data.get(cn)==pn) {
				getAccountType();
			}else
				System.out.println("\n"+"Wrong customer Number"+"\n");
		}while(x==1);
	}
	public void getAccountType() {
		System.out.println("select the Account you want to Access");
		System.out.println("Type 1-Checking Account");
		System.out.println("Type 2-Saving Account");
		System.out.println("Type 3-Exit");
		
		int selection=menuInput.nextInt();
		switch(selection) {
		case 1:
			getcheckingBaalance();
		case 2:
			getsavingBalance();
		case 3:
			System.out.println("Thank you for using ATM,Bye.  \n" );
			break;
			default:
				System.out.println("\n"+"Invalid choice."+"\n");
				getAccountType();
		}
	}
    public  void getChecking() {
    	System.out.println("Checking Account:");
    	System.out.println("Type 1-    view Balance");
    	System.out.println("Type 2-    Withdraw Balance");
    	System.out.println("Type 3-    Deposit Balance");
    	System.out.println("Type 4-    Exit");
     int Selection= menuInput.nextInt();
     
    switch (Selection){
    	 case 1:
    		 System.out.println("Checking Account BAlance:"+moneyFormat.format(getcheckingBaalance()));
    		 getAccountType();
    		 break;
    		 
    	 case 2:
    		 getcheckingWithdrawInput();
    		 getAccountType();
    		 break;
    	 case 3:
    		 getcheckingDepositInput();
    		 getAccountType();
    		 break;
    	 case 4:
    		 System.out.println("Thank you for Using ATM, Bye.");
    		 break;
    		 
    		 default:
    			 System.out.println("\n"+"Invalid choice."+"\n");
    			 getChecking();
     }
   
	
	}
    public void getsaving() {
    	System.out.println("Checking Account:");
    	System.out.println("Type 1-    view Balance");
    	System.out.println("Type 2-    Withdraw Balance");
    	System.out.println("Type 3-    Deposit Balance");
    	System.out.println("Type 4-    Exit");
     int Selection= menuInput.nextInt();
     
    switch (Selection){
    	 case 1:
    		 System.out.println("Saving Account BAlance:"+moneyFormat.format(getsavingBalance()));
    		 getAccountType();
    		 break;
    		 
    	 case 2:
    		 getcheckingWithdrawInput();
    		 getAccountType();
    		 break;
    	 case 3:
    		 getcheckingDepositInput();
    		 getAccountType();
    		 break;
    	 case 4:
    		 System.out.println("Thank you for Using ATM, Bye.");
    		 break;
    		 
    		 default:
    			 System.out.println("\n"+"Invalid choice."+"\n");
    			 getsaving();
     }


		
		
    }
	}

	


