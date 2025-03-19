package com.while_loops.day2;

//print even and odd number from 1 to 20 using while loop

public class EvenOdd {
	static void printEvenOdd() {
		int i=1;
		
		while(i<=20) {
			if (i%2==0) {
				System.out.println(i+" is a Even Number" );
			}else {
				System.out.println(i+" is a odd Number");
			}
			i++;
		}
		
	}

	public static void main(String[] args) {
		printEvenOdd();
	}
}
