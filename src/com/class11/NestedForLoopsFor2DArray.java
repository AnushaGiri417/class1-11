package com.class11;

public class NestedForLoopsFor2DArray {

	public static void main(String[] args) {

		
		
         int [][] num= {{10,20,30,40},{90,80},{1,2,3,4,5}};

         
         System.out.println(num.length);
         System.out.println(num[0].length);
         System.out.println(num[1].length);
         System.out.println(num[2].length);
         
         for(int rows=0; rows<num.length; rows++) {
        	 for(int col=0; col<num[rows].length; col++) {
        		 System.out.print(num[rows][col]+"  ");
        	 }
        	 System.out.println();
         }

//Using Advanced for loops
         
         for(int[] array : num) {
        	 for(int a:array) {
        		 System.out.print(a);
        	 }
         }





	}

}
