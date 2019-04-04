package com.eltaieb.problem;

import java.util.ArrayList;
import java.util.List;

//https://codeforces.com/contest/294/problem/A
public class ShaassAndOskols {

	
	int [] wireOskils= {10 ,10, 10 ,10, 10};
	
	List<List<Integer>>oskils = new ArrayList<>();
		
	public ShaassAndOskols()
	{
		initialize();
		shout(2, 5 );
		shout(3, 13);
		shout(2, 12);
		shout(1, 13);
		shout(4, 6 );
		print(oskils);
		
		
	}
	
	
	private void print(List<List<Integer>> wires) {

		for(List<Integer> wire : wires)
		{
			System.out.println(wire.size());
		}
		
	}


	private void shout(int wireNumber, int oskilNumber) {
 		
		int wireIndex = wireNumber-1;
		
		if(validWireIndex(wireIndex))
		{
			List<Integer> currentWire = oskils.get(wireIndex);
			
			if(wireIndex!=0 && wireIndex  !=oskils.size()-1)
			{
				for(int i=0;i<oskilNumber-1;i++)
				{
					oskils.get(wireIndex-1).add(currentWire.get(i));
				}
				for(int i=oskilNumber;i<currentWire.size();i++)
				{
					oskils.get(wireIndex+1).add(currentWire.get(i));

				}
				
			}else if(wireIndex==0)
			{
				for(int i=oskilNumber;i<currentWire.size();i++)
				{
					oskils.get(wireIndex+1).add(currentWire.get(i));

				}
			}else if(wireIndex ==oskils.size()-1)
			{
				for(int i=0;i<oskilNumber-1;i++)
				{
					oskils.get(wireIndex-1).add(currentWire.get(i));
				}
			}
			
			currentWire.clear();

		}
		
	}


	private boolean validWireIndex(int wireIndex) {
		return wireIndex>=0 || wireIndex<oskils.size();
	}


	private void initialize() {
		for(int i=0;i<wireOskils.length;i++)
		{
			List<Integer> oss= new ArrayList<>();
			for(int j=0;j<wireOskils[i];j++)
			{
				oss.add(j);
			}
			oskils.add(oss);
		}
		
	}


	public static void main(String[] args) {
		new ShaassAndOskols();
	}
}
