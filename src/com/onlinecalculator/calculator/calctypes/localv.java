package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class localv {
	
    static void display(){
    	int n;
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter any value");
    	n=s.nextInt();
    	System.out.println("local variable :"+n);
    }
	public static void main(String[] args) {
		display();

	}

}
