package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class switchclass {
	public static void main(String args[]){
		int a,b,ch;
		while(true){
		System.out.println("**********************");
		System.out.println("*********menu*********");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.exit");
		System.out.println("**********************");
		
		Scanner s=new Scanner(System.in);
		
    	System.out.println("enter the 1st number");
    	a=s.nextInt();
    	System.out.println("enter the 2nd number");
    	b=s.nextInt();	
    	System.out.println("enter your choice");
    	ch=s.nextInt();
    	
		           switch(ch)
		           {
		           case 1:
		           		System.out.println("add "+(a+b));
		           		break;
		           case 2: 
		           		System.out.println("sub "+(a-b));
		           		break;
		           case 3: 
		           		System.out.println("mul "+(a*b));
		           		break;
		           case 4: 
		   				System.out.println("div "+(a/b));
		   				break;	
		           case 5:
		        	   System.out.println("bye");
		        	   System.exit(0);
		            default :System.out.println("enter a correct choice");
		                    break;
		           }
		          
		}
	}

}
