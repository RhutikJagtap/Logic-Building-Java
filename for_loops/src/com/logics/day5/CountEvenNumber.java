package com.logics.day5;

//Count how many even numbers exist from 1 to 20.


public class CountEvenNumber {
	static int countEvenNumber() {
		int count=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int result = countEvenNumber();
		System.out.println(result);
	}
}
