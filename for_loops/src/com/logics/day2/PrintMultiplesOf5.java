package com.logics.day2;

//Print multiples of 5 up to 100 (5, 10, 15... 100).

public class PrintMultiplesOf5 {
	
	static void printMultiples(){
		for(int i=5;i<=100;i=i+5) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		printMultiples();
	}

}
