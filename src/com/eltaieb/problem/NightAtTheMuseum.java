package com.eltaieb.problem;

//https://codeforces.com/contest/731/problem/A
public class NightAtTheMuseum {
    // char a;
	int charaAscii = 97;
	// charz ;
	int charzAscii = 122;
	int rangeLength=(charzAscii-charaAscii) +1;

	int currentIndex = 0;

	public NightAtTheMuseum() {

		System.out.println(type("ares"));
	}

	private String type(String string) {
		int counter = 0;
		for (char c : string.toCharArray()) {
			int charAscii = c;
			int targetIndex = (charAscii - 97) ;

			if (targetIndex >= currentIndex) {
				int moveForwardCount = targetIndex - currentIndex;
				
				int moveBackwordCount = currentIndex+rangeLength-targetIndex;
				
				counter +=Math.min(moveForwardCount, moveBackwordCount);
			} else {
				// targetedIndex > currentIndex
				
				int moveBackwordCount = (currentIndex - targetIndex);
				int moveForwardCount  = ((rangeLength)-currentIndex) + targetIndex ; 
				counter +=Math.min(moveForwardCount, moveBackwordCount);

			}
			
			currentIndex = targetIndex;

		}
		return counter + "";
	}

 
	public static void main(String[] args) {
		new NightAtTheMuseum();
	}

}
