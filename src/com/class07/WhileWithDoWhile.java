package com.class07;

import java.util.Scanner;

public class WhileWithDoWhile {

	public static void main(String[] args) {
		
		int a=1;
		do {
			System.out.println(a);
			a++;
		} while(a<=5);
		
//do...while using scanner
		Scanner sc=new Scanner(System.in);
		
		int num;
		int lottoNum=17;
		do {
			System.out.println("Please enter any number between 1 and 100 to win the lottery");
			num=sc.nextInt();
		}while(num!=lottoNum);
		
		System.out.println("Congratulations you have won the lottery");
		
		
		
// Same example using only while
		 int num1;
		 int num2=17;
		System.out.println("Please enter any number between 1 and 100 to win the lottery");
		  num1=sc.nextInt();
		
		while(num1!=num2) {
		   System.out.println("Please enter any number between 1 and 100 to win the lottery");
			 num1=sc.nextInt();
		}
			
			System.out.println("Congratulations you have won the lottery");
		
			
//When we do not know in advance how many times we would like to repeat the block of code====> USE WHILE / DO..WHILE LOOP

			int i=20;
			   do{
			     System.out.println(i);
			     i-=2;
			     
			   
			   }while(i>=1);

			
			
	}

}
