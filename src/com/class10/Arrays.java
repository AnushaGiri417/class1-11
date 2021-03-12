package com.class10;

public class Arrays {

	public static void main(String[] args) {
		
		
		
		char[] a= new char[6]; //Declaring array
		 a[0]='A';  //assigning values to array
		 a[1]='B';
		 a[2]='C';
		 a[3]='D';
		 a[4]='E';
		 a[5]='F';
		 
	System.out.println(a[1]); // 
		
System.out.println("--------------------------Classwork task 1 way 1------------------------------");


  
   String[] group= {"Anastasia", "Anusha", "Eugene", "Ram", "Samira", "Snizhana", "Sofia", "Yarina"};
   
  System.out.println(group[1]); 
  
  
  
		
  System.out.println("--------------------------Classwork task 1 way 2------------------------------");
  
  
  String[] names= new String[8];
  names[0]="Anastasia";
  names[1]="Anusha";
  names[2]="Eugene";
  names[3]="Ram";
  names[4]="Samira";
  names[5]="Snizhana";
  names[6]="Sofia";
  names[7]="Yarina";

  System.out.println(names[1]); 
  
  
	
System.out.println("--------------------------Classwork task 2------------------------------");

  String[] words = {"Java","Saturday","day","coding","is"};
	  System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	  
System.out.println("-----------------------------USING FOR LOOPS----------------------------");

//TO ACCESS ALL THE ELEMENTS OF NAMES

    for(int i=0; i<names.length; i++) {
	   System.out.print(names[i]+" ");
    }
	  
	  
    int [][] n=new int [10][10];
	for(int i=0;i<a.length;i++) {
			for(int j=0;j<=a.length;j++) {
				int c=(int)(Math.random()*10);
				
				System.out.print("   a["+j+"]"+"["+i+"] = "+c);
			}
			System.out.println();	  
	}
  

	}

}
