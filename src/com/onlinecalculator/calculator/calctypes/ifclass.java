package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class ifclass {
	public static void main(String args[]){//main method is starting
		int a,b;
		
		Scanner s=new Scanner(System.in);//dynamic input
		
		 System.out.println("enter the first number");
		 b=s.nextInt();
		 System.out.println("enter the second number");
		 a=s.nextInt();
		 if(a==b)//repeating the loop
		 System.out.println("numbers are equal");
		 else
			 System.out.println("numbers are not equal");
			 
	}

}
