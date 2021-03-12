package com.class10;

public class Advanced_ForLoop {

	public static void main(String[] args) {
		
	//USED ONLY WITH ARRAYS 
		//for each loop
		//starts from the beginning and moves to the end
		//reverse printing is not allowed in advanced for loop, for that we need to use regular for loop
		 
		int[] numbers= {10, 20,30,40,50,60};
		   for(int num : numbers) {
			   System.out.print(num+" ");
		   }
		   
System.out.println();

// ' : ' takes the first value of numbers and stores in num, prints that value and then moves to the next value untill it reaches the last value and the cursor stops there 		   
		   
		   
		   String[] group= {"Anastasia", "Anusha", "Eugene", "Ram", "Samira", "Snizhana", "Sofia", "Yarina"};
		   
//using for loop
		   for(int i=0; i<group.length; i++) {
		   System.out.print(group[i]+" ");
		 }
		   
		   
System.out.println();


//using advanced for loop
		   for(String printNames : group) {
			   System.out.print(printNames+" ");
		   }
		 

System.out.println();
System.out.println("----------------------------------------------------------------------------------");
		 
boolean[] bool = { true, false, true, true, false, false,true};		 
		 
		for(boolean b : bool) {
			System.out.print(b+" ");
		}
		 
System.out.println();		 
		 		 
//We can also use if statement in this loop
System.out.println("---------------------Print only even numbers------------------------");
 

int[] n = {10, 20,3,40,5,60, 7, 9};
for(int i=0; i<n.length; i++) {
	  if(n[i] % 2 == 0) {
		  System.out.print(n[i]+" ");
	  }
	}

		 
		 
	}

}
