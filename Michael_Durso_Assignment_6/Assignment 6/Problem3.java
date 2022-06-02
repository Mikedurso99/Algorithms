import java.util.Arrays;

public class Problem3 {

	
	public static void threeway(int[] a, int e)
	{
		//complete the code from here
		//given an array A[], write a function that re-arrange elements in A[] that pivot and //elements=pivot are placed in the middle, elements < pivot are on the left handside
		// elements > pivot are on the right handside.
		//in-place, O(n) expected
		int pivot = a[0]; // let the leftmost element be the pivot
		int i = 1;
		int j = e;
		int holder = 0;
		
		while(i < j) {
			while( i < a.length-1 && a[i]<pivot)
				i++;
			while( j > 1 && a[j] >= pivot) 
				j--;
			if (i >= j) 
				break;
			//update values
			holder = a[i];
			a[i] = a[j];
			a[j] = holder;
		}
		
		holder = a[j];
		a[j]=a[0];
		a[0] = holder;
		
		i = j+1;
		j = a.length-1;
		
		while(i < j) {
				if(a[j] == pivot && a[i] !=pivot) {
					holder = a[i];
					a[i] = a[j];
					a[j] = holder;
					i++;
				} else if(a[i]==pivot) {
					i++;
				}
				j--;
		}
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method
		int[] testarray={1, 2, 2, 2, 6, 1, 7, 0, -5, 2, 8, 1, 3, 1, 1};
		// Test your method
		threeway(testarray, 14);
		System.out.println(Arrays.toString(testarray));
		// Your method should output {0, -5, 1, 1, 1, 1, 1, 2, 6, 7, 2, 2, 2, 8, 3}
		// with all elements = pivot next to pivot elements<pivot on the left, >pivot on the right
		
		
		
	}
}