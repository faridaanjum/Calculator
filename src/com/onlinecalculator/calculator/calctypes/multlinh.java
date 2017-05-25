package com.onlinecalculator.calculator.calctypes;



class A1
{
	void display()
	{
		System.out.println("this is parent class");
	}
}
class B1 extends A1{
	void output()
	{
		System.out.println("this is child class");
	}
}
class c extends B1{
	void abc(){
		System.out.println("this is super child class");
	}
}
public class multlinh {
	
	public static void main(String args[]){
		c obj=new c();
		obj.display();
		obj.output();
		obj.abc();
		
	}

}


