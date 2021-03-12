package com.class09;

public class Nested_For_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//-----------To print how car mileage increases in the dashboard----------------- 
		//starts from 
		
/*		for(int i=0; i<=9; i++) {
			for(int j=0; j<=9; j++) {
				for(int k=0; k<=9; k++) {
					for(int l=0; l<=9; l++) {
						System.out.println(i+" "+j+" "+k+" "+l);
					}
				}
			}
		}
*/		

		
// to print how clock prints hours minutes and seconds
		
		for(int a=0; a<24; a++) {
			for(int b=0; b<60; b++) {
				
					System.out.println(a+":"+b);
				
			}
		}
		
		
System.out.println("--------------------------Asel's way--------------------------");
		
/*     for(int h=0; h<24; h++) {
    	 for(int m=0; m<60; m++) {
    		 if(h<10 && m<10) {
    			 System.out.println("0"+h+":0"+m);
    		 }else if(h<10 && m>10) {
    			 System.out.println("0");
    		 }else {
    			 System.out.println(h+":"+m);
    		 }
    	 }
     }
		
*/

 /*        for(int a=0;a<=23;a++) {
	       for(int b=0;b<6;b++) {
		      for(int c=0;c<=9;c++) {
			    if(a<10) {
				System.out.println("0"+a+":"+b+""+c);
			    }else
			    System.out.println(a+":"+b+""+c);
		        }
	          }
            }

*/
System.out.println();
	}

}
