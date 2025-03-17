package com.logics.day8;

//Find the product of odd and even numbers from 1 to 10.

public class ProductOfOddEven {
	
	static void evenOddProduct() {
		int oddProduct=1;
		int evenProduct=1;
		
		for(int i=1;i<=10;i++) {
			if (i%2==0) {
				evenProduct=evenProduct*i;
			}else {
				oddProduct=oddProduct*i;
			}
		}
		
		System.out.println("Even Product= "+evenProduct);
		System.out.println("Odd Product= "+oddProduct);
	}
	
	public static void main(String[] args) {
		evenOddProduct();
	}

}
