package com.logics.day3;

//WAP to print Odd Numbers between 1 to 10

public class OddNumber {
	static void checkOdd()
	{
		for(int i=1;i<=10;i++)
		{
			if (i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		checkOdd();
	}

}
