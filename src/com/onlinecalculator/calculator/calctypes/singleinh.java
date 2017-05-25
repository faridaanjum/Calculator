package com.onlinecalculator.calculator.calctypes;

class A
{
	void display()
	{
		System.out.println("this is parent class");
	}
}
class B extends A{
	void output()
	{
		System.out.println("this is child class");
	}
}
public class singleinh {
	
	public static void main(String args[]){
		B obj=new B();
		obj.display();
		obj.output();
		
	}

}
