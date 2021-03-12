package com.class07;

public class ForLoops {

	public static void main(String[] args) {
		

// When we know how many times we would like to execute our code===> USE FOR LOOP
		
		for(int i=1; i<=3; i++) {
			System.out.println("hello");
		}

		
		for(int a=1; a<=50; a++) {
			System.out.print(a+" ");
		}
		
System.out.println();
/*
 * No matter how many videos we watch on Youtube, we forget like poof. When you teach its, so clear. Thank you Asel.
 */


 for(int a=1; a<=100; a++) {
	 System.out.print(a+" ");
 }
 
 System.out.println();


 for(int b=100; b>=1; b--) {
	 System.out.print(b+" ");
 }
 
 
 System.out.println();

 
 for(int c=20; c>=1; c--) {
	 System.out.print(c+" ");
 }

System.out.println();
 //another way
    int c1=20;
    while(c1>=1) {
    	System.out.print(c1+" ");
    	c1--;
    }

System.out.println();

for(int d=20; d<=50; d++) {
	if(d%2!=0) {
	System.out.print(d+" ");
}
}

System.out.println();

//another way

  for(int x=21; x<=50; x+=2) {
	 
  	  System.out.print(x+" ");
  }
  
  System.out.println();
  
  
  
  int result=0;
  for(int r=2; r<10; r+=2) {
	result+=r;
  }
  System.out.println(result);
	}

}
