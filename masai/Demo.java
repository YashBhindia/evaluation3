package com.masai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	
	  void showDetails(Month m) {
		  
		  try {
			
				  System.out.println("This is the Month of the Year"+" "+m);
			  
			 
		  }
		  catch(Exception e) {
			  System.out.println("Enter the valid month");
		  }
     
		 
      }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Demo d1 = new Demo();
//		Month m1 = Month.APRIL;
//		
//		d1.showDetails(m1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		String Monthname = sc.next();
		Month m = Month.valueOf(Monthname);
		d1.showDetails(m);
      
	}

}
