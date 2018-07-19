package com.impl;


public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,6,7,8,9,10};
		int start=0,end=arr.length-1,temp;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("");
		end=arr.length-1;
		start=0;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		
		
		   
	}
		
		
	}


