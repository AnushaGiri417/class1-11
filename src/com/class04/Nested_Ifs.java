package com.class04;

public class Nested_Ifs {

	public static void main(String[] args) {
		
		boolean morning=true;
		boolean classToday=false;
	
//is it morning : yes--->Goodmorning
//if condition is true also check : if there a class : yes---> Hello Class
	//else---> Hello family
	
	if(morning){
		System.out.println("Goodmorning"); // further check if the condition is true
	
		 if(classToday) {                      // if condition is false, skip all the ifs and go to else part
		      System.out.println("Hello Class");
		 }else {
		      System.out.println("Hello family");
	}
}
	System.out.println("---------------------------------------------");
	
	boolean anyAllergies=true;
	boolean peanut=false;
	
	if(anyAllergies) {
		System.out.println("What allergies do you have?");
	
	   if(peanut) {
		   System.out.println("Do not eat any food with peanuts");
	   }else {
		   System.out.println("Then what kind?");
	   }
	
	}else {
		System.out.println("You are lucky. You don't have any allergies");
	}
	
	//NESTED IFS CAN BE: (IF...ELSE IF....IF)  OR (IF...IF..ELSE)
	
	
System.out.println("----------------------example3--------------------------");
	
	  boolean friday=true;
	  int day=13;
	  
	if(friday) {
		System.out.println("It's my movie day. What day is it?");
	
		
	    if(day==13) {
	    	System.out.println("I will watch a scary movie");
	    }else {
	    	System.out.println("I will watch any movie available");
	    }
	
	    
	}else {
		System.out.println("I will stay home and study Java");
	}

System.out.println("---------------------example 4-----------------------");

  boolean completed=true;
  int score=88;
  
  if(completed) {
	  
	  if (score>=90) {
		  System.out.println("Great job. Keep it up");
	  }else if(score>80) {
		  System.out.println("Good job");
	  }else if(score>70) {
		  System.out.println(" Good, but you need to do better");
	  }else {
		  System.out.println("Good try, but you have to study hard");
	  }
	  
  }else {
	  System.out.println("Please make sure to complete all the assignments on time");
  }

//NESTED IFS CAN BE INSIDE IF-BLOCK OR INSIDE ELSE-BLOCK.
  
/* if(true){                      if(true){
      
      if(true){         OR       }else{
      
 }else                                 if(true){}
                                    }
 */                   
 
  System.out.println("---------------------------Example 5--------------------------");
     
  
     boolean morNing=true;
     boolean clasS=false;
    
     
     if(morNing) {
    	 System.out.println("I am going to work");
     }else {
    	 System.out.println("let me check if I have class today");
    	 
    	 if(clasS) {
    		 System.out.println("I will attend the class");
    	 }else {
    		 System.out.println("I will stay home and chill");
    	 }
     }
  
  
  
	}

}
