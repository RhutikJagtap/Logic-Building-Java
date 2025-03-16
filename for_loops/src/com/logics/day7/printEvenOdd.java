package com.logics.day7;

//print numbers from 1 to 20, but print "Even" for even numbers and "Odd" for odd numbers:

public class printEvenOdd {
	
	static void printEvenOdd() {
		for(int i=1;i<=20;i++) {
			if (i%2==0) {
				System.out.print(i+"Even ");
			}else {
				System.out.print(i+"Odd ");
			}
		}
	}
	
	public static void main(String[] args) {
		printEvenOdd();
		
	}
}
