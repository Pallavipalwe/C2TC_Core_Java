package com.tns.prac;

public class PyramidNum {
	//main driver method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int x = 0;
		//outer loop for rows
		for (int i = 1;i <= num; i++) {
			x = i - 1;
			//inner loop for i'th row printing
			for (int j = i; j <= num - 1; j++) {
				//first number space
				System.out.print(" ");
				//space between numbers
				System.out.print(" ");
			}
			//for pyramid printing
			for (int j = 0 ; j <= x; j++) 
				System.out.print((i + j) < 10 ? (i + j) + " " : (i + j) + " ");
			for (int j = 1; j <= x; j++)
				System.out.print((i + x - j) < 10 ? (i + x - j) +" " : (i + x - j) + " ");
			//by now we rwach end for one row, so
			//new line to switch to next
			System.out.println();
				
			}
			}

	}


