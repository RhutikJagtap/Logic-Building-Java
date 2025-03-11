package com.logics.day2;

//Print numbers from 1 to 10, but skip number 5.
public class SkipNumber {
	
	static void printNum() {
		for(int i=1;i<=10;i++)
		{
			if (i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		printNum();
	}

}
