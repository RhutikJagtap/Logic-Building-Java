package com.while_loops.day2;

//print first 10 multiples of 5 using while loop you can use if else
public class FirstTenMultiplesOfFive {
	
	static void firstTenMultiplesOfFive() {
		int count=0;
		
		int i=1;
		while(count<10) {
			if (i%5==0) {
				count++;
				System.out.print(i+" ");
			}
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		firstTenMultiplesOfFive();
	}

}
