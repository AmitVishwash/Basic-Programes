package com.impl;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNo,secondNo,sum=0;
		System.out.println("Enter first number");
		Scanner sc= new Scanner(System.in);
		firstNo=sc.nextInt();
		System.out.println("Enter second number");
		secondNo=sc.nextInt();
		System.out.println("The number entered is\n First Number: "+firstNo+"\n Second Number: "+secondNo);
		sum=firstNo+secondNo;
		firstNo = sum-firstNo;
		secondNo = sum-secondNo;
		System.out.println("Number after swapping the valuesare\n First Number: "+firstNo+"\n Second Number: "+secondNo);

	}

}
