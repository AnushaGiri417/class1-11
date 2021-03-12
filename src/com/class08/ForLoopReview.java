package com.class08;

import java.util.Scanner;

public class ForLoopReview {

	public static void main(String[] args) {
		
/*		int num=23;
		for(int i =1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		} */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please pay for the soda");
		double pay=sc.nextDouble();
		
		while(pay!=3) {
			if(pay>3) {
				System.out.println("Please give less moneyy");
			}else if(pay<3) {
				System.out.println("Please give more money");
			}
			
			  pay=sc.nextDouble();
		}
		
		System.out.println("Thank you for the payment, you can have your soda");
		
		
		


	}

}
