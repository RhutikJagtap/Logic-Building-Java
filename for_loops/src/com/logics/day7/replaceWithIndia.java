package com.logics.day7;

//print numbers from 1 to 20, replacing multiples of 3 with "India":

public class replaceWithIndia {
	
	static void replace() {
		for(int i=1;i<=20;i++)
		{
			if (i%3==0) {
				System.out.print("India ");
			}else {
				System.out.print(i+" ");				
			}
		}
	}
	
	public static void main(String[] args) {
		replace();
	}

}
