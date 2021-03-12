package com.grouptask;

import java.util.Scanner;

public class Prime_Or_Composite_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number;
		boolean isPrime=true;
		
		System.out.println("Please enter a number");
		number=sc.nextInt();
		
		if(number<1) {
			System.out.println("Please enter a number greater than 1");
		}else if(number==1) {
			System.out.println("1 ia neither Prime nor Composite");
		}else {
			
			for(int i=2; i<number; i++) {
				if(number%i==0) {
					isPrime = false;
					break;
				}				
				}
			
			if(isPrime) {
				System.out.println(number+" is a prime number");
			}else {
				System.out.println(number+" is a Composite number");
			}
			
			}
		
		
		
		

	}

}
