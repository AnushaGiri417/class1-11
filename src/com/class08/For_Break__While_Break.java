package com.class08;

public class For_Break__While_Break {

	public static void main(String[] args) {
		
		
		boolean rain=true;
		int temp=35;
		
		while(rain) {
		System.out.println("I will stay home");
		   if(temp>75) {
			  System.out.println("I will walk under warm rain");
			  break;
		
		  }
			  temp+=2;
		}

		
		
		for(int a=1; a<=10; a++) {
			System.out.println("Hello"); //till here it will print Hello 10 times
			
			  if(a==5) {
			break; //after it prints once, it will break the loop and stop the code
			  }
			  
// If there is any code after this, the code is stopped
			  
			  System.out.println("I am a code inside for loop"); //this will never get executed because of the break command
		}
		
		
		
		
		
		
		
		
		
		
	}

}
