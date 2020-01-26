package ArraysCode;

import java.util.Arrays;

/***
 * 
 * 
 * @author ssingh1
 * a[] = {1,4,7,8,10}
 * b[] = {2,3,9}
 * 
 * a[] = {1,2,3,4,7}
 * b[] = {8,9,10}
 *
 */

public class MergeArray {

	
	public static void mergeArray(int[] x, int y[]){
		
		int m = x.length;
		int n = y.length;
		
		for (int i =0;i<m;i++){
			
			
			if(x[i] > y[0]){
				int temp;
				
				temp= x[i];
				x[i]=y[0];
				y[0]= temp;
				
			
				int  first = y[0];
				int k;
				for (k=1;k<n && y[k]<first ;k++){
					y[k-1]=y[k];
				}
				y[k-1]=first;
			
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
	
		
		int x[] = {1,4,7,8,10};
		 int y[] = {2,3,9};
		 
		 mergeArray(x,y);
		 
		 System.out.println("X:  " +Arrays.toString(x));
		 System.out.println("Y:  " +Arrays.toString(y));

	}

}
