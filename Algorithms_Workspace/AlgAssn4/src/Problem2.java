
public class Problem2
{

public static Min2ndMin dcfindmin2ndmin(int[] A, int i, int j)
	{
		// Complete this method to find min and 2nd min in an array A
		// At most 3/2n-2 comparisons
		// Algorithms that make more comparisons will be scored out of 5 points
		// Complete the code from here
		// Feel free to change return type, parameters
	Min2ndMin pair = new Min2ndMin();	
	
		if (i == j) {
			pair.min = A[i];
			pair.min2nd = A[i];
			return pair;
		}
		
		if  (j == i + 1) {
			if (A[i] < A[j]) {
				pair.min = A[i];
				pair.min2nd = A[j];
			} else {
				pair.min = A[j];
				pair.min2nd = A[i];
			}
			return pair;
		}
		int mid = (i + j) / 2;
		Min2ndMin L = dcfindmin2ndmin(A, i, mid);
		Min2ndMin R = dcfindmin2ndmin(A, mid + 1, j);
		
		if (L.min > R.min) {
			pair.min = R.min;
			if (R.min2nd < L.min2nd) {
				pair.min2nd = R.min2nd;
			} else {
				pair.min2nd = L.min;
			}
		}
		
		return pair;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		int[] givenarray = {100,2,3,4,5,6,7,67,32};	
		
		// Test your method
		Min2ndMin pair = new Min2ndMin();
		pair = dcfindmin2ndmin(givenarray, 0, givenarray.length-1);
		int min2nd = pair.min2nd;
		int min = pair.min;
		System.out.println("The min and 2ndmin of the given array are "+ min + " and "+min2nd+".");
		// Your method should return 2 and 3
		
		
		
	}
	
	
}