package com.logics.day8;

//Find the product of even numbers from 1 to 10.

public class ProductOfEvenNum {
	
	static int evenProduct() {
		int product=1;
		for(int i=1;i<=10;i++) {
			if (i%2==0) {
				product=product*i;
			}
		}
		return product;
	}
	
	public static void main(String[] args) {
		int product = evenProduct();
		System.out.println(product);
	}

}
