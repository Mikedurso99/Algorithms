public class SubsetSumDP {
	
	public static boolean subsetSum(int[] A, int x) {
		
		boolean[][] Sum = new boolean[A.length + 1][x + 1];
		// Complete the function from here
		// Feel free to change the return type and parameters
		// Implement the dynamic programming Subset Sum Algorithm
		// Return true if there exists a subset in A with Sum = x
		// Hint: Follow the pseudocode of subsetSum in the slides

		for(int i = 0; i < Sum.length; i++) 
		{
			Sum[i][0] = true;
		}
		
		for(int j = 1; j <Sum[0].length; j++) 
		{
			Sum[0][j] = false;
		}
		
	
		for(int i = 1; i < Sum.length; i++) 
		{
			for(int j = 1; j<Sum[0].length; j++) 
			{
				if(A[i-1] > j) 
				{
					Sum[i][j] = Sum[i-1][j];
				} else {
					
					if(Sum[i-1][j] == true) 
					{
						Sum[i][j] = Sum[i-1][j];
					} else {
						Sum[i][j] = Sum[i-1][j-A[i-1]];
					}
				}
			}
		} 


for(int i = 0; i < Sum.length; i++) {
			for(int j = 0; j<Sum[i].length; j++) {
				System.out.print(Sum[i][j] + " ");
			}
			System.out.println();
		}








		
		return Sum[A.length][x];
	}

	public static void main(String[] args) {
		
		int[] A = {1,3,5,2,8};
		
		int x = 9;
		
		System.out.println("There exists a subset in A[] with Sum = " + x + " : " + subsetSum(A, x) );
		// Expected output: true
	}

}
