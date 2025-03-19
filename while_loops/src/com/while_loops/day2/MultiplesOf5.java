package com.while_loops.day2;

//print multiples of 5 using while loop

public class MultiplesOf5 {
	
	static void multiplesOf5() {
		int i=1;
		while (i<=50) {
			if (i%5==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		multiplesOf5();
	}

}
