package com.logics.day5;

//Print numbers from 1 to 10, but stop if the number is 7.

public class StopAtNumber7 {
	
	static void print(){
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==7) {
				break; //return;
			}
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
