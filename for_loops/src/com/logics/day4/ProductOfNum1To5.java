package com.logics.day4;

//Print the product of numbers from 1 to 5 (1 × 2 × 3 × 4 × 5 = 120).

public class ProductOfNum1To5 {
	static int productOfNum() {
		int product=1;
		for(int i=1;i<=5;i++) {
			product=product*i;
		}
		return product;
	}
	
	public static void main(String[] args) {
		int output = productOfNum();
		System.out.println(output);
	}

}
