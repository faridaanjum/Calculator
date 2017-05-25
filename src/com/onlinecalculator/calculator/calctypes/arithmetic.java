package com.onlinecalculator.calculator.calctypes;
import java.util.*;//import statement for scanner method
public class arithmetic {
	public static void main(String args[]){//main method is starting
		int a,b;
		Scanner s=new Scanner(System.in);//dynamic input
		System.out.println("enter the first value");
		 a=s.nextInt();
		 System.out.println("enter your second number");
		 b=s.nextInt();
		 System.out.println("addition of given numbers="+(a+b));//addition operation
		 System.out.println("subtraction of given numbers="+(a-b));//subtraction operation
		 System.out.println("multiplication of given numbers="+(a*b));//multiplication operation
		 System.out.println("division of given numbers="+(a/b));//division operation
		 System.out.println("modulous of given numbers="+(a%b));//modulo operation
		 
	}

}
