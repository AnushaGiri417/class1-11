package com.class05;

import java.util.Scanner;

public class SaturdayHomework {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

//1.
	
	   String month;
	   String season;

	   System.out.println("Please enter your birth month");
	   month=sc.next();
	
	 if(month.equals("Sep") || month.equals("Oct") || month.equals("Nov")) {
		    season="Fall";
	      }else if(month.equals("Dec") || month.equals("Jan") || month.equals("Feb")) {
		     season="Winter";
	      }else if(month.equals("March") || month.equals("April") || month.equals("May")) {
		   season="Spring";
	      }else if(month.equals("June") || month.equals("July") || month.equals("August")) {
		   season="Summer";
	  }else {
		   season="Invalid";
	}

	 System.out.println("You were born in season : "+season);  
	 
	 
//2.
	 
	 int a,b,c;
	 System.out.println("Please enter first number ");
	    a=sc.nextInt();
	 System.out.println("Please enter second number ");
	    b=sc.nextInt();
	 System.out.println("Please enter third number ");
	    c=sc.nextInt();
	    
	 if(a>b && b>c) {
		 System.out.println(a+" is the largest number");
	 }else if(b>c && c>a) {
		 System.out.println(b+" is the largest number");
	 }else {
		 System.out.println(c+" is the largest number");
	 } 
	 
	 
	 
	 
	    if(a>b) {
	    	if(b>c) {
	    		System.out.println(a+" is the largest number");
	    	}
	   }else if(b>c) {
		     if(c>a) {
		    	 System.out.println(b+" is the largest number");
		     }
	   }else {
		   System.out.println(c+" is the largest number");
	   }
	 
	 
	
	
	   
   }
	
}
