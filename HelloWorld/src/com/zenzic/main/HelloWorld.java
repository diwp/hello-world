package com.zenzic.main;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int x = 3;
		int y = 3;
		int[][] zMatrix = new int[][]{
			  { 1, 2, 3},
			  { 4, 5, 6},
			  { 7, 8, 9},
			  { 10, 11, 12}
			};
		int resMatrix[][] = new int[x][y];

		StringBuilder sb = new StringBuilder("abc").append("123").append("");
		
		for(int i=0; i < x; i++) {
			for(int j=0; j< y; j++) {
				resMatrix[i][j] = zMatrix[j][i];
			}
		}
		for(int i=0; i < x; i++) {
			for(int j=0; j< y; j++) {
				System.out.print(resMatrix[i][j] + ", ");
			}
			System.out.println("\n test added ");
		}
		System.out.println(resMatrix.length);
	}

}
