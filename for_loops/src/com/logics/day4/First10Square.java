package com.logics.day4;

//Print the first 10 squares (1, 4, 9, 16...).

public class First10Square {
	
	static void printSquare(){
		for(int i=1;i<=10;i++) {
			int square=i*i;
			System.out.print(square+",");
		}
		
	}
	
	public static void main(String[] args) {
		printSquare();
		
	}

}
