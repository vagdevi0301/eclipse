package com.pawana.area;
import java.util.Scanner;
public class Bankdetails {
static String accounInfo[] = new String[2];
public static void main(String[] args) {
		int i=0;
		do {
			Scanner g = new Scanner(System.in);
			System.out.println("enter value a");
			int a = g.nextInt();
			switch (a) {
			case 1:register(i);i++;break;
			case 2:depositamount();break;
			case 3:withdraw();break;
			case 4:checkbalance();break;
			case 5:exit();break;
			}
		} while (true); }
private static void register(int i) {
	Scanner sc =new Scanner(System.in) ;
	System.out.println("enter the Account number");
     double accNo = sc.nextDouble();
	Scanner d =new Scanner(System.in);
	System.out.println("enter the user name");
	String accName = d.nextLine();
	String account =  accNo+"-"+accName;
	accounInfo[i] = account;}
private static void depositamount() {
		double total = 400;
		Scanner c = new Scanner(System.in);
		System.out.println("enter value deposit amount");
		double e = c.nextDouble();
		if (e <= 0) {
			throw new ArithmeticException("you have deposit invalid amount");
		} else {
			System.out.println("your account balance is : " + (total + e));
		}}
private static void withdraw() {
		double totalamount = 500;
		for(int index=0;index<accounInfo.length;index++) {
			if(accounInfo[index]!=null) {
			String account[] = accounInfo[index].split("-");
			System.err.println("account number "+account[0]);
			System.err.println("accountant name"+account[1]);
			}}
		Scanner y = new Scanner(System.in);
		System.out.println("Enter withdraw amount");
		double withdrawamount = y.nextDouble();
		if (totalamount <= withdrawamount) {
			throw new ArithmeticException("Insufficient balance in your account");
		} else {
			double remainingamount = totalamount - withdrawamount;
			System.out.println("total amount: " + totalamount);
			System.out.println("Remaining amount :" + remainingamount);
		}}
private static void checkbalance() {
		double t = 4000;
		System.out.println("balance: " + t);
	}
private static void exit() {
		System.out.println("thank you for using ");
	}}