package com.logics.day2;

//Print even numbers from 2 to 10 using for loop only in reverse.

public class PrintEvenNumbersInReverse {
	
	static void printEvenNumber() {
		for(int i=10;i>=2;i=i-2) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		printEvenNumber();
	}
}
