package com.class09;

import java.util.Scanner;

public class Repl67 {

	public static void main(String[] args) {

System.out.println("------------------------------------Wrong Way---------------------------------------------");
		
	for(int row1=1; row1<=10; row1++) {
		System.out.print(row1+" ");
			}System.out.println();
	for(int row2=2; row2<=20; row2+=2) {
				System.out.print(row2+" ");
			}System.out.println();
	for(int row3=3; row3<=30; row3+=3) {
				System.out.print(row3+" ");
			}System.out.println();
	for(int row4=4; row4<=40; row4+=4) {
				System.out.print(row4+" ");
			}System.out.println();
	for(int row5=5; row5<=50; row5+=5) {
				System.out.print(row5+" ");
			}System.out.println();

System.out.println("------------------------------------Asghar's Way---------------------------------------------");

	for(int i=1; i<=5; i++) {
		for(int j=1; j<=10; j++) {
			System.out.print(i*j+" ");
		}
		System.out.println();
	}

	
/*	int[] year = new int[11];
	
	int n=2010;
	for(int a=n; a<year.length; a++) {
		for(int i=0; i<year.length; i++) {
			
			   System.out.println(year[i]);
			}
		System.out.println(a);
	}
*/	
	
	Scanner sc= new Scanner(System.in);
/*	System.out.println("Please enter day  of the week");
	int i=sc.nextInt();
	String []days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        	  System.out.println(days[i]);
*/
	
System.out.println("----------------------------------mine------------------------------------");	
	
String[] weeks=new String[7];
System.out.println("Please enter day 1 of the week");
weeks[0]=sc.next();
System.out.println("Please enter day 2 of the week");
weeks[1]=sc.next();
System.out.println("Please enter day 3 of the week");
weeks[2]=sc.next();
System.out.println("Please enter day 4 of the week");
weeks[3]=sc.next();
System.out.println("Please enter day 5 of the week");
weeks[4]=sc.next();
System.out.println("Please enter day 6 of the week");
weeks[5]=sc.next();
System.out.println("Please enter day 7 of the week");
weeks[6]=sc.next();
for(int i=0; i<weeks.length; i++){
  System.out.println(weeks[i]);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
