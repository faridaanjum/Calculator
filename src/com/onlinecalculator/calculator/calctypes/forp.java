package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class forp {
	public static void main(String args[]){//main method is starting
		int a;
		String b;
		Scanner s=new Scanner(System.in);//dynamic input
		
		 System.out.println("enter the string");
		 b=s.nextLine();
		 System.out.println("enter howmany times u want to repeat");
		 a=s.nextInt();
		 for(int i=0;i<a;i++)//repeating the loop
		 System.out.println(b);
	}


}
