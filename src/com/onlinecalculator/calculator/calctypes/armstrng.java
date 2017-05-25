package com.onlinecalculator.calculator.calctypes;
import java.util.*;
public class armstrng {
	public static void main(String arg[]){
		int temp,n,x,sum=0;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		 temp=n;
		 while(n>0){
			x=n%10;
			n=n/10;
			sum=sum+(x*x*x);
		}
		if(temp==sum)
			System.out.println("this is an armstrong number");
		else
			System.out.println("this is not an armstrong number");

	}


}
