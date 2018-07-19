package com.impl;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flag=0;
		System.out.println("Enter any number");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		
		
		if(num==1)
		{
			System.out.println("Enter number: "+num+" is not prime");

			
			
		}
		
			for(int i=2;i<=num-1;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println("Enter number: "+num+" is prime");
			}
			else
				
			{
				System.out.println("Enter number: "+num+" is not prime");
			}
		
		
		

	}
	

}
