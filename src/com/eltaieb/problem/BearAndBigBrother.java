package com.eltaieb.problem;

public class BearAndBigBrother {
	
	// challange
	// https://codeforces.com/problemset/problem/791/A
	
	
	public BearAndBigBrother()
	{
		int a=4;
		int b = 9;
		
		validate(a,b);
		
		int numberOfYears=0;
		while(a<=b)
		{
			a*=3;
			b*=2;
			numberOfYears++;
		}
		
		System.out.println("Limak will be heigher weight than Bob's after " +numberOfYears);
	}
	
	
	
	private void validate(int a, int b) {
		if(a>b) throw new IllegalArgumentException("A must be less than b");
		
	}



	public static void main(String ... args)
	{
		new BearAndBigBrother();
	}
}
