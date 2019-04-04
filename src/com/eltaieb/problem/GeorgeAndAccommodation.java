package com.eltaieb.problem;

public class GeorgeAndAccommodation {

	public GeorgeAndAccommodation() {
		
		int[][] roomCapacityArray = { 
				// number of people are already in room , room capacity
				{ 1										, 			10 },
				{ 0										, 			10 },
				{ 10								 	, 			10 }
				
		};
		
		int numberOfAvailableRoomsForGorgeAndAlex=0;
		
		for(int i=0;i<roomCapacityArray.length;i++)
		{
			int peopleInRoom = roomCapacityArray[i][0];
			int roomCapacity = roomCapacityArray[i][1];
			if(roomCapacity-peopleInRoom>=2)
			{
				numberOfAvailableRoomsForGorgeAndAlex++;
			}
			
		}
		
		System.out.println("number of rooms available for George and alex are " + numberOfAvailableRoomsForGorgeAndAlex);
		
		
	}

	public static void main(String[] args) {
		new GeorgeAndAccommodation();
	}
}
