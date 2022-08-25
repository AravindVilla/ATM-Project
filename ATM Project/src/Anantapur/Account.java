package Anantapur;

import java.io.DataInput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double CheckingBalance=0;
	private double savingBalance=0;
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.000");
	
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber= customerNumber;
		return customerNumber;
		 
			
		}
	public int getcustomerNumber() {
		return customerNumber;
		
	}
	public int setpinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	public int getpinNumber() {
		return pinNumber;
		
	}
	public double getcheckingBaalance() {
		return CheckingBalance;
		
	}
	public double getsavingBalance() {
		return savingBalance;
	} 
	public double calcheckingWithdraw(double amount) {
			CheckingBalance=(CheckingBalance-amount);
		return CheckingBalance;
	}
	public double calcSavingWithdraw(double amount) {
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
	public double calccheckingDeposit(double amount) {
		CheckingBalance=(CheckingBalance+amount);
		return CheckingBalance;
	}
	public double calsavingDeposit(double amount) {
		savingBalance=(savingBalance+amount);
		return savingBalance;
	}
	public void getcheckingWithdrawInput() {
		System.out.println("Checking account Balance: "+moneyFormat.format(CheckingBalance));
		System.out.println("Amount you want to Withdraw from checkingAccount");
	    double amount=input.nextDouble();
		
		
		if((CheckingBalance-amount) >0) {
			calcheckingWithdraw(amount);
			System.out.println("New checking  Account Balance:	"+moneyFormat.format(CheckingBalance));
			
		}else {
			System.out.println("Balance cannot be Nagitive."+"\n");
		}
		
	
	}
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance:"+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving Account");
		double amount=input.nextDouble();
		
		if((savingBalance-amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.println("new Saving account balance:"+moneyFormat.format(savingBalance));
			
		}else {
			System.out.println("Balance cannot be Nagitive."+"\n");
		}
	}
	public void getcheckingDepositInput() {
		System.out.println("checking Account Balance:"+moneyFormat.format(CheckingBalance));
		System.out.println("Amount you want to deposit from checking amount:");
		double amount=input.nextDouble();
		
		if((CheckingBalance+amount)>=0) {
			calccheckingDeposit(amount);
			System.out.println("new checking account Balance:"+moneyFormat.format(CheckingBalance));
			
		}else {
			System.out.println("Balance cannot be Negitive."+"\n");
		}
	}
	public void getsavingAccount() {
		System.out.println("Saving Account Balance:"+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from saving Account");
		double amount=input.nextDouble();
		
		
		if((savingBalance-amount)>=0) {
			calcheckingWithdraw(amount);
			System.out.println("New saving Account Balance:"+moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance cannot be Nagitive"+"\n");
		}
	}
	
}


