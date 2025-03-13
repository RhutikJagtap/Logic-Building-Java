package com.logics.day4;

//Print the first 5 cubes (1, 8, 27, 64, 125).

public class First5Cube {
	
	static void printCube(){
		for(int i=1;i<=5;i++) {
			int cube=i*i*i;
			System.out.print(cube+",");
		}
	}
	
	public static void main(String[] args) {
		printCube();
	}

}
