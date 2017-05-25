package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

class instance {
	int n;
	void input(){
		
    System.out.println("enter the value");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	}
	    void display(){
	    	
	    	System.out.println("instance variable :"+n);
	    }
}
public class instancev{
	
		public static void main(String[] args) {
			instance i=new instance();
			 i.input(); 
			i.display();

		}

	}


