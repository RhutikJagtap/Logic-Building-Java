package com.while_loops.day1;

//print hello 15 times using while loop

public class PrintHello {
	
	static void printMessage() {
		
		int i=1;
		
		while(i<=15) {
			System.out.print(i+" ");
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		printMessage();
	}

}
