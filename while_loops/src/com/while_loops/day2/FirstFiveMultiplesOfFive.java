package com.while_loops.day2;

//print first 10 multiples of 5 using while loop dont use if else

public class FirstFiveMultiplesOfFive {
	static void firstFiveMultiplesOfFive() {
		int i=1;
		while(i<=5) {
			System.out.print(i*5+" ");
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		firstFiveMultiplesOfFive();
	}

}
