package com.onlinecalculator.calculator.calctypes;
import java.util.*;
class ecalc
{
	int a,b,c,ch,res;
	public ecalc()
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
		System.out.println("5.module");
		System.out.println("6.factorial");
		System.out.println("7.power(n^x)");
		System.out.println("**********************");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		return 0;
    	}
	
    public void userInputs()
    {
    	Scanner s=new Scanner(System.in);
    	if(ch==6)
    	{
    	System.out.println("enter the number");
    	a=s.nextInt();
    	}
    	else
    	{
    		System.out.println("enter the 1st number");
        	a=s.nextInt();
    		System.out.println("enter the 2nd number");
    	    b=s.nextInt();	
    	}
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
        case 5:res=module();
                System.out.println(res);
                break;
        case 6:res=fact(a);
                System.out.println(res);
                break;
        case 7:res=power(a,b);
                 System.out.println(res);
                 break;
         default: System.out.println("enter correct number");
         
        }
       
}  
    
   
	int add()
	{
		c=a+b;
		return c;
	}
	
	int subtract()
	{
		c=a-b;
		return c;
	}
	
	int multiply()
	{
		c=a*b;
		return c;
	}
	
	int divide()
	{
		c=a/b;
		return c;
	}
	int module()
	{
		c=a%b;
		return c;
	}
	int fact(int x)
	{
		int i,f=1;
		for(i=x;i>=1;i--)
			f=f*i;
		return f;
	}
	int power(int n,int x)
	{
		int t=1;
		for(int i=1;i<=x;i++)
			t=t*n;
		return t;
	}
	
}

public class excalc {
	public static void main(String args[]) {
		ecalc c=new ecalc();
		
			c.menu();
				   
		   c.userInputs();
		   c.performOperation();
		   
		      }
}
