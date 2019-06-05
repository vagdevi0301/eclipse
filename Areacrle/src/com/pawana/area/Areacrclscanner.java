package com.pawana.area;

import java.util.Scanner;

public class Areacrclscanner {

	public static void main(String[] args) {
		double r;
		double pie=3.14;
		double area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the r value");
		r=s.nextDouble();
		 area=pie*r*r;
		System.out.println("Area of the circle:" +area);

	}

}
