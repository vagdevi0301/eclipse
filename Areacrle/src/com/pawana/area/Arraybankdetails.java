package com.pawana.area;
import java.util.Scanner;
public class Arraybankdetails {
public static void main(String[] args) {
		String choice;
		do{System.out.println("refister");
		System.out.println("deposit amount");
		System.out.println("withdraw amount");
		System.out.println("exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
		Arraybankdetails1 bank=new Arraybankdetails1();
		switch(a)
		{
		case 1:bank.register();break;
		case 2:
		{
			System.out.println("Enter the Account no:");
			int accountnum=sc.nextInt();
			System.out.println("Enter the amount to deposit :");
			double amount=sc.nextDouble();
			double balance=bank.depositamount(accountnum, amount);
			System.out.println("update balance :"+balance);
			break;
		}
		case 3:
	 	{
			System.out.println("Enter the Account no:");
			int accountnum=sc.nextInt();
			System.out.println("Enter the amount to withdraw :");
			double amount=sc.nextDouble();
			double balance=bank.withdraw(accountnum, amount);
			System.out.println("update balance :"+balance);
			break;}
		case 4:{
	    System.out.println("Enter the Account no:");
		int accountnum=sc.nextInt();
		double balance=bank.checkbalance(accountnum );
		System.out.println("update balance :"+balance);
		break;}
		case 5: System.out.println("thanks for using Application...");
		System.exit(0);
		break;
		default:System.out.println("please try again");
		}
		System.out.println("Do you want to continue[y/n] :");
		choice=sc.next();
		}
		while(choice.equalsIgnoreCase("y"));
		System.out.println("thanks for using Application...");
		}}
