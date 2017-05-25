package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
class calc2
{
	double a,b,c,res;
	int ch;
	public calc2()
       {
		a=0;
		b=0;
		c=0;
		ch=0;
		res=0;
	}
	
	public int menu()
       {
		System.out.println("**********************");
		System.out.println("*********menu*********");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("**********************");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		return 0;
   	}
	
   public void userInputs()
   {
   	Scanner s=new Scanner(System.in);
   	System.out.println("enter the 1st number");
   	a=s.nextDouble();
   	System.out.println("enter the 2nd number");
   	b=s.nextDouble();	
   	
   }

   public void performOperation()
{
   	
       switch(ch)
       {
       case 1: res=add();
       		System.out.println(res);
       		break;
       case 2: res=subtract();
       		System.out.println(res);
       		break;
       case 3: res=multiply();
       		System.out.println(res);
       		break;
       case 4: res=divide();
				System.out.println(res);
				break;		
       }
      
}  
   
  
	double add()
	{
		c=a+b;
		return c;
	}
	
	double subtract()
	{
		c=a-b;
		return c;
	}
	
	double multiply()
	{
		c=a*b;
		return c;
	}
	
	double divide()
	{
		c=a/b;
		return c;
	}
	
}
	public class calcdouble
	{
	public static void main(String args[]) {
		calc2 c=new calc2();
		
			c.menu();
				   
		   c.userInputs();
		   c.performOperation();
		   
		      }
	
	}	
	
