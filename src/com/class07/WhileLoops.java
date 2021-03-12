package com.class07;

public class WhileLoops {

	public static void main(String[] args) {
		int time = 10;
		while (time<12) {
			System.out.println("Hello"); // If we stop here, code runs forever
			time++;
		}
System.out.println("---------------------------print numbers from 1 to 10---------------------------------------");

    int num=1;
    while(num<=10) {
    	System.out.println(num);
    	num++;
    }

    System.out.println("---------------------------print numbers from 10 to 1---------------------------------------"); 
    
    
    int num1=10;
    while(num1>=1) {
    	System.out.println(num1);
    	num1--;
    }
    
    System.out.println("---------------------------print numbers from 10 to 1---------------------------------------"); 

    int i=7;
   
    while(i<=98){
 //      if(i%7==0){
         System.out.println(i);
         i+=7;
         
//       }
    }
 
    
    
    
    
	}

}
