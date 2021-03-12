package com.class02;

public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name="Anusha";
		String lastname="Giri";
		char grade='A';
		String city="Attleboro";
		String state="Massachusetts";
		long phoneNumber=1001001000;
		System.out.println("My name is "+name+" and my lastname is "+lastname);
		System.out.println("I am a "+grade+" student");
		System.out.println("I live in city "+city+" and my state is "+state);
		System.out.println("My phone number is "+phoneNumber);
		
		city="Levittown";
		state="Pennsylvania";
		grade='B';
		phoneNumber=2002002000;
		
		System.out.println("My name is "+name+" and my lastname is "+lastname);
		System.out.println("I am a "+grade+" student");
		System.out.println("I live in city "+city+" and my state is "+state);
			
		String combinedValue="My name is "+name+" and I moved to new city "+city+" and new state "+state+".";
		String combinedValue2="My new phone number is "+phoneNumber;
		 
		System.out.println(combinedValue);
		System.out.println(combinedValue2);
		
		int a=10;
		int b=20;
        int c=10;
        a=b;
        b=c;
      System.out.println("The new value of a is "+a);
      System.out.println("The new value of b is "+b);
        
	}

}
