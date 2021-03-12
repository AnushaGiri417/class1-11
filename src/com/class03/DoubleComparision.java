package com.class03;

public class DoubleComparision {

	public static void main(String[] args) {
		double a=13.5;
		double b=12.99;
		
		if(a>b) {
			System.out.println("Double value "+a+" is larger than "+b);
		}else {
			System.out.println(b+" is larger than "+a);
		}
		
		int temp=25;
		if(temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
		}else {
			System.out.println("Water will NOT freeze with temperature "+temp);
		}
		
		boolean snow=false;
		if(snow) {
			System.out.println("I am going out");
		}
		else {
			System.out.println("I will stay inside");
		}
		
	}

}
