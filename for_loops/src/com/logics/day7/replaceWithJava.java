package com.logics.day7;

//print numbers from 1 to 50, replacing multiples of 3 and 5 with "Java":

public class replaceWithJava {
	static void replace() {
		for(int i=1;i<=50;i++)
		{
			if (i%3==0 && i%5==0) {
				System.out.print("Java ");
			}else {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		replace();
	}

}
