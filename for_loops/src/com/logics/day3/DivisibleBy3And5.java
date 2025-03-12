package com.logics.day3;

//Print numbers from 1 to 50, but  divisible by 3 and 5

public class DivisibleBy3And5 {
	static void divisibleBy3And5() {
		for(int i=1;i<=50;i++) {
			if (i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		divisibleBy3And5();
	}

}
