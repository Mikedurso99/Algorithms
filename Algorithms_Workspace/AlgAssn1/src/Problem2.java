/*
 * Michael Durso
 * 2/6/2020
 * CMPT 435L 111 
 * Assignment 1
 */

public class Problem2 {

	
	
	public static int missingnumber(int[] A)
	{
		/*
		Input: a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in list. One of the integers from 1 to n is missing in the list.
		Output: find the missing integer
		Let the input array be [2, 4, 1, 6, 3, 7, 8]. Elements in this list are in the range of 1 to 8. There are no duplicates, and 5 is missing. Your algorithm needs to return 5.
		Design an algorithm that solves this problem.
		*/
		
		// Complete this method
	    // n is the number of elements in array A 
		int n = A.length;	// get the length of the array
	    int x1 = A[0]; 		// For xor of all the elements in array 	    
	    int x2 = 1; 		// For xor of all the elements from 1 to n+1 
	  
	    for (int i = 1; i < n; i++) // xor all elemnts in A
	        x1 = x1 ^ A[i]; 
	    
	    for (int i = 2; i <= n + 1; i++) // Xor all elements from 1 to n+1
	        x2 = x2 ^ i; 
	    
	    return (x1 ^ x2);  // The xor of x1 and x2 gives the missing element since (A ^ A) would return 0
		
	}
	
	
	public static void main(String[] args) {
		// Test your majority method
		int[] testarray1 = {2, 4, 1, 6, 3, 7, 8};
		int[] testarray2 = {6, 3, 4, 5, 1};
		
		System.out.println("The missing number in testarray1 is: "+ missingnumber(testarray1));
		System.out.println("The missing number in testarray2 is: "+ missingnumber(testarray2));
		
	}

}
