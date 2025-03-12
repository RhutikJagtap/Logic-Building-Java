package com.logics.day3;

//Print numbers from 1 to 20, but not divisible by 3

public class NotDivisibleBy3 {
	static void notDivisibleBy3()
	{
		for(int i=1;i<=10;i++) {
			if (i%3!=0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		notDivisibleBy3();
	}
}
