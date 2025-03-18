package com.while_loops.day1;

//Print odd numbers from 1 to 20 using a while loop.

public class printOddNumber {
	
	static void printOdd(){
		int i=1;
		
		while(i<=10) {
			System.out.print(i+" ");
			i=i+2;
		}
	}
	
	public static void main(String[] args) {
		printOdd();
	}

}
