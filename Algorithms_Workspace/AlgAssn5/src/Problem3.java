public class Problem3 {
	
	
	
	
	public static void commonelements(double[] s1, double[] s2)
	{
		// complete the commonelements() method to find out
		// elements that occur in both s1 and s2
		// feel free to change method type and parameters
		// Full credit will awarded to algorithms O(n)
	
		int i = 0;
		int j = 0;
		
		while(i < s1.length && j < s2.length) {
			if(i != 0 && s1[i] == s1[i-1]) {
				i++;
			} else if (j != 0 && s2[j] == s2[j-1]) {
				j++;
			} else if (s1[i] == s2[j]) {
				System.out.print(s1[i] + " ");
				i++;
				j++;
			} else if (s1[i]>s2[j]) {
				j++;
			} else {
				i++;
			}
		}		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test your commonelements() method here
		double[] testarray1 = {0, 0, 0, 1, 2, 3, 97, 98};
		double[] testarray2 = {0, 1, 2, 3, 4, 4, 10, 98, 100, 100};

		
		System.out.println("Elements that occur in both arrays: ");
		commonelements(testarray1,testarray2);
		//should output 0, 1, 2, 3, 98
		
	}

}
