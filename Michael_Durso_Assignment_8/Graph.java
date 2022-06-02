


import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Graph {
	private Vertex vertexList[];
	private int adjMat[][]; //adjacency matrix
	private LinkedList<LinkedList<Integer>> adjlist; //adjacency list
	private int vertexcycleflag[]; //for detecting cycles
	private int nVerts;
	private Stack<Integer> theStack; //for DFS
	private Queue theQueue; //for BFS
	
	public static void main(String[] args) {
		// complete the main method to 
		// a. create a graph for problem 5 in Assignment 8
		// b. test if the graph contains cycles for problem 6 in Assignment 8
		// For b, an array vertexcycleflag[] has been created in the class to keep track of node status 
		
		
		
		
		
		// An example to create a directed graph using the Graph class
		char[] element = {'0','1','2','3','4','5'};
		Graph theGraph = new Graph(element.length);
		 for(char s :element){
		   theGraph.addVertex(s);
		  }
		// A: 0, B: 1, C: 2, D: 3, E: 4
		theGraph.addEdge(0, 1);
		theGraph.addEdge(0, 2);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(1, 3);
		theGraph.addEdge(2, 3);
		theGraph.addEdge(3, 4);
		theGraph.addEdge(4, 0);
		theGraph.addEdge(4, 1);
		theGraph.addEdge(4, 5);
		
		System.out.println("Adjacency List:");
		for(int i = 0; i < element.length; i++) {
			System.out.println(element[i] + ": " + theGraph.adjlist.get(i));
		}
		System.out.println();
		
		
		System.out.print("visits:");
		
		theGraph.dfs();
		//theGraph.bfs();
		//theGraph.dfsr();
		System.out.println();
		System.out.println();

		
		System.out.println("Is there a cycle: " + theGraph.detectcycle());
		
		
		
	}
 
	
	 public Graph(int n) {
		  
		  vertexList = new Vertex[n];
		  
		  vertexcycleflag = new int[n];//For detecting cycles, nodes are either -1, 0, or 1
		  
		  
		  for  (int i = 0; i < n; i++) {
			  vertexcycleflag[i] = -1; //Initially, all nodes are -1
		  }
		 
		  
		  //adj matrix
		  adjMat = new int[n][n];
		  nVerts = 0;
		  for (int i = 0; i < n; i++) {
		   for (int j = 0; j < n; j++) {
		    adjMat[i][j] = 0;
		   }
		  }
		  
		  //adj list
		  
		  adjlist = new LinkedList<LinkedList<Integer>>();
		  for (int i = 0; i < n; i++) {
				
				adjlist.add(new LinkedList<Integer>());
			}
		  
		  theStack = new Stack<Integer>();
		  theQueue = new Queue();
		 }

	
 
	public void addVertex(char nodename) {// add vertex
		vertexList[nVerts++] = new Vertex(nodename);
	}
 
	public void addEdge(int start, int end) {// directed
		//adj matrix
		adjMat[start][end] = 1;
		
		//adjMat[end][start] = 1; for undirected graph
		//adj list
		
		if(!adjlist.get(start).contains(end))
			adjlist.get(start).add(end);
			 
		/* if(!adjlist.get(end).contains(start))
			adjlist.get(end).add(start); // for undirected graph
		*/ 
		
	}
 
	public void displayVertex(int v) {// print vertex label
		System.out.print(vertexList[v].lable);
	}
 
	public int getAdjUnvisitedVertex(int v) {// get an unvisited connected vertex
		for (int i = 0; i < nVerts; i++) {
			if (adjMat[v][i] == 1 && (vertexList[i].wasVisited == false || vertexcycleflag[i] == 0)) {
				return i;
			}
		}
		return -1;
	}
	
	
	



	public boolean detectcycle()
	{
		//complete the method to detect cycles in a directed graph
		//feel free to change the return type, parameters
		//an array vertexcycleflag[] has been created in the class to keep track of node status
		//the dfs() funciton in the class is a good example when writing detectcycle()
		//as the cycle detection algorithm discussed in the class is based on dfs
		
		
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].wasVisited = false;// Reset the wasvisited matrix 
			vertexcycleflag[i] = -1; //Initially, all nodes are -1
		}
		
		//Pick the starting node randomly
		//Random rand = new Random();
		for(int i = 0; i < nVerts; i++) {
			int randNum = i;
			
			//Visit the starting node
			vertexList[randNum].wasVisited = true; 
			vertexcycleflag[randNum] = 0;         //finishing cycle
			displayVertex(randNum);
			theStack.push(randNum);
			
			while (!theStack.isEmpty()) {
				int neighbor = getAdjUnvisitedVertex(theStack.peek());
				if(neighbor != -1) {
					if (vertexcycleflag[neighbor] == -1)
					{
						theStack.push(neighbor);
						vertexcycleflag[neighbor] = 0;
						vertexList[neighbor].wasVisited = true;
						vertexList[neighbor].cycleflag = 0;
						displayVertex(neighbor);
						System.out.println(theStack);
					} 
					else if(vertexcycleflag[neighbor] == 0 )
					{
						displayVertex(neighbor);
						return true;
					} 
					else 
					{
						vertexList[neighbor].wasVisited = true;
						vertexList[neighbor].cycleflag = 1;
						vertexcycleflag[neighbor] = 1;
						displayVertex(neighbor);
						theStack.pop();
					} 
				} 
				else 
				{
					return false;
				}
			}
		}
		return false;
	}

	
	
	
	
	
	
 
	public void dfs() {// DFS using stack
	
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].wasVisited = false;// Reset the was visited matrix 
		}
		//Pick the starting node randomly
		Random rand = new Random();
		int randNum = rand.nextInt(nVerts);
		
		//Visit the starting node
		vertexList[randNum].wasVisited = true; 
		displayVertex(randNum);
		theStack.push(randNum);
 
		while (!theStack.isEmpty()) {
			int neighbor = getAdjUnvisitedVertex(theStack.peek());
			if (neighbor == -1) {
				theStack.pop();
			} else {
				vertexList[neighbor].wasVisited = true;
				displayVertex(neighbor);
				theStack.push(neighbor);
			}
		}
 		

	}
	
	
 
	public void bfs() {// BFS using a queue
		
		for (int j = 0; j < nVerts; j++) {
				vertexList[j].wasVisited = false; // Reset the wasvisited matrix
		}
		//Pick the starting node randomly
		Random rand = new Random();
		int randNum = rand.nextInt(nVerts);
		
		//Visit the starting node
		vertexList[randNum].wasVisited = true;
		displayVertex(randNum);
		theQueue.insert(randNum);
	
		
		while (!theQueue.isEmpty()) {
			int currentv = theQueue.remove();
			int neighbor;
			while ((neighbor = getAdjUnvisitedVertex(currentv)) != -1) {
				vertexList[neighbor].wasVisited = true;
				displayVertex(neighbor);
				theQueue.insert(neighbor);
			}
		}
	 
	}
	
}
