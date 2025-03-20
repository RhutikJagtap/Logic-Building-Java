package com.while_loops.day3;

//product from 1 to 5

public class ProductFrom1To5 {
	
	static int productFrom1To5(){
		int product=1;
		
		int i=1;
		while(i<=5) {
			product=product*i;
			i++;
		}
		
		return product;
	}
	
	public static void main(String[] args) {
		int product = productFrom1To5();
		System.out.println(product);
	}

}
