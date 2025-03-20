package com.while_loops.day3;

//Product of even numbers from 2 to 10 → Product = 3840

public class ProductOfEvenNumber {
	
	static int evenNumberProduct(){
	
		int product=1;
		int i=2;
	
		while(i<=10) {
			if (i%2==0) {
				product=product*i;				
			}
			i++;
		}

		return product;
	}
	
	public static void main(String[] args) {
		int product = evenNumberProduct();
		System.out.println(product);
		
	}

}
