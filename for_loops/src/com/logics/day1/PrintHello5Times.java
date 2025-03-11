package com.logics.day1;

//Print "Hello" 5 times.

public class PrintHello5Times {
	
	static void printMsg() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello "+i);
		}
	}
	
	public static void main(String[] args) {
		printMsg();
	}

}
