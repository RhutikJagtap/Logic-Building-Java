package com.logics.day8;

public class SumEven {
	
	static void sumEven() {
		
		int evenSum=0;
		int oddSum=0;
		
		for(int i=1;i<=10;i++) {
			if (i%2==0) {
				evenSum=evenSum+i;
			}else {
				oddSum=oddSum+i;
			}
		}
		System.out.println("Sum of Even Number "+evenSum);
		System.out.println("Sum of Odd Number "+oddSum);
	}
	
	public static void main(String[] args) {
		sumEven();
	}

}
