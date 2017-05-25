package com.onlinecalculator.calculator.calctypes;
import java.util.*;
public class ifeleifclass {
	public static void main(String args[]){//main method is starting
		int a,b,c;
		
		Scanner s=new Scanner(System.in);//dynamic input
		
		 System.out.println("enter the first number");
		 a=s.nextInt();
		 System.out.println("enter the second number");
		 b=s.nextInt();
		 System.out.println("enter the third number");
		 c=s.nextInt();
		 if((a>b)&&(a>c))
		 {
			 System.out.println("first number is the biggest number");
				 
		 }
		 else if((b>a)&&(b>c))
			 System.out.println("second number is the biggest number");
		 else
			 System.out.println("third number is the biggest number");
		 
			 
			 
	}

}
