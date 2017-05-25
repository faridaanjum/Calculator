package com.onlinecalculator.calculator.calctypes;
import java.util.*;// import for scanner method
public class incanddec {
	public static void main(String args[]){//main method is starting
		int a,c;
		Scanner s=new Scanner(System.in);//dynamic input
		System.out.println("enter the  value");
		 a=s.nextInt();
		 c=a;//= assignment operation
		 System.out.println("post increment of given number="+(a++));//post increment operation
		 System.out.println(a);
		 a=c;
		 System.out.println("preincrement of given number="+(++a));//pre increment operation
		 a=c;
		 System.out.println("postdecrement of given number="+(a--));//post decrement operation
         System.out.println(a);
		 a=c;
		 System.out.println("predecrement of given number="+(--a));// pre decrement operation
		 
		 
	}


}
