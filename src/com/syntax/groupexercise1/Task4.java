package com.syntax.groupexercise1;

public class Task4 {
	
public static void main(String[] args) {
		
		/*
		 * Create a 2D array of integer type where you will store even and odd numbers.
		 * Develop a program which will identify/print the even numbers only
		 */
		
		int[][] evenAndOdd= {
				{25, 38, 457, 46, 18}, 
				{324, 1, 36, 14}, 
				{32, 69, 452, 17, 55, 6453, 5, 94}, 
				{15, 4, 41},
				{67, 5}
		};
		System.out.println("Even numbers:");
		for (int i=0; i<evenAndOdd.length; i++) {
			for (int j=0; j<evenAndOdd[i].length; j++) {
				if (evenAndOdd[i][j]%2==0) {
					System.out.print(evenAndOdd[i][j]+" ");
				}
			}
		}
	}

}
