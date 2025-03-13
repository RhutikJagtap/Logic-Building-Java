package com.logics.day4;

//Print the sum of numbers from 1 to 10 (1+2+3+4+5+6+7... = 55).

public class SumOfNum1To10 {
	static int sum() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int output = sum();
		System.out.println(output);
	}

}
