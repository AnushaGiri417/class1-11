package com.class02;

public class StringConcatenate {

	public static void main(String[] args) {
		
		String name;
		name="Anusha";
		int age=25;
		char grade='A';
		
		
	System.out.println("My name is "+name);
	System.out.println("I am "+age+" years old.");
	System.out.println("Anusha is "+grade+" student.");
	
	String car="Mercedes";
	int year=2021;
	
	System.out.println("I drive "+year+" "+car);
	  String computer="Dell inspiron";
	  int memory=254;
	  System.out.println(name+" has "+computer+" with "+memory+"GB memory.");
	String combinedValue= year + " " + car;
	  System.out.println(combinedValue);
	  byte day=7;
	  String month="February ";
	  String date=month+day;
	  System.out.println(date);
	}

}
