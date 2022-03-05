package com.tns.prac;

public class ReversePyramid {
	//main driver method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring ,initializing variable to size of pyramid
		int number = 7;
		int i = number , j;
		//nested while loops
		//outer loop
		//till condition holds true
		while (i > 0) {
			j = 0;
			//inner loop
			//condition check
			while (j++ < number - i) {
				System.out.print(" ");
			}
			j = 0;
			//inner loop
			//condition check
			while (j++ < (i * 2) - 1) {
				//print star
				System.out.print("*");
			}
			//by now reach end of execution for one row
			//so next line
			System.out.println();
				//decrement counter because we want to print
				//reverse of pyramid
				i--;
			}
		}

	}


