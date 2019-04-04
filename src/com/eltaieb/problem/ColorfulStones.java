package com.eltaieb.problem;

//https://codeforces.com/contest/265/problem/A

public class ColorfulStones {

	
	enum Color
	{
		R,G,B
	}
	
	public ColorfulStones()
	{
		
		String inputStones = "BRRBGBRGRBGRGRRGGBGBGBRGBRGRGGGRBRRRBRBBBGRRRGGBBB";
		String inputInstructions = "BBRBGGRGRGBBBRBGRBRBBBBRBRRRBGBBGBBRRBBGGRBRRBRGRB";
		
		validate(inputStones,"Invalid Stones input");
		validate(inputInstructions,"Invalid instructions input");
		
		Color[] stones = toArray(inputStones);
		Color[] instructions = toArray(inputInstructions);
		
		int stoneIndex=0;
		for(int i=0;i<instructions.length;i++)
		{
			if ( stones[stoneIndex]==instructions[i])
			{
				stoneIndex++;
			}
		}
		
		System.out.println(stoneIndex+1);

	}
	
	private Color[] toArray(String inputStones) {
		Color[] arr = new Color[inputStones.length()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Color.valueOf(inputStones.charAt(i)+"");
		}
		return arr;
	}

	private void validate(String input, String errorMessage) {

		if(null ==input || input.trim().length()==0 )
			throw new IllegalArgumentException(errorMessage);
		
		for(char c : input.toCharArray())
		{
			// throws Illegal Argument Exception in case of invalid input provided
			Color.valueOf(c+"");
			
		}
		
	}

	public static void main(String[] args) {
		new ColorfulStones();
	}
	
}
