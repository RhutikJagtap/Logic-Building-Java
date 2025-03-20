package com.while_loops.day3;

//print sum of even numbers from 1 to 50 using while loop

public class SumOfEven {
	
	static int sumEven() {
		int sum=0;
		
		int i=1;
		while(i<=50) {
			if (i%2==0) {
				sum=sum+i;				
			}
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result = sumEven();
		System.out.println(result);
	}

}
