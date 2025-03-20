package com.while_loops.day3;

import java.util.Scanner;

//Sum from 1 to N (N=5) → Sum = 15

public class SumOfN {
	
	static int sumOfN(int n){
		int sum=0;
		
		int i=1;
		
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n = scanner.nextInt();
		
		int sumOfN = sumOfN(n);
		System.out.println(sumOfN);
	}

}
