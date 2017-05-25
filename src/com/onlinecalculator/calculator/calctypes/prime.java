package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class prime {
		public static void main(String args[]){
				
				int i,n, count=0,j;
				System.out.println("enter the number upto where u want to print");
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
				System.out.println("prime numbers upto "+n);
				for(i=1;i<=n;i++){
					for(j=1;j<=i;j++){
						if(i%j==0)
							count++;
					}
					if(count==2)
				 System.out.println(i);
					count=0;
				}
			}
}

