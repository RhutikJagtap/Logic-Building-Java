package com.logics.day5;

//Print numbers from 1 to 30, but skip numbers divisible by 3 .

public class SkipNumberDivisibleBy3 {
	static void skipNumDivisibleBy3()
	{
		for(int i=1;i<=30;i++) {
			if (i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		skipNumDivisibleBy3();
	}

}
