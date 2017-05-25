package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class logical {
	public static void main(String args[]){//main method is starting
		boolean a,b;
		Scanner s=new Scanner(System.in);//dynamic input
		System.out.println("enter the first boolean value");
		 a=s.nextBoolean();
		 System.out.println("enter your second boolean value");
		 b=s.nextBoolean();
		 System.out.println("a&&b"+(a&&b));//(&&) operation
		 System.out.println("a||b "+(a||b));//(||) operation
		 System.out.println("!(a&&b)"+!(a&&b));//(!) operation
	}

}
