/*
 * Michael Durso
 * 2/6/2020
 * CMPT 435L 111 
 * Assignment 1
 */

public class Problem3 {

	
	
	public static boolean majority(int[] A)
	{
		/*
		Input: an array A of n integers (positive, negative, or 0), elements sorted in ascending order.
		Output: if there exists a majority element.
		An element is a majority if it appears more than n/2 times. For example, if the input list is: 
		{0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7}
		The output should be true, as 0 appears 6 times (>n/2 = 11/2 times).
		However, if the input list is:
		{0, 0, 0, 1, 1, 2, 3, 10, 10}
		The majority element does not exist.
		Design an algorithm that solves this problem.
		*/
		
		// Complete this method
		// get the length of the array
		int n = A.length;
	    int maxCount = 0;  
	    int index = -1;
	    for(int i = 0; i < n; i++)  
	    {  
	        int count = 0;  
	        for(int j = 0; j < n; j++)  
	        {  
	            if(A[i] == A[j])  
	            count++;  
	        }  
	          
	        // update maxCount if count of  
	        // current element is greater  
	        if(count > maxCount)  
	        {  
	            maxCount = count;  
	            index = i;  
	        }  
	    }  
	      
	    // if maxCount is greater than n/2  
	    // return true (there is a majority) otherwise return false (there is no majority) 
	    if (maxCount > n/2)  {
	    return true;
	    }
	    else {
	    return false;
	    }
	}  
		
	// Main here
	public static void main(String[] args) {
		// Test your majority method
		int[] testarray1 = {0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7};
		int[] testarray2 = {0, 0, 0, 1, 1, 2, 3, 10, 10};
		
		System.out.println("Does there exist a majoirty element in testarray1? "+ majority(testarray1));
		System.out.println("Does there exist a majoirty element in testarray2? "+ majority(testarray2));
		
	}

}
