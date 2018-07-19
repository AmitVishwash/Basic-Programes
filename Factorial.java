package com.impl;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int factorial=1;
		System.out.println("Enter the number to find the factorial");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact=num;
		while(num>0)
		{
			factorial=factorial*num;
			num--;
		}
		System.out.println(fact+" ! is:"+factorial);

	}
	
	

}
