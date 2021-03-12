package com.class07;

import java.util.Scanner;

public class Classwork07 {

	public static void main(String[] args) {
		
		int a=1;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
		
System.out.println();	

		int b=100;
		while(b>=1) {
			System.out.print(b+" ");
			b--;
		}
		
System.out.println();

   int c=20;
   while(c<=100) {
	   System.out.print(c+" ");
	   c=c+2;
   }
		
System.out.println();

//Using scanner with loops
//Capture different names 5 times and say hello to all
 
   Scanner sc=new Scanner(System.in);
   int i=1;
    while(i<=5) {
	   System.out.println("Please enter your name");
	   String name=sc.next();
   System.out.println("Hello "+name);
   i++;
   }
		
		

	}

}
