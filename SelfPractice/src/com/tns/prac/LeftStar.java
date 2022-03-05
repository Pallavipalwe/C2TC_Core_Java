package com.tns.prac;
//java program for left triangle
public class LeftStar {
	//function to demonstrate printing pattern
	public static void StarleftTriangle(int k) {
		int a , b ;
		//1st loop
		for (a = 0; a < k; a++) {
			//nested 2nd loop
			for(b = 2 * (k - a); b >= 0; b--) {
				System.out.print(" ");
			}
			//nested 3rd loop
			for (b = 0; b <= a; b++) {
				//printing spaces
				System.out.print("* ");
				
			}
			//end-line
			System.out.println();
		}
		}
		
//driver function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 5;
		StarleftTriangle(k);

	}

}
