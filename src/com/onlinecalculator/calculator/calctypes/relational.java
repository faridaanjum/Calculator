package com.onlinecalculator.calculator.calctypes;
import java.util.*;//import for scanner method
public class relational {
	public static void main(String args[]){//main method is starting
		int a,b;
		Scanner s=new Scanner(System.in);//dynamic input
		System.out.println("enter the first value");
		 a=s.nextInt();
		 System.out.println("enter your second number");
		 b=s.nextInt();
		 System.out.println("a<=b "+(a<=b));//(<=) operation
		 System.out.println("a>=b "+(a>=b));//(>=) operation
		 System.out.println("a==b "+(a==b));//(==) operation
		 System.out.println("a!=b "+(a!=b));//(!=) operation
		 System.out.println("a>b "+(a>b));//(>) operation
		 System.out.println("a<b "+(a<b));//(<) operation
		 
	}


}
