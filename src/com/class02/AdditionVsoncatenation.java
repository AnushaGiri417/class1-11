package com.class02;

public class AdditionVsoncatenation {

	public static void main(String[] args) {
	
		int num1=10;
		int num2=11;
		
		String s1="Hello";
		String s2="Hi";
	System.out.println(num1+num2+s1+s2); //21HelloHi
	System.out.println(s1+s2+num1+num2); //HelloHi1011
	System.out.println(num1+s1+num2+s2); //10Hello11Hi
	
//it will operate left to right. string on the left will cause it to concatenate and not add.
	System.out.println(s1+s2+(num1+num2));
	 
	}

}
