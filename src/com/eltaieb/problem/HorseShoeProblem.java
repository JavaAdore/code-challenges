package com.eltaieb.problem;

import java.util.Arrays;

//https://codeforces.com/problemset/problem/228/A

public class HorseShoeProblem {

	public HorseShoeProblem()
	{
		int arr[] =  {7,7, 7, 7};
		// sort the array to easy identify duplicate if any
		Arrays.sort(arr);
		// assume inputs are already distinct elements
		int diff =4;
		for(int i=1;i<arr.length;i++)
		{
			// if duplicate found decrease 1
			if(arr[i] == arr[i-1])
			{
				diff-=1;
			}
		}
		// calculate the different between 
		System.out.println(4-diff);
		
	}
	
	public static void main(String ... args)
	{
		new HorseShoeProblem();
	}
}
