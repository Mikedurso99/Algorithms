
public class Problem1 {


	
	public double findmaxdiff (double[] A)
	{
		// Complete the method to find the maximum difference between points in A[]
		// so that the larger value appears after the smaller value in A[]
		// feel free to change the return type, parameters
		// full credits will be awarded to divide and conquer and O(n)
	
		// Java program to find Maximum difference  
		// between two elements such that larger  
		// element appears after the smaller number 
		
			double maxDiff = A[1] - A[0]; 
		    double minElem = A[0]; 
		    int Asize = A.length;
		    
		    for (int i = 1; i < Asize; i++)  
		    { 
		        if (A[i] - minElem > maxDiff) 
		            maxDiff = A[i] - minElem; 
		        if (A[i] < minElem) 
		            minElem = A[i]; 
		    } 
		    return maxDiff; 		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your findmaxdiff() method here
        Problem1 maxdif = new Problem1(); 
		double[] testarray1 = {2, 3, 10, 6, 4, 8, 1};	// maxdiff: 8
		double[] testarray2 = {7, 9, 1, 6, 3, 2}; 		// maxdiff: 5
		
		// Add test statements 
		System.out.println("Max Difference: " +  maxdif.findmaxdiff(testarray1)); 
		System.out.println("Max Difference: " +  maxdif.findmaxdiff(testarray2)); 

	}
}
