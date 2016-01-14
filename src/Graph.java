import java.util.ArrayList;
import java.util.Iterator;


public class Graph {
	private final int MAX_VERTS=20;
	private Vertex vertexList[];
	private ArrayList<ArrayList<Integer>> adjacencyList;
	private int nVerts;
	//constructor
	public Graph(){
		vertexList = new Vertex[MAX_VERTS];
		nVerts=0;
		adjacencyList=new ArrayList<ArrayList<Integer>>();
		
			
	}//end of constructor
	//method to add vertex and create a new index for that vertex in adjacencyList
	public void addVertex(char lab){
		vertexList[nVerts++]=new Vertex(lab);
		adjacencyList.add(new ArrayList<Integer>());
	}
	//method to add edge
	public void addEdge(int start,int end){
		adjacencyList.get(start).add(end);
		adjacencyList.get(end).add(start);
	}
	//method to display vertex
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	}
	//method to display vertex cover
	public void vertexCover(){
		for(int u=0;u<nVerts;u++){
			if(!vertexList[u].wasVisited){
				vertexList[u].wasVisited=true;
				int v = getUnvisitedVertex(u);
				if(v==-1)
					continue;
				vertexList[v].wasVisited=true;
				System.out.print(vertexList[u].label);
				System.out.print(vertexList[v].label+" ");
				
			}//end of if
		}//end of for
		for(int i=0;i<nVerts;i++)
			vertexList[i].wasVisited=false;
	}//end of vertexCover
	private int getUnvisitedVertex(int u){
		Iterator<Integer> itr = adjacencyList.get(u).iterator();
		while(itr.hasNext()){
			int v = itr.next();
			if(!vertexList[v].wasVisited)
				return v;
		}//end of while
		return -1;
		
	}//end getUnvisitedVertex
		
	
}//end of class
