package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class calcfloat {
	public static void main(String args[]){
	 float a,b;
	 String name;
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter your name");
	 name=s.nextLine();
	 System.out.println("enter your first number");
	 a=s.nextFloat();
	 System.out.println("enter your second number");
	 b=s.nextFloat();
	 System.out.println("calculator is operated by"+name);
	 System.out.println("addition of given numbers="+(a+b));
	 System.out.println("subtraction of given numbers="+(a-b));
	 System.out.println("multiplication of given numbers="+(a*b));
	 System.out.println("division of given numbers="+(a/b));
	}
}
