package com.eltaieb.problem;

import java.util.Stack;
//https://codeforces.com/contest/427/problem/A
public class PoliceRecruits {

	public  PoliceRecruits()
	{
		
		Stack<Integer> officersStack=  new Stack<>();
		
		int []arr = {-1 ,-1 ,1};
		
		int numberOfUntreatedCrimes = 0;
		for(int i : arr)
		{
			if(i<0) 
			{
				for(int numberOfCrims = 0; numberOfCrims<Math.abs(i); numberOfCrims++)
				{
					if(officersStack.isEmpty())
					{
						numberOfUntreatedCrimes++;
					}else
					{
						officersStack.pop();
					}
				}
			}else
			{
				for(int numberOfOfficers=0;numberOfOfficers<i;numberOfOfficers++)
				{
					officersStack.push(1);
				}
			}
		}
		
		System.out.println("number of untreated crimes are " + numberOfUntreatedCrimes);
		
		
	}
	
	
	public static void main(String[] args) {
		new  PoliceRecruits();
	}
}
