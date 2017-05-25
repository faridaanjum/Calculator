package com.onlinecalculator.calculator.calctypes;
import java.util.*;//import for scanner method
public class assignment {
	public static void main(String args[]){//main method is starting
		int a,b,c,d;
		Scanner s=new Scanner(System.in);//dynamic input
		System.out.println("enter the first value");
		 a=s.nextInt();
		 System.out.println("enter your second number");
		 b=s.nextInt();
		 c=a;d=b;//= assignment operation
		 System.out.println("addition of given numbers="+(a+=b));//(+=) operation
		 a=c;b=d;
		 System.out.println("subtraction of given numbers="+(a-=b));//(-=) operation
		 a=c;b=d;
		 System.out.println("multiplication of given numbers="+(a*=b));//(*=) operation
		 a=c;b=d;
		 System.out.println("division of given numbers="+(a/=b));//(/=)operation
		 a=c;b=d;
		 System.out.println("modulous of given numbers="+(a%=b));//(%=) operation
		 
	}


}
