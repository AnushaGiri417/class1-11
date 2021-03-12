package com.class03;

public class CASTINGinJAVA {

	public static void main(String[] args) {

//Changing from one data type to another
		
		double a=11;
		a/=4;
		System.out.println(a); 
		
/*WIDENING: IMPLICIT (AUTOMATICALLY)
````````````
 byte--> short--> int--> long--> float-->double
 
 NARROWING: EXPLICIT (MANUALLY)
````````````
 double--> float--> long--> int--> short-->byte 
		
 JAVA  doesn't do this automatically.
 There might be potential loss of information.
 So, it is not used a lot in Java. */
		
		int b=(int)12.99; //bigger values in smaller box explicitly / manually
		System.out.println(b);
		
		
		byte c=(byte)128;
		System.out.println(c);
		
		int cake=12;
	    double result=cake/5; /*dividing integer and declaring its name as double
This will perform integer type of calculation and store as a double type of values.*/
	    
		System.out.println(result); 
		  
		double newNum=10;
		newNum/=3;
		System.out.println(newNum); 
//Calculating double with integer gives double because we have initialized a bigger box.
		
		double num1=10+10.5;
		System.out.println(num1);

	}

}
