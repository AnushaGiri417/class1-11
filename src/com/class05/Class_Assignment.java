package com.class05;

import java.util.Scanner;

public class Class_Assignment {

	public static void main(String[] args) {
/* Prompt the user to enter person heights in inches. Person should be classified as one of the following:
*short (under 60 inch)
*medium(between 60 -72 inch)
*tall (over 72 inch) */

  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter your height in inches");
  double height = sc.nextDouble();
  
    if(height<=60) {
    	System.out.println("You are short");
    }else if(height>60 && height<=72) {
    	System.out.println("You are medium");
    }else {
    	System.out.println("You are tall");
    }

 
    
/* Write a program that will print whether it is a weekend or weekday.
 If any day from 1-5 -- output “It is a weekday”,
 any day from 6-7 --- output “It is a weekend”,
any other day --- output “Invalid day”
*/
    System.out.println("Please enter a number");
	int day = sc.nextInt();
	
	if(day>=1 && day<=5){
		System.out.println("Its a weekday");
	}else if(day>5 && day<=7) {
		System.out.println("Its weekend");
	}else {
		System.out.println("Invalid day");
	}
	
	
	
//BETTER WAY:
	
	System.out.println("Please enter your height in inches");
    int ht = sc.nextInt();
    
    String hgt;
    
       if(ht<60) {
    	   hgt="short";
       }else if(ht>=60 && ht<=72) {
    	   hgt="medium";
       }else {
    	   hgt="tall";
       }
    System.out.println("You are "+hgt);
    
    
    
 /* We have to calvulate commmision based on sales
  * 
  * ask user to enter sale that he made
  * based on sales we will calculate commission
  * if sale is less than 10----commission is 0
  * if sale is between 10 to 100 --- commission is 10%
  * if sale is between 101 to  500---commission is 20%
  * if sale is between 501 to 1000---commission is 30%
  * if more than 1000----commission is 50%
  */
    
    double sale, commission;
    System.out.println("Please enter your sale amount");
     sale = sc.nextDouble();
     
        if(sale<10) {
        	commission=0;
        }else if(sale>=10 && sale<=100) {
        	commission=0.1*sale;
        }else if(sale>=101 && sale<=500) {
        	commission=0.2*sale;
        }else if(sale>=501 && sale<=1000) {
        	commission=0.3*sale;
        }else {
        	commission=0.5*sale;
        }
       System.out.println("Your daily commission is "+commission);
 // if commssion is more than 500----> you are an amazing seller
       if(commission>500) { 
       System.out.println("You are an amazing seller");
       }
       
       
       
/* Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
*if the average score >=90 -----> grade=A
*if the average score >= 70 and <90 ----> grade=B
*if the average score>=50 and <70 -----> grade=C
*if the average score<50 ------> grade=F
*/
       int quiz, mid, finaL;
       String grade;
       System.out.println("Enter quiz score");
       quiz=sc.nextInt();
       System.out.println("Enter midterm score");
       mid=sc.nextInt();
       System.out.println("Enter final score");
       finaL=sc.nextInt();
       
       int score = (quiz+mid+finaL)/3;
       
            if(score>=90) {
            	grade="A";
            }else if(score>=70 && score<90) {
            	grade="B";
            }else if(score>=50 && score<70) {
            	grade="C";
            }else {
            	grade="F";
            }
       System.out.println("Your grade is "+grade);
       if(grade.equals("A")) {
    	   System.out.println("You have done a great job.");
       }
       
	   sc.close();
	}

}
