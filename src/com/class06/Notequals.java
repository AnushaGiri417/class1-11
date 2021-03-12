package com.class06;

import java.util.Scanner;

public class Notequals {

	public static void main(String[] args) {
	
/*		boolean rain=false;
		    if(!rain) {
			   System.out.println("I will go out");
		     }

	boolean boo=!true;
	System.out.println(boo);
	
	boolean traffic=false;
	
	if(!traffic) {
		System.out.println("I will come on time");
	}
		String day="Moday";
		   if(!day.equals("Friday")) {
			   System.out.println("Today is not Friday");
		   }
		boolean homework=true;
		  if(!homework) {
			  System.out.println("I will be happy");
		  }
*/		  
		  
	
		
		
  /*
   * we need to calculate final price after discount
   * 
   * we check if there is sale
   * if no sale----> I am not going for shopping
   * if there is sale:
   *         we will ask the items
   *         we will ask price
   *         
   *    if price is less then 10-->5% discount
   *    if price is between 10 to 100-->10% discount
   *    if price is between 101 to 500-->20% discount
   *    if price is between 501 to 1000-->30% discount	
   *    
   *  Which item you purchased, what was original price, what discount applied and final price	  
   */
	System.out.println("Is there a sale today?");	  
	Scanner sc=new Scanner(System.in);
	
	boolean sale= sc.nextBoolean();
	  if(!sale) {
		  System.out.println("I am not going for shopping");
	  }else {
		  System.out.println("What items are on sale?");
		    String items=sc.next();
		  System.out.println("What is the price?");
		      double price1, price2;
		      price1=sc.nextDouble();
		      
		      if(price1<=10) {
		    	  price2=0.05*price1;
		      }else if(price1>10 && price1<=100) {
		    	  price2=0.1*price1;
		      }else if(price1>=101 && price1<=500) {
		    	  price2=0.2*price1;
		      }else {
		    	  price2=0.3*price1;
		      }
		    System.out.println("The final price for your "+ items +" is :"+(price1-price2));  
		  
	  }

		
//Ram's Code
	  
	  double discount,totalPrice;
		Scanner input = new Scanner(System.in);
		System.out.println("Is there is any sale!!!!");
		String ans = input.next();
		if((!ans.equals("yes"))) {
			System.out.println("How many items are in sale?");
			System.out.println("What are the prices?");
			int price=input.nextInt();
			if(price>10) {
				totalPrice=price-(price*0.05);
				discount=price*0.05;
			} else if(price>=10&&price<100) {
				totalPrice=price-(price*0.10);
				discount=price*0.10;
			}else if(price>=100&&price<500) {
				totalPrice=price-(price*0.20);
				discount=price*0.20;
			}else {
				totalPrice=price-(price*0.50);
				discount=price*0.50;
			}
			System.out.println("Your price is "+price+" and Your discount is "+discount+" Your final price is "+totalPrice);
			
			
		}else {
			System.out.println("I am not going for shopping");
		}

  
		  
		  
		  
		
	}

}
