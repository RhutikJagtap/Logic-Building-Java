package com.while_loops.day1;

//Print numbers from 1 to 10 using a while loop. → 1 2 3 4 5 6 7 8 9 10


public class PrintNumbers1To10 {
	
	static void printNumbers() {
		
		int i=1;
		while (i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		printNumbers();
	}

}
