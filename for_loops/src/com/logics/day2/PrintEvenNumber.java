package com.logics.day2;

//Print even numbers from 2 to 10 using for loop only.

public class PrintEvenNumber {
	
	 static void printEvenNumber() {
		for(int i=2;i<=10;i=i+2) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		printEvenNumber();
	}

}
