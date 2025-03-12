package com.logics.day3;

//Print numbers from 1 to 20, but only numbers divisible by 3
public class DivisibleBy3 {
	
	static void divisibleBy3(){
		for(int i=1;i<=20;i++)
		{
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		divisibleBy3();
	}

}
