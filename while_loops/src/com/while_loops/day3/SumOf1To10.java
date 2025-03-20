package com.while_loops.day3;

//print sum of 1 to 10

public class SumOf1To10 {
	
	static int sumOf1To10() {
		int sum=0;
		
		int i=1;
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = sumOf1To10();
		System.out.println(sum);
	}

}
