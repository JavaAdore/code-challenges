package com.eltaieb.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StonesOnTheTable {

	//https://codeforces.com/contest/266/problem/A
	
	
	enum Color
	{
		R,G,B
	}
	
	public StonesOnTheTable()
	{
		
		Color[] colors = {Color.B,Color.R,Color.B,Color.G};
		List<Color> colorsList = toLinkedList(colors);

		boolean testResult = doTest(colorsList);
		//  no two stones with same colors come sequentially  without any modification
		if(testResult) {
			System.out.println(0);
			return;
		}
		int counter =0;
		// while array is not empty and the test doesnt pass
		while(!testResult && !colorsList.isEmpty())
		{	
			// remove current element and try again :)
			colorsList.remove(0);
			 testResult = doTest(colorsList);
			 // increase number of element should be removed to pass the condition
			 counter++;
		}
		System.out.println(counter);
	}
	
	
	
	
	private List<Color> toLinkedList(Color[] colors) {
		 List<Color> colorsList = new LinkedList<>();
		 for(Color c : colors)
		 {
			 colorsList.add(c);
		 }
		return colorsList;
	}




	// ensure no two stones with same colors come sequentially 
	private boolean doTest(List<Color> colors) {
		for(int i=0;i<colors.size()-1;i++)
		{
			if(colors.get(i).equals(colors.get(i+1)))
			{
				return false;
			}
		}
		
		return true;
	}





	public static void main(String[] args) {
		new StonesOnTheTable();
	}
}
