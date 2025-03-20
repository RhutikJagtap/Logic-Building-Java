package com.while_loops.day3;

//Sum of squares from 1 to 10 → Sum = 385

public class SumOfSquare {
	
	static void sumOfSquare(){
		int sum=0;
		
		int i=1;
		while(i<=10) {
			System.out.println(i+" = "+i*i);
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		sumOfSquare();
	}

}
