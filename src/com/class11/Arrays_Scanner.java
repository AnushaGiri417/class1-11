package com.class11;

import java.util.Scanner;

public class Arrays_Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("How many elements would you like to store?");
		int size = sc.nextInt();
		
		String[] array = new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter a string");
			array[i] = sc.next();
			
		}
		System.out.println("Lets see what have we stored");
		
		for(String str:array) {
			System.out.print(str+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
