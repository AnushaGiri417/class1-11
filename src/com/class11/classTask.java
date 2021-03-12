package com.class11;

import java.util.Scanner;

public class classTask {

	public static void main(String[] args) {
/* Create an array on double values using scanner
 * calaulate the sum of all stored elements in that array
 */

		
		Scanner sc= new Scanner(System.in);
		
/*		System.out.println("Please enter the size of the array");
		int size=sc.nextInt();
		
		
		double[] num=new double[size];
		for(int i=0; i<size; i++) {
			System.out.println("Please enter the number");
			num[i]=sc.nextDouble();
		}
		double sum=0;
		for (double a : num) {
			sum+=a;
		}
		System.out.println("The sum of the numbers is: "+sum);
		
*/
		
		
		
		
System.out.println("---------------------2D array task---------------------------");

String[][] names= {{"Mr.","Mrs.","Ms.","Miss"},{"Smith","Jordan","Jackson","Obama"}};

System.out.print(names[0][1]+names[1][0]+" "+names[0][0]+names[1][3]+" "+names[0][2]+names[1][2]+" "+names[0][3]+names[1][1]);
		
		
String[][] grades= {{"Anusha", "Sumi", "Ram", "Suju"},{"A","B","C","D"}};

System.out.println();

System.out.println("---------------------------------Task2------------------------------------");

    String[][] cars= {{"Ford","Tesla","Corvette"},{"BMW","Audi","Porsche"},{"Kia","Hyundai","Genesis"},{"Ferrari", "Lamborghini","Maserati"}};
    
    for(int rows=0; rows<cars.length; rows++) {
    	for(int col=0; col<cars[rows].length; col++) {
    		System.out.print(cars[rows][col]+", ");
    	}
    	System.out.println();
    }
    System.out.println("-----------------------------------------------------------");
    
    for(String[] a:cars) {
    	for(String b:a) {
    		System.out.print(b+", ");
       	}
    	System.out.println();
    }
		
	
    System.out.println("---------------------------------------------------------------");
    
    String[][] grocery= {{"tomato","broccoli","lettuce"},{"apple","banana","mango"},{"milk","butter","cheese"},{"cookies","candies","granola bars"}};
     for(int rows=0; rows<grocery.length; rows++) {
    	 for(int col=0; col<grocery[rows].length; col++) {
    		 
    	 }
     }
		
		
		
		
		
		
		
	}

}
