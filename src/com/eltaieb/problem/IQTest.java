package com.eltaieb.problem;

//https://codeforces.com/contest/287/problem/A

public class IQTest {

	public IQTest() {

		int[][] arr = new int[4][];
		for(int i = 0 ; i< arr.length;i++)
		{
			arr[i]= new int[4];
		}
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 1;

		arr[1][0] = 0;
		arr[1][1] = 0;
		arr[1][2] = 0;
		arr[1][3] = 0;

		arr[2][0] = 1;
		arr[2][1] = 1;
		arr[2][2] = 1;
		arr[2][3] = 1;

		arr[3][0] = 0;
		arr[3][1] = 0;
		arr[3][2] = 0;
		arr[3][3] = 0;

		boolean result = process(arr);
		if(!result)
		{
			reverseArrayValues(arr);
		}
		result = process(arr);
		System.out.println(result?"YES":"NO");

	}

	private void reverseArrayValues(int[][] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]= arr[i][j]==1?0:1;
			}
		}
		
	}

	private boolean process(int[][] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				int oldValue = arr[i][j];
				if (oldValue == 0) {
					arr[i][j] = 1;
				}
				boolean condition1 = arr[i][j] == 1;
				boolean condition2 = arr[i][j + 1] == 1;
				boolean condition3 = arr[i + 1][j + 1] == 1;
				boolean condition4 = arr[i + 1][j + 1] == 1;

				if (condition1 && condition2 && condition3 && condition4) {
					arr[i][j] = oldValue;
					return true;
				} 
				arr[i][j] = oldValue;
				
				
			}
		}
		return false;
	}

	public static void main(String... args) {
		new IQTest();
	}
}
