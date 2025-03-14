package com.logics.day5;

//Print numbers from 1 to 30, but only if they are divisible by 3.

public class DivisibleBy3 {
	
	static void divisibleBy3(){
		for(int i=1;i<=30;i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		divisibleBy3();
	}

}
