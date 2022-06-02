public class LinkedList {
	
	
	// The LinkedList Node class
	private class Node{
		
		int data;
		Node next;
		
		Node(int gdata)
		{
			this.data = gdata;
			this.next = null;
		}
		
	}
	
	
	// The LinkedList fields
	Node head;
	
	// Constructor
	LinkedList(int gdata)
	{
		this.head = new Node(gdata);
	}
	
	public void Insertend(int gdata)
	{
		Node current = this.head;

		while(current.next!= null)
		{
			current = current.next;
		}
		
		Node newnode = new Node(gdata);
		current.next = newnode;
		
	}
	
	public void Listprint()
	{
		Node current = this.head;

		while(current!= null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
		
	}
	
	
	
	 Node sortedMerge(Node a, Node b) 
	    { 
	        Node result = null; 
	        /* Base cases */
	        if (a == null) 
	            return b; 
	        if (b == null) 
	            return a; 
	  
	        /* Pick either a or b, and recur */
	        if (a.data <= b.data) { 
	            result = a; 
	            result.next = sortedMerge(a.next, b); 
	        } 
	        else { 
	            result = b; 
	            result.next = sortedMerge(a, b.next); 
	        } 
	        return result; 
	    } 
	  
	    
	  
	    // Get the middle of the linked list 
	    public static Node getMiddle(Node head) 
	    { 
	        if (head == null) 
	            return head; 
	  
	        Node slow = head, fast = head; 
	  
	        while (fast.next != null && fast.next.next != null) { 
	            slow = slow.next; 
	            fast = fast.next.next; 
	        } 
	        return slow; 
	    } 
	    
	
	public Node Listsort(Node start)
	{
	// Complete this method to sort a Linked list
	// Return the first node in the sorted list
	// Feel free to change the method type, add/remove parameters
	// Full credit (30 points) will be awarded for an algorithm that is O(nlog n). 
	// Algorithms that are O(n^2) slower will be scored out of 10 points.
	

	        // Base case : if head is null 
	        if (start == null || start.next == null) { 
	            return start; 
	        } 
	  
	        // Get the middle of the list 
	        Node middle = getMiddle(start); 
	        Node nextofmiddle = middle.next; 
	  
	        // Set to null 
	        middle.next = null; 
	  
	        // Apply sort:
	        Node left = Listsort(start); 			// on left list
	        Node right = Listsort(nextofmiddle); 	// on right list
	  
	        // Merge the left and right lists 
	        Node sortedlist = sortedMerge(left, right); 
	        return sortedlist; 
	}
	
	public static void main(String[] args) {
		System.out.print("Non-sorted linked list is: ");
		LinkedList exlist = new LinkedList(0);
		exlist.Insertend(1);
		exlist.Insertend(5);
		exlist.Insertend(2);
		exlist.Insertend(7);
		exlist.Insertend(10);
		exlist.Insertend(3);
		exlist.Listprint();
		//output: 0 1 5 2 7 10 3
		
		System.out.print("Sorted linked list is:	   ");
		exlist.Listsort(exlist.head);
		exlist.Listprint();
		//output should be: 0 1 2 3 5 7 10
			
	}
	

}