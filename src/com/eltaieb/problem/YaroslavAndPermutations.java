package com.eltaieb.problem;

//https://codeforces.com/contest/296/problem/A

public class YaroslavAndPermutations {

	public YaroslavAndPermutations() {
		int[] arr = { 1,1,1,1,2,2,2,2 };

		boolean result = evaluate(arr);
		System.out.println(result ? "YES" : "NO");
	}

	private boolean evaluate(int[] arr) {
		if (arr.length == 1) {
			return true;
		}
		 
		for(int number : arr)
		{
			int count=0;
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==number)
				{
					count++;
				}
			}
			if(arr.length< (2*count -1))
			{
				return false;
			}
			
		}

		return true;
	}

	public static void main(String[] args) {
		new YaroslavAndPermutations();
	}
}
