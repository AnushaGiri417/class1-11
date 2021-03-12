package com.grouptask;

public class SecondHighestNumber_Array {

	public static void main(String[] args) {
	//	Integer.MIN_VALUE;

		
/*Arrays.sort(num)
		          }---->this will work if the elements are unique. with the duplicate elements it won't work as the second duplicate will be considered as second highest
print-num[num.length-2] 
*/
/*		int[] num= {900,125,78,55,26,10,11,12,15,87,96,65,43};

		int highest=Integer.MIN_VALUE;
		int secHighest=Integer.MIN_VALUE;
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>highest) {
				secHighest=highest;
				highest=num[i];
			}
			if(highest<num[i] && secHighest>num[i]) {
				secHighest=num[i];
			}
		}
		
		System.out.println("The highest number on the list is: "+highest);
		System.out.println("The second highest number on the list is: "+secHighest);

		System.out.println("------------------------------------------------------------------------------------------");
		
	*/	
//second way
		
		int[] arr= {900, 125, 78, 300, 300, 55, 26, 10, 900, 11, 12, 15, 87, 96, 65, 43};
		
		int large, secondlarge;
		
		large=0;
		secondlarge=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>large) {
				secondlarge=large;
				large=arr[i];
			}else if(arr[i]>secondlarge && arr[i]!=large) {
				secondlarge=arr[i];
			}
		}
	
		  System.out.println("Largest number is : "+large);
		  System.out.println("2nd largest number is : "+secondlarge);
		
		
		
	}

}
