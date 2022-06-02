import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Fractionalknapsack {
	
	
	
	public static void sortitems(ArrayList<item> svd)
	{
		
		// Sort items by density in descending order
		Collections.sort(svd, new Comparator<item>(){
		     public int compare(item o1, item o2){
		         if(o1.density == o2.density)
		             return 0;
		         return o1.density > o2.density ? -1 : 1;
		     }
		});
		
		
	}
	
public static double greedyfractionalknapsack(ArrayList<item> svd, int S){
		
		
		// Complete code here to maximize the value of items in the factional knapsack problem
		// Assume that items in list svd are sorted by density already
		// S represents the size of the knapsack
		// Output: the maximum value of the knapsack
		// Feel free to change return type and parameters
		int count = 0;
		int size = 0;
		int value = 0;
		
		
		// Uncomment for debugging
		while(count < svd.size() && (size+svd.get(count).size) < S) {
			value += svd.get(count).value;
			size += svd.get(count).size;
			//System.out.println(count + " Size: " + size + " Out of " + S);
			//System.out.println(count + " Value: " + value);
			count++;
		}
		int x;
		if(count < svd.size() && size < S) {
			x = S - size;
			//System.out.println("X: " + x);
			//System.out.println(((x*svd.get(count).size) / svd.get(count).size));
			size += (x*svd.get(count).size) / svd.get(count).size;
			value += (x*svd.get(count).value) / svd.get(count).size;
			//System.out.println(count + " Size: " + size + " Out of " + S);
			//System.out.println(count + " Value: " + value);
			
		}
		
		return value;
		
		
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max_size,n;  
      
        ArrayList<item> items=new ArrayList();
		// item 1, value 6, size 1
        items.add(new item(1, 6, 1));
		// item 2, value 10, size 2
		items.add(new item(2, 10, 2));
		// item 3, value 12, size 3
		items.add(new item(3, 12, 3));
		// the size of your knapsack
        max_size=5;  
		// sort items by density
		sortitems(items);
 
        System.out.println("The maximum value we can place into the knapsack is "+ greedyfractionalknapsack(items, max_size));



}
	
	
}
