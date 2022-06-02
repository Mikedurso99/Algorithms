
public class Problem1 {

	public static int count(double[] A, double x)
	{
		// given sorted array A, and a value x, return the number of times x occurs in A
		// complete the method count() here
		// O(log n) expected
		// O(n) or slower will be graded out of 5 points
		// feel free to change the return type or parameters
		
		// Variables for the beginning, middle and end values as well as a counter and a flag
	    int beg = 0;
	    int mid = 0;
	    int end = A.length;
	    int count = 0;
	    boolean flag = true;
	    
	    // Loop until the flag changes to false
	    while(flag) {
	    	mid = (beg + end) / 2; // Grab the mid
	    	if (A[mid] == x) {
	    		int i = mid;
	    		while (i <= A.length-1 && A[i] == x) {
	    			count++; // Increment the counter for each recurring value
	    			i++;
	    		}
	    		i = mid;
	    		while (i >= 0 && A[i] == x) {
	    			count++; // Increment the counter for each recurring value
	    			i--;
	    		}
	    		count--;
	    		flag = false; // Cause the flag to be false ending the loop
	    	} else if (A[mid] > x) {
	    		end = mid - 1; // Update the end value
	    	} else if (A[mid] < x) {
	    		beg = mid + 1; // Update the beg value
	    	}
	    }
		return count;		
	}
	

	public static void main(String[] args) {
		
		double[] testarray = {1.3, 2.1, 2.1, 2.1, 2.1, 6.7, 7.5, 7.5, 8.6, 9.0};
		double t1 = 2.1;
		double t2 = 7.5;
		double t3 = 1.3;
		System.out.println(t1+" appears "+ count(testarray, t1) + " times");
		System.out.println(t2+" appears "+ count(testarray, t2) + " times");
		System.out.println(t3+" appears "+ count(testarray, t3) + " times");
		
		
	}

}
