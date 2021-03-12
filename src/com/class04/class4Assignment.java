package com.class04;

public class class4Assignment {

	public static void main(String[] args) {

    boolean diploma=true;
     double gpa=3.1;
    
    if(diploma) {
    	
    	System.out.println("congratulations");
    	
    	    if(gpa>=3.5) {
    			System.out.println("You are eligible for scholarship");
    		}else {
    			System.out.println("You should have studied harder");
    		}
    
    }else {
    	System.out.println("Please get a degree");
    	}
    	
 System.out.println("---------------Second part----------------"); 
	
	double moRate=3.5;
	long price=350000;
	
	if(moRate>4.5) {
		System.out.println("I will not buy the house");
	}else {
		System.out.println("I will buy the house");
		
		if(price>200000) {
			System.out.println("I will take a loan");
		}else {
			System.out.println("I will pay cash");
		}
	}
	
System.out.println("----------------third part---------------");
        
         int age=18;
         int weight=100;
         
         if(age>=18) {
       	    System.out.println("Your age is okay. What is your weight?");
        	 
       	    if(weight>110) {
        		 System.out.println("You can donate blood");
        	 }else {
        		 System.out.println("Your weight is too low to donate blood");
        	 }
         }else {
        	 System.out.println("You are not eligible to donate blood");
         }




	
	}

}
