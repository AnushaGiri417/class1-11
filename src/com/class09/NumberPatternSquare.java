package com.class09;

public class NumberPatternSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++) {
			for(int j=6; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
System.out.println("--------------------------------INCREASING TRIANGLE----------------------------------------");		
		
		for(int a=1; a<=5;a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
System.out.println("----------------------------------DECREASING TRIANGLE----------------------------------------");		
		
for(int a=1; a<=5;a++) {
	for(int b=5; b>=a; b--) {
		System.out.print("* ");
	}
	System.out.println();
}
		
System.out.println("----------------------------------HOMEWORK----------------------------------------");		
		
//1.

     for(int i=5; i>=1; i--) {
	    for(int j=5; j>=1; j--) {
		  System.out.print(i+" ");
	     }
	    System.out.println();
        }

System.out.println("----------------------------------HOMEWORK----------------------------------------");
//2.
     for(int i=7; i>=1; i--) {
	    for(int j=7; j>=1; j--) {
		  System.out.print(j+" ");
	     }
	    System.out.println();
        }

     


	}

}
