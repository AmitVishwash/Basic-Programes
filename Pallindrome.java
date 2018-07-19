package com.impl;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		int num,reverse=0,remainder;
		
		System.out.println("Welcome to the the world of Java");
		
		System.out.println("Enter any number to check whether it is pallindrome or not");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		int numberToBeChecked = num;
		
		while(num>0)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
			
		}
		
		if(numberToBeChecked==reverse)
		{
			System.out.println("Number entered:"+numberToBeChecked+" is"+" pallindrome");
		}else
		{
			System.out.println("Number entered:"+numberToBeChecked+" is"+" not pallindrome");
		}
		
		

	}

}
