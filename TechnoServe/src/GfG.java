import java.util.*;
import java.lang.*;

public class GfG {
    public static void pattern(int n) {
    	int c1 = (n-1)/2;
    	int c2 = 3*n/2-1;
    	for (int i = 0;i<n;i++)
    	{
    		for (int j = 0;j<n;j++) 
    			
    		{
    			if(i+j == c1 || i - j == c1 || j -i ==c1 || i+j == c2 || i ==c1 || j == c1)
    				System.out.print('*');
    			else 
    				System.out.print(' ');
    		}
    		System.out.println();
    		
    		}
    			}
    public static void main(String args[]) {
    	int n=4;
    	pattern(n);
    	
    	}
}
