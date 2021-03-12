package com.class08;

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {

		
/*	for(int i=1; i<=50; i++) {
		if(i%3==0) {
			
		continue;
			
		}
		
		System.out.print(i+" ");
		
	}
		
System.out.println();
System.out.println("------------------------------------------------------------------------------"); */

  Scanner sc=new Scanner(System.in);
  
 /*   System.out.println("Do you want to apply for credit card?");
    String result=sc.next();
     
    while(!result.equals("Yes")) {
    	
    	System.out.println("Do you want to apply for credit card?");
          result=sc.next();
    	
    }
    System.out.println("Thank you for applying!!");
    
    
    
 System.out.println("----------------------------------------------------------------------------");   */

/*
   System.out.println("Please enter starting number");
   int num1=sc.nextInt();
   
   System.out.println("Please enter ending number");
	int num2=sc.nextInt();
	
	int sumEven=0, sumOdd=0;
	
if(num1<num2) {	
     for(int i=num1; i<=num2; i++) {
    	 if(i%2==0) {
    	    sumEven+=i;
    	   }
    	 else{
    		 sumOdd+=i;
    	 }
    	  }
     
     System.out.println(sumEven);
 	 System.out.println(sumOdd);
    
}
    
    
    
    
    
System.out.println("---------------------------------------------------------------------------"); 

*/

/*

String item;
double price, money, remainder;
double sum=0;

    System.out.println("Enter item you want to buy");
     item=sc.next();
    
    System.out.println("What is the price of the "+item+"?");
     price=sc.nextDouble();
    
    do {
    System.out.println("Please pay for the "+item);
       money=sc.nextDouble();
       sum+=money;
        
        if(sum<price) {
        	remainder = price-sum;
        	System.out.println("Please give me more "+remainder);
        	
        }else if(price<sum) {
        	 remainder = sum-price;
        	 System.out.println("Your change is "+remainder);
        	 break;
           }
        
        }while(price!=money);
    
    System.out.println("Thank you for shopping");
    
*/  
 
  
  
 //Ram's Code: 
   
/*  String item;
	int price,amount,reminder;
	int sum=0;
	
	System.out.println("Please enter the item and price of that item");
	item=sc.nextLine();
	
	System.out.println("Please enter the price of "+item);
	price=sc.nextInt();
	
	do {
	System.out.println("Please pay for "+item);
	amount=sc.nextInt();
	sum+=amount;
	
	if(sum<price) {
		reminder=price-sum;
		System.out.println("Please give me more money "+reminder);
	
	}else if(price<sum) {
		reminder=sum-price;
		System.out.println("Here is your change "+ reminder);
		break;
	}
	}while(price!=sum);
	System.out.println("Thank you for shopping");
	
	
*/		
	
  String item;
  int price, money, remainder;
  int sum=0;
  
  System.out.println("Please enter the item");
  item=sc.next();
  
  System.out.println("What is the price of the "+item);
  price=sc.nextInt();
  
   do {
	   System.out.println("Please pay for the "+item);
	    money=sc.nextInt();
	    
	    sum+=money;
	    
	      if(sum<price) {
	    	  remainder=price-sum;
	    	  System.out.println("Please pay more"+remainder);
	      }else if(price<sum) {
	    	  remainder=sum-price;
	    	  System.out.println("Your change is "+remainder);
	      }else {
	    	  System.out.println("You gave the exact amount");
	    	  break;
	      }
	}while(money!=price);
  
   System.out.println("Thank you for shopping");
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
		
	}

}
