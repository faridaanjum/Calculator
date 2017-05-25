package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class classv {
		static int n;
	    static void display(){
	    	
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("enter any value");
	    	n=s.nextInt();
	    	System.out.println("class variable :"+n);
	    }
		public static void main(String[] args) {
			display();

		}

	}


