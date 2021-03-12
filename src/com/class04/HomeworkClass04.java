package com.class04;

import java.util.Scanner;

public class HomeworkClass04 {

	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
		
		System.out.println("What loan amount do you need?");
		int loan=sc.nextInt();
		     if(loan<=200000) {
			    System.out.println("Your loan is approved");
		     }else {
			     System.out.println(" Your loan is rejected");
		      }
		
		     
		     
		System.out.println("How old are you?");
		 int age=sc.nextInt();
		 sc.next();
		 if(age>=18) {
			 System.out.println("You are eligible for driver's license");
		 }else {
			 System.out.println("You can only get a learners Permit"); 
		 }
		 
		System.out.println("Enter a city name");
	     String city=sc.nextLine();
		 System.out.println("Enter temperature of the city in Fahrenheit");
		 int temp=sc.nextInt();
		 double tempC = 0.556*(temp-32);
		 System.out.println(tempC);
		 System.out.println("Temperature of "+city+" is "+tempC+" degrees");
		
		 
		 

/*		System.out.println("Do you have a credit card?");
		String cc=sc.nextLine();
		if(cc.equalsIgnoreCase("No")) {
			System.out.println("Would you like to have a credit card?");
		}else {
			System.out.println("What is your current balance?");
			int balance=sc.nextInt();
			
			if(balance>1000) {
				System.out.println("Please pay off immediately");
			}else {
				System.out.println("You can spend more till you run out.lol");
			}
		}  */           
		                     //OR
		 
		 boolean creditcard;
		 double balance;
		
		 System.out.println("Do you have a credit card?");
		 creditcard = sc.nextBoolean();
		 
		   if (creditcard) {
			   System.out.println("What is your current balance");
			    balance = sc.nextDouble();
			    
			      if (balance>1000) {
			    	  System.out.println("Please pay off immediately");
			      }else {
			    	  System.out.println("You can spend some more");
			      }
		   }else {
			   System.out.println("Would you like to have a credit card?");
		   }
		
		   
		   
	
	   System.out.println("How many years have you worked?");
	   int years=sc.nextInt();
	
	   System.out.println("What is your annual salary?");
	   int salary=sc.nextInt();
	
	if(years>=5) {
		System.out.println("You are eligible for bonus");
		
		  if(years>=5 && salary>50000) {
			  System.out.println("Your bonus is 5000");
		  }else {
			  System.out.println("Your bonus is 3000");
		  }
	}else {
		System.out.println("You are not eligible for bonus");
	}
	 
	
	 
	}

}
