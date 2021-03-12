package com.class11;

public class Arrays_2D {

	public static void main(String[] args) {

     int [] [] num = new int[3][4];
     
     num[0][0]=1;
     num[0][1]=2;
     num[0][2]=3;
     num[0][3]=4;
     
     num[1][0]=10;
     num[1][1]=20;
     num[1][2]=30;
     num[1][3]=40;
		
     num[2][0]=100;
     num[2][1]=200;
     num[2][2]=300;
     num[2][3]=400;
     
     System.out.println(num[2][0]);
     
     
// Another way:
     
     int [][] n= { {1,2,3,4}, {10,20,30,40}, {100,200,300,400} };
     
     System.out.println(n[2][0]);

 // Finding sum:
     
     int sum=n[1][2]+n[0][3];
     System.out.println(sum);
     
//Re-assigning or changing the values
     
//Printing all values in a 2D array
     
     String[][] usa= {
     {"Alexandria", "Oakton", "Arlington","Virginia Beach", "Fairfax"},
     {"Philly","Strassburg","Bristol","Bensalem","Trenton"},
     {"Boston","Quincy","Attleboro","Burlington","Bedford"},
     {"Los Angeles","Sadcramento","san Diego",":Long Beach", "Santa Barbara"},
     {"Miami","Orlando","Tampa","Tallahasee","Fort Lauderdale"}
     };
	
 /*    System.out.println(usa.length);//5 total single arrays or 5 total rows
     System.out.println(usa[0].length); //5 elements inside 1st row
     System.out.println(usa[1].length); //5 elements inside 2nd row
     System.out.println(usa[2].length); //5 elements inside 3rd row */
     
     for(int rows=0; rows<usa.length; rows++) { //iterates over every single rows
    	 
    	 for(int col=0; col<usa[rows].length; col++) {
    		 
    		 System.out.print(usa[rows][col]+" ");
    	 }
    	 System.out.println();
    	 
     }
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
