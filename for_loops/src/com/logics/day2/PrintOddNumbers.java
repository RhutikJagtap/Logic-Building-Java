package com.logics.day2;

//Print odd numbers from 1 to 9.
public class PrintOddNumbers {
	
	static void printOddNumber(){
		for(int i=1;i<=9;i=i+2) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		printOddNumber();
	}

}
