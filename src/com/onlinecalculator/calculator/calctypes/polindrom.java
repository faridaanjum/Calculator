package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class polindrom {
	public static void main(String arg[])
	{
		int n,x,sum=0,temp;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0){
			x=n%10;
			n=n/10;
			sum=(sum+x)*10;
		}
		sum=sum/10;
		if(temp==sum)
			System.out.println("this is polindrom");
		else
			System.out.println("this is not a polindrom");


	}
}

