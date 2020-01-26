package ArraysCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class findDuplicate {

	public static void main(String[] args) {
		int A[] = {1,2,3,4,4};
		
		//System.out.println("Duplicate Element is  "+ findDuplicateHashing(A));
		
		System.out.println("Duplicate Element is  "+ findDuplicateXOR(A));

	}

	private static String findDuplicateHashing(int[] a) {
		int count = 0;
		String dupList = "";
		Map<Integer,Integer> m = new HashMap<>();
		for(int i =0;i<a.length;i++){	
			if(m.containsKey(a[i])){
				count = m.get(a[i]);
				m.put(a[i], count+1);	
			} else{
				m.put(a[i], 1);
			}
		}
		for (Entry<Integer,Integer> entry : m.entrySet()){
			if(entry.getValue()>1)
				dupList+=entry.getKey();
		}
			return dupList;
	}
	
	
	 public static int findDuplicateXOR(int[] A)
	    {
	        int xor = 0;
	 
	        // take xor of all array elements
	        for (int i = 0; i < A.length; i++) {
	            xor ^= A[i];
	        }
	 
	        // take xor of numbers from 1 to n-1
	        for (int i = 1; i <= A.length - 1; i++) {
	            xor ^= i;
	        }
	 
	        // same elements will cancel out each other as a ^ a = 0,
	        // 0 ^ 0 = 0 and a ^ 0 = a
	 
	        // xor will contain the missing number
	        return xor;
	    }
	 
}
