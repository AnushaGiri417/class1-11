package com.class03;

public class PracticeClass03 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		a += 500;
		System.out.println(a);

		int b = 100;
		b -= 67;
		System.out.println(b);

		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);

		int cake = 25;
		cake %= 7;
		System.out.println(cake);

		int month = 15;
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid month number");
		}
		
   int i=-7;
		
		int result=i%2;
		
		if(result!=1) {
			System.out.println(i+ " is even number");
		}else {
			System.out.println(i+ " is odd number");
		}

	}

}
