package com.impl;

import java.util.Scanner;

public class ArmsStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num,sum=0,remainder;
		
		System.out.println("Welcome to the the world of Java");
		
		System.out.println("Enter any number to check whether it is armstrong or not");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		int numberToBeChecked = num;
		
		while(num>0)
		{
			remainder=num%10;
			sum=sum+(int)(Math.pow(remainder, 3));
			num=num/10;
			
			
			
		}
		
		if(sum==numberToBeChecked)
		{
			System.out.println("Number entered:"+numberToBeChecked+" is"+" armstrong");
		}
		else
		{
			System.out.println("Number entered:"+numberToBeChecked+" is"+" not armstrong");
		}

	}

}
