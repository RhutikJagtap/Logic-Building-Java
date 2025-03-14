package com.logics.day5;

//Count how many odd numbers exist from 1 to 20.

public class CountOddNumber {
	
	static int countOddNumber() {
		int count=0;
		for(int i=1;i<=20;i++) {
			if (i%2!=0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int result = countOddNumber();
		System.out.println(result);
	}
}
