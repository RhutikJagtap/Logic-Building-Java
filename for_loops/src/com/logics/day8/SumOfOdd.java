package com.logics.day8;

//Find the sum of odd numbers from 1 to 20.

public class SumOfOdd {
	
	static int sumOfOdd(){
		int oddSum=0;
		for(int i=1;i<=20;i++) {
			if (i%2!=0) {
				oddSum=oddSum+i;
			}
		}
		return oddSum;
	}
	
	public static void main(String[] args) {
		int oddSum = sumOfOdd();
		System.out.println(oddSum);
	}

}
