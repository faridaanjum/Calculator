package com.onlinecalculator.calculator.calctypes;
import java.util.*;
class Calc1
{
	float a,b,c,res;
	int ch;
	public Calc1()
       {
		a=0;
		b=0;
		c=0;
		ch=0;
		res=0;
	}
	
	public void  menu()
       {
		
		
		System.out.println("**********************");
		System.out.println("*********menu*********");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.exit");
		System.out.println("**********************");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
	    
		
		
   	}
	
   public void userInputs()
   {
   	Scanner s=new Scanner(System.in);
   	System.out.println("enter the 1st number");
   	a=s.nextFloat();
   	System.out.println("enter the 2nd number");
   	b=s.nextFloat();	
   	
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
       case 5: System.out.println("bye");
                System.exit(0);			
	   default : System.out.println("enter correct input");			
       }
      
}  
   
  
	float add()
	{
		c=a+b;
		return c;
	}
	
	float subtract()
	{
		c=a-b;
		return c;
	}
	
	float multiply()
	{
		c=a*b;
		return c;
	}
	
	float divide()
	{
		c=a/b;
		return c;
	}
	
}
public class floatcalc {
	public static void main(String args[]) {
		Calc1 c=new Calc1();
		
		
			c.menu();
		    c.userInputs();  
		  
		   c.performOperation();
		   
		  
	}
}
