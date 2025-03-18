package com.while_loops.day1;

//Print even numbers from 1 to 20 using a while loop.


public class PrintEvenNumber {
	
	static void printEven() {
		int i=2;
		
		while(i<=10) {
			System.out.print(i+" ");
			i=i+2;
		}
	}
	
	public static void main(String[] args) {
		printEven();
	}

}
