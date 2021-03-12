package com.class06;

import java.util.Scanner;

public class newClass {

	public static void main(String[] args) {
/*	Scanner sc = new Scanner(System.in);	
		
		int num1, num2, num3, largest;
		
		System.out.println("Pleas enter three numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
	if(num1==num2 && num2==num3) {
		System.out.println("Numbers are equal");
	}else {
		if(num1>num2) {
			if(num1>num3) {
				largest=num1;
			}else {
				largest = num3;
			}
		}else {
			if(num2>num3) {
				largest=num2;
			}else {
				largest=num3;
			}
		}
		System.out.println("largest among the three numbers is : "+ largest);
	}*/
Scanner input=new Scanner(System.in);

	System.out.println("Please enter your first number");
	int num1 = input.nextInt();
	System.out.println("Please enter your Second number");
	int num2 = input.nextInt();
	System.out.println("Please enter your Third number");
	int num3= input.nextInt();
	
	int result = 0;
	   if(num1>num2) {
		  if(num1>num3) {
			result =num1;
		  }else {
			result =num2;
		  }
	
    }else {
	if(num2>num3 ){
		result=num2;
	}else {
		result=num3;
	}
}
System.out.println("Here is the gretest among three "+ num1+" "+ num2 +" "+num3 + " is "+result );
	
	}

}
