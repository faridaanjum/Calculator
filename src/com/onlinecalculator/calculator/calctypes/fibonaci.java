package com.onlinecalculator.calculator.calctypes;
import java.util.*;
class xyz {
		void fib(int n,int x,int t){
			int sum;
			if(n==0)
				return;
			sum=x+t;
			System.out.println(x);
	        x=t;
	        t=sum;
			n--;
			fib(n,x,t);

		}
	}
	public class fibonaci {
		public static void main(String arg[]){
			int n,x=0,t=1;
			System.out.println("enter how many numbers do u want to print");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			xyz s=new xyz();
			System.out.println("fibonaci series...");
            s.fib(n,x,t);	
			
			
		}

	}


