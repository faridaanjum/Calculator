package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

class local {
	
		
	     void display(){
	    	int n;
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("enter any value");
	    	n=s.nextInt();
	    	System.out.println("local variable :"+n);
	    }
}
	public class localv2
	{
		public static void main(String[] args) {
			local l=new local();
			l.display();

		}

}
