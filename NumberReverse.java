package com.impl;

import java.util.Scanner;

public class NumberReverse {
	
	public static void main(String ... args)
	{
		System.out.println("Emter numbers to reverse !");
		Scanner sc =new Scanner(System.in);
		String newArray1=null;
		
		
		newArray1= sc.nextLine();
		
		String revarr = "";
		
		
		
	
		
		
		
		for(int i=newArray1.length()-1;i>=0;i--)
		{
			 
			revarr =revarr+newArray1.charAt(i);
			
			  
		}
		
		
		System.out.println("Number after reversing: "+revarr);
		
		
		
		
	}

}
