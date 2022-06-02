import java.util.*;

public class FinalAssn  implements Iterable
{
   
   private Node root;
   private Comparator comparator;

   public FinalAssn()
   {
      root = null;
      comparator = null;
   }

   public FinalAssn(Comparator comp)
   {
      root = null;
      comparator = comp;
   }

   private int compare(int[] x, int[] y)
   {
      if(comparator == null)
      {
    	if(x[0]>y[0])
    		return 1;
  		else if (x[0]==y[0])
   			return 0;
 		else
    		return -1;
      }
      else
      return comparator.compare(x,y);
   }

/*****************************************************
*
*            INSERT
*
******************************************************/
   public void insert(int[] data)
   {
      root = insert(root, data);
   }
   private Node insert(Node p, int[] toInsert)
   {
      if (p == null)
         return new Node(toInsert);

      if (compare(toInsert, p.data) == 0)
      	return p;

      if (compare(toInsert, p.data) < 0)
         p.left = insert(p.left, toInsert);
      else
         p.right = insert(p.right, toInsert);

      return p;
   }

/*****************************************************
*
*            SEARCH
*
******************************************************/
//   public boolean search(int toSearch)
//   {
//      return search(root, toSearch);
//   }
//   private boolean search(Node p, int toSearch)
//   {
//      if (p == null)
//         return false;
//      else
//      if (compare(toSearch, p.data) == 0)
//      	return true;
//      else
//      if (compare(toSearch, p.data) < 0)
//         return search(p.left, toSearch);
//      else
//         return search(p.right, toSearch);
//   }

/*****************************************************
*
*            DELETE
*
******************************************************/

   public void delete(int[] toDelete)
   {
      root = delete(root, toDelete);
   }
   private Node delete(Node p, int[] toDelete)
   {
      if (p == null)  throw new RuntimeException("cannot delete.");
      else
      if (compare(toDelete, p.data) < 0)
      p.left = delete (p.left, toDelete);
      else
      if (compare(toDelete, p.data)  > 0)
      p.right = delete (p.right, toDelete);
      else
      {
         if (p.left == null) return p.right;
         else
         if (p.right == null) return p.left;
         else
         {
         // get data from the rightmost node in the left subtree
            p.data = retrieveData(p.left);
         // delete the rightmost node in the left subtree
            p.left =  delete(p.left, p.data) ;
         }
      }
      return p;
   }
   private int[] retrieveData(Node p)
   {
      while (p.right != null) p = p.right;

      return p.data;
   }


/*************************************************
 *
 *            TRAVERSAL
 *
 **************************************************/

   public void preOrderTraversal()
   {
      preOrderHelper(root);
   }
   private void preOrderHelper(Node r)
   {
      if (r != null)
      {
         System.out.print(r.data+" ");
         preOrderHelper(r.left);
         preOrderHelper(r.right);
      }
   }

   public void inOrderTraversal()
   {
      inOrderHelper(root);
   }
   private void inOrderHelper(Node r)
   {
      if (r != null)
      {
         inOrderHelper(r.left);
         System.out.println(r.data[0]+" " + r.data[1]);
         inOrderHelper(r.right);
      }
   }

/*************************************************
 *
 *            CLONE
 *
 **************************************************/

   public FinalAssn clone()
   {
      FinalAssn twin = null;

      if(comparator == null)
         twin = new FinalAssn();
      else
         twin = new FinalAssn(comparator);

      twin.root = cloneHelper(root);
      return twin;
   }
   private Node cloneHelper(Node p)
   {
      if(p == null)
         return null;
      else
         return new Node(p.data, cloneHelper(p.left), cloneHelper(p.right));
   }

/*************************************************
 *
 *            MISC
 *
 **************************************************/



   public int countLeaves()
   {
      return countLeaves(root);
   }
   private int countLeaves(Node p)
   {
      if(p == null) return 0;
      else
      if(p.left == null && p.right == null) return 1;
      else
      return countLeaves(p.left) + countLeaves(p.right);
   }



  //This method restores a BST given preorder and inorder traversals
//   public void restore(int[] pre, int[] in)
//   {
//      root = restore(pre, 0, pre.length-1, in, 0, in.length-1);
//   }
//   private Node restore(int[] pre, int preL, int preR, int[] in, int inL, int inR)
//   {
//      if(preL <= preR)
//      {
//         int count = 0;
//         //find the root in the inorder array
//         while(pre[preL] != in[inL + count]) count++;
//
//         Node tmp = new Node(pre[preL]);
//         tmp.left = restore(pre, preL+1, preL + count, in, inL, inL +count-1);
//         tmp.right = restore(pre, preL+count+1, preR, in, inL+count+1, inR);
//         return tmp;
//      }
//      else
//         return null;
//   }
   
  //The size of a binary tree is the number of elements in the tree.

   public static int size(Node p)
   {
	   if (p!=null)
	   {
		   return 1 + size(p.left) + size(p.right);
	   }
	   return 0;
		   
   }


/*****************************************************
*
*            TREE ITERATOR
*
******************************************************/
//
//   public Iterator iterator()
//   {
//      return new MyIterator();
//   }
//   //pre-order
//   private class MyIterator implements Iterator
//   {
//      Stack<Node> stk = new Stack<Node>();
//
//      public MyIterator()
//      {
//         if(root != null) stk.push(root);
//      }
//      public boolean hasNext()
//      {
//         return !stk.isEmpty();
//      }
//
//      public Integer next()
//      {
//         Node cur = stk.peek();
//         if(cur.left != null)
//         {
//            stk.push(cur.left);
//         }
//         else
//         {
//            Node tmp = stk.pop();
//            while( tmp.right == null )
//            {
//               if(stk.isEmpty()) 
//            	   return cur.data;
//               tmp = stk.pop();
//            }
//            stk.push(tmp.right);
//         }
//
//         return cur.data;
//      }//end of next()
//
//      public void remove()
//      {
//
//      }
//   }//end of MyIterator

/*****************************************************
*
*            the Node class
*
******************************************************/

   public class Node
   {
      private int[] data;
      private Node left, right;

      public Node(int[] data, Node l, Node r)
      {
         left = l; right = r;
         this.data = data;
      }

      public Node(int[] data)
      {
         this(data, null, null);
      }


   } //end of Node
   
   public static void inOrder(Node r)
   {
      if (r != null)                        
      {
         inOrder(r.left);                     //sorts the left side of node list
         x.add(r);                            //adds node to array list
         inOrder(r.right);                    //sorts the right side of the node list
      } 
   }
   
   public static Node kthSmallestElement(Node p, int k)
   {
	// Complete the method to find the k_th smallest node in a BST
	// Feel free to change the return type, parameters
	  // if(x.isEmpty()==false) {
	  //	   x.clear();
	  // }
	   x = new ArrayList<Node>();          //declares the global variable
	   inOrder(p);                         //sorts the nodes 
	   
	   return x.get(k-1);                 //returns the k element
   }
   
   public static int count;
   public static double sum;
   
   public static double average(Node p, int k1, int k2) {
	   sum = 0;
	   count = 0; 
	   k1k2Range(p,k1,k2);
	   return sum/count;
   }
   
   public static void k1k2Range(Node p, int k1, int k2)
   {
	// Complete the method to find all values in [k1,k2] in a BST
	// Feel free to change the return type, parameters
	   if (p != null)
	      {
	         k1k2Range(p.left,k1,k2);                       //calls to check if numbers fall on left side
	         if(k1<=p.data[0] && k2>=p.data[0]) {                 //sees if the node falls in between the range
	        	 count++;
	        	 sum+= p.data[1];							//prints it out if its in the range
	         }
	         k1k2Range(p.right,k1,k2);                      //calls to check if numbers fall on the right side
	      }
   }
   
   public static Node findmin(Node p)
   {
	// Complete the method to find the minimum node in a BST
	// Feel free to change the return type, parameters
	  // return findmin(p, null);
	   if(p.left==null) {
		   return p;
	   } else {
		   return findmin(p.left);            //goes all the way to the left of the tree for min
	   }
	
   }
   
   public static Node findmax(Node p)
   {
	// Complete the method to find the maximum node in a BST
	// Feel free to change the return type, parameters
	   if(p.right==null) {
		   return p;
	   } else {
		   return findmax(p.right);            //goes all the way to the right of tree for max 
	   }
	
   }
   
   public static ArrayList<Node> x;        //stores the sorted list
   
   public static void main(String[] args)
   {
   		int[] test1 = {20201125,88}; 
   		int[] test2 = {20190119,58}; 
   		int[][] testArr = {{20181216, 90}};
   				
   		FinalAssn bst = new FinalAssn();
        for(int i = 0; i < testArr.length; i++) {
        	bst.insert(testArr[i]);		
        }
        
   		bst.inOrderTraversal();
   		bst.insert(test1);
   		bst.insert(test2);
   		System.out.println();
   		bst.inOrderTraversal();
   		System.out.println();
   		System.out.println(average(bst.root, 20190119, 20201125));
   		System.out.println();
   		bst.delete(test1);
   		bst.inOrderTraversal();	
   		
   }

}//end of BST

