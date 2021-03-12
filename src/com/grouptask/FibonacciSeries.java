package com.grouptask;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a, b, c;
		a=0;
		b=1;
		System.out.print(a+" "+b);
		
		for(int i=1; i<=10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
//another way
		
	int x, y, z;
	x=0;
	y=1;
	
	z=x+y;
	
		
		
		

	}

}
