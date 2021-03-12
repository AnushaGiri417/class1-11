package com.class10;

public class Homework_Arrays {

	public static void main(String[] args) {
		
		String[] cars= {"Corvette", "Toyota", "BMW", "Mercedes", "Camaro", "Tesla"};

System.out.println("------------------------LOOP 1--------------------------");

		   for(int i=0; i<cars.length; i++) {
			   System.out.println(cars[i]);
		   }
		   
System.out.println("------------------------LOOP 2--------------------------"); 
		
         int a=0;
		  while(a<cars.length) {
			  System.out.println(cars[a]);
			  a++;
		  }
		  
System.out.println("------------------------LOOP 1--------------------------");
		  
String[] an= {"dog", "cat", "tiger", "cow", "horse", "lion"};

    for(int i=0; i<an.length; i++) {	
    	System.out.println(an[i]);
    }
    
System.out.println("------------------------LOOP 2--------------------------");
 	   
	int b=0;
	while(b<an.length) {
		System.out.println(an[b]);
		b++;
	}
		   
System.out.println("------------------------Add arrays of integers--------------------------");

		int[] x= {1,5,18,64,19,35,28};
		int sum=0;
		
		for(int i=0; i<x.length; i++) {
			sum=sum+x[i];
		}
		   System.out.println(sum);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		  
	}

}
