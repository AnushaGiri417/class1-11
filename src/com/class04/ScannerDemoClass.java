package com.class04;

import java.util.Scanner;  // ctrl+shift+o

public class ScannerDemoClass {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
		System.out.println("What is your name?");
		String text=scan.nextLine();
		
		System.out.println("What is your age?");
		int age=scan.nextInt();
		scan.nextLine();
		
		System.out.println("What is your favorite food?");
		String food=scan.nextLine();
		
		System.out.println("Hello "+text);
		System.out.println("Your are "+age+" years old");
		System.out.println("You like to eat "+food);
		
	
		
		long a =(long)500.4444;
		System.out.println(a);
	}

}
