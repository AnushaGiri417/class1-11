package com.grouptask;

public class MinMax_Array {

	public static void main(String[] args) {


		int[] num= {2,5,9,4,3,8,6};

//Max:		
		int max=num[0];
		
		for(int i=1; i<num.length; i++) {
			 if(num[i]>max) {
				 max=num[i];
			 }
		 }
		System.out.println("The maximum number on the list is: "+max);
		
//Min:
		int min=num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("The minimum number on the list is: "+min);
		
		
		
	}

}
