
public class Problem6 {

	public static int squareRoot(int x)
	{
		// given a positive integer x, return square root of x
		// if x is not a perfect square, return the floor of its square root
		// complete the method squareroot() here
		// O(log n) expected
		// O(n) or slower will be graded out of 10 points
	
		
		// Base cases for simplest binary tree
        if (x == 0 || x == 1) 			
            return x; // Return x since it is already found
  
        // Binary search to find floor(squareRoot(x)) 
        int start = 1, end = x, ans=0; 
        while (start <= end) 
        { 
            int middle = (start + end) / 2; 
  
            // If x is a perfect square 
            if (middle*middle == x) 
                return middle; // Return middle if it is a perfect square
  
            // Update ans when middle*middle is smaller than x, and move closer to squareRoot(x) 
            // If middle*middle < x then + 1 otherwise - 1
            if (middle*middle < x) 
            { 
                start = middle + 1; 
                ans = middle; 
            } 
            else   // If middle*middle is greater than x 
                end = middle-1; 
        } 
        return ans; // This will be returned if x is not: 0, 1, or a perfect square		
	}
	

	
	public static void main(String[] args) {
		
		int x1 = 8;
		int x2 = 5;
		int x3 = 17;
		System.out.println("The square root of " + x1 + " is " + squareRoot(x1));
		System.out.println("The square root of " + x2 + " is " + squareRoot(x2));
		System.out.println("The square root of " + x3 + " is " + squareRoot(x3));
		
		
	}

}
