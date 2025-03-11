package com.logics.day2;

//Print the first 10 multiples of 4 (4, 8,12... 10).

public class PrintFirst10MultiplesOf4 {
	
	static void printMultiples(){
		int count=1;
		for(int i=4;count<=10;i=i+4) {
			System.out.print(i+" ");
			count++;
		}
	}
	
	public static void main(String[] args) {
		printMultiples();
	}

}
