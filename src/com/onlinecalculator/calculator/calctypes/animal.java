package com.onlinecalculator.calculator.calctypes;
import java.util.*;
 class animal1 {
String name;
int lifespan;
String shelter;
void input(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter name");
	name=s.nextLine();
	System.out.println("enter lifespan");
	lifespan=s.nextInt();
	Scanner s1=new Scanner(System.in);
	System.out.println("enter shelter");
	shelter=s1.nextLine();
	}
void speak(){
System.out.println("the"+name+"has lifespan"+lifespan+"years");
System.out.println("speaking by voice sound");
}
void move()
{
	System.out.println("the "+name +"is moving from"+shelter+"to some where");
	
}
}
public class animal{
	public static void main(String args[]){
		animal1 a=new animal1();
		a.input();
		a.speak();
		a.move();
	}
}
