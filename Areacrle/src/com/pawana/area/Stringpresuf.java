package com.pawana.area;

public class Stringpresuf {
	public static void main(String[] args) {
		String a="yellow lemon";
		String b="green lemon";
		String r ="";
for(int i=a.length()-1;i>=0;i--)
		{
			if(a.charAt(i)!=b.charAt(i-1))
				break;
			else
			{
				r=a.charAt(i)+r;
			}}
			System.out.println(a);
		System.out.println(b);
		System.out.println(r);
	}}

		