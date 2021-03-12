package com.class06;

import java.util.Scanner;

public class HomeworkClass06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//1.
	/*	String country, language;
		 System.out.println("Please enter your country name");
		 country=sc.next();
		 
		 switch(country) {
		 case "Nepal": language="Nepali";break;
		 case "India": language="Hindi";break;
		 case "Pakistan": language="Urdu";break;
		 case "America": language="English";break;
		 case "China": language="Mandrian";break;
		 default: language="Unknown";
		 }
		 System.out.println("You speak "+language+" language"); 
		 
		 
		 
//2.
		 System.out.println("Please enter your grade");
		 String grade=sc.next();
		 
		 switch(grade) {
		  case "A": System.out.println("Excellent");break;
		  case "B": System.out.println("Good");break;
		  case "C": System.out.println("Average");break;
		  case "D": System.out.println("Bad");break;
		  default: System.out.println("Not Acceptible"); 
		 }
		 
	*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//3.
		 int num1, num2,result;
		 System.out.println("Please enter num1");
		 num1=sc.nextInt();
		 System.out.println("Please enter num2");
		 num2=sc.nextInt();
		 System.out.println("Please enter an operator");
		 String sign=sc.next();
		 
		 //OR char sign=sc.next().charAt(0);
		 
		  switch(sign) {
		  case"+": result=num1+num2;break;
		  case"-": result=num1-num2;break;
		  case"*": result=num1*num2;break;
		  case"/": result=num1/num2;break;
		  default: result=0;
		  }
		 if(result!=0) {
			 System.out.println("The result of your numbers is "+result);
		 }
						 
	 sc.close();
 	}
}
