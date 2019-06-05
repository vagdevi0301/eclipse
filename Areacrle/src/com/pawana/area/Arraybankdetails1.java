package com.pawana.area;
import java.util.Scanner;
public class Arraybankdetails1 {
	static int i=0;
	public static double[] balance=new double[5];
	public static int[] accountnumber=new int[5];
	public static String[]  name=new String[5];
	public void register()
{
	Scanner v=new Scanner(System.in);
	System.out.println("enter the account num");
	 accountnumber[i]=v.nextInt();
	 Scanner b=new Scanner(System.in);
	 System.out.println("enter the customer name ");
	  name[i]=b.nextLine();
	  Scanner c=new Scanner(System.in);
	 System.out.println("enter the account num");
	 balance[i]=c.nextDouble();
	 System.out.println("registered successfully.....");
	 i++;
}
public double depositamount(int accountnum,double amount)
{
	if(amount<0)
	{
	try {
		throw new InvalidAmountException("Enter The Valid Amount To Deposit");
	} catch (InvalidAmountException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	int k=0;
	for( k=0;k<accountnumber.length;k++) {
		if(accountnumber[k]==accountnum) {
			balance[k]=balance[k]+amount;
			break;
		}
		
	}
	if(k==accountnumber.length) {
		try {
			throw new AccountNotRegisteredException("Account Number matched in Our Records");
		} catch (AccountNotRegisteredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return balance[k];
}
public double withdraw(int accountnum,double amount)
{
	if(amount<0)
	{
	try {
		throw new InvalidAmountException("Enter The Valid Amount To Deposit");
	} catch (InvalidAmountException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	}
	int k=0;
	for( k=0;k<accountnumber.length;k++) {
		if(accountnumber[k]==accountnum) {
			if( amount>balance[k]);
			{
				try {
					throw new InsufficientBalanceException("Amount is not sufficient in your account");
				} catch (InsufficientBalanceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				balance[k]=balance[k]-amount;
			break;}}
	if(k==accountnumber.length) {
		try {
			throw new AccountNotRegisteredException("Account Number matched in Our Records");
		} catch (AccountNotRegisteredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}}
	return balance[k];
	}
public double checkbalance(int accountnum)
{
	int k=0;
	for( k=0;k<accountnumber.length;k++) {
		if(accountnumber[k]==accountnum) {
			return balance[k];
		}}
	if(k==accountnumber.length) {
		try {
			throw new AccountNotRegisteredException("Account Number matched in Our Records");
		} catch (AccountNotRegisteredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	return balance[k];
	}

public void exit()
{
	System.out.println("thank you for using");
}
}