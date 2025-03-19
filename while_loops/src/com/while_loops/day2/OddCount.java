package com.while_loops.day2;

//print how many odd numbers between 1 to 50 using while loop

public class OddCount {
	
	static int oddCount() {
		int count=0;
		
		int i=1;
		while(i<=50) {
			if (i%2!=0) {
				count++;
			}
			i++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int oddCount = oddCount();
		System.out.println(oddCount);
	}

}
