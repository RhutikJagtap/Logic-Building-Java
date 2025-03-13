package com.logics.day4;

import java.util.Scanner;

//Print the factorial of 4 (4 × 3 × 2 × 1 = 24).

public class Factorial {
	static int calculateFactorial(int num){
		int fact=1;
		
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number to calculate factorial");
		int num = scanner.nextInt();
		
		int result = calculateFactorial(num);
		System.out.println(result);
	}

}
