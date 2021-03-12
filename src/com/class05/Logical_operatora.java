package com.class05;

import java.util.Scanner;

public class Logical_operatora {

	public static void main(String[] args) {
		
/* we have to identify if number is samll, medium, large, xlarge
 * if number between 1 and 10----small
 * if number between 11 and 100---medium
 * if number between 101 and 1000---large
 * if number between 1001 and 10000
 */
//AND LOGICAL OPERATOR
//  && ---> BOTH TRUE THEN TRUE
		
		int num = 11000;
		if(num<1 ) {
			System.out.println("Numner is 0 or negative");
		}else if (num>=1 && num<=10) {
			System.out.println(num+" is a small number");
		}else if(num>=11 && num<=100) {
			System.out.println(num+" is a medium number");
		}else if(num>=101 && num<=1000) {
			System.out.println(num+" is a large number");
		}else if(num>=1001 && num<=10000) {
			System.out.println(num+" is a xlarge number");
		}else {
			System.out.println("Number is huge number");
		}
		



//OR LOGICAL OPERATOR
//   ||------> ONE CONDITION IS TRUE RETURNS TRUE
		
/* variable day
 * 
 * if day is Tuesday or Wednesday--->Manual class
 * if day is Monday or Friday----->No class
 * if day is Thursday-------->Review class
 * if day is Saturday--------->Java class
 */

	
	String day = "Monday";
	
	if(day.equals("Monday") || day.equals("Friday")) {
		System.out.println("Today I have no class");
	}else if(day.equals("Tuesday") || day.equals("Wednesday")) {
		System.out.println("Today I have Manual class");
	}else if(day.equals("Thursday")) {
		System.out.println("Today I have review class");
	}else if(day.equals("Saturday") || day.equals("Sunday")) {
		System.out.println("Today I have Java class");
	}else {
		System.out.println("It is invalid day");
	}
		
	
	
/*ask user to enter age
 * based on the we will define
 * if age is from 1 to 3 -----> you are a baby
 * if age is from 3---->5 you are a big baby
 * if age is from 5 to 12--->you are a child
 * if age is from 13 to 19----> you are a teenager
 * if age is above 20-----> you are an adult
 */
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Please enter your name");
	String name = sc.next();
	System.out.println("Hello "+name);
	
	System.out.println("Enter your age");
	int age = sc.nextInt();
	if (age>=0 && age<1) {
		System.out.println("You are an infant");
	}else if(age>=1 && age<3) {
		  System.out.println("You are a baby");
	  }else if(age>=3 && age<5) {
		  System.out.println("You are a big baby");
	  }else if(age>=5 && age<=12) {
		  System.out.println("You are a child");
	  }else if(age>12 && age<=19) {
		  System.out.println("You are a teenager");
	  }else {
		  System.out.println("You are an adult");
	  }
		
	}

}
