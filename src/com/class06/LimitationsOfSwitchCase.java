package com.class06;

public class LimitationsOfSwitchCase {

	public static void main(String[] args) {
// WE CANNOT DUPLICATE CASES
//VALUES MUST MATCH A VARIABLE TYPE
//WE MUST HAVE BREAK IN EVERY CASES
		
/*
 * store gender using M or F
 * based on the gender, we will specify:
 *       if M-----> Male
 *       if F-----> Female
 *       otherwise---> not sure
 */
		
		char gender = 'F';
		String description;
		
		switch(gender) {
		case'M':description="Male";break;
		case'F':description="Female";break;
		default:description="not applicable";
		}
		System.out.println(description);
		
		
/*
 * LIMITATIONS:
````````````````` 
 * switch cannot use Relational or logical Operators (it simply checks
                                                     for equality)
 * switch cannot be used with BOOLEAN , DOUBLE , FLOAT , LONG
 * it can only work with BYTE, SHORT, CHAR, INT, STRING
 */
		

	}

}
