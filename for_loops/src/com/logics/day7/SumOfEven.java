package com.logics.day7;

//Find the sum of even numbers from 1 to 20.

public class SumOfEven {
	
	static int sumOfEven() {
		int evenSum=0;
		
		for(int i=1;i<=20;i++)
		{
			if (i%2==0) {
				evenSum=evenSum+i;
			}
		}
		return evenSum;
	}
	
	public static void main(String[] args) {
		int sum = sumOfEven();
		System.out.println(sum);
	}

}
