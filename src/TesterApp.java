
public class TesterApp {
	public static void main(String[] arg){
		Graph graph = new Graph();
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		graph.addVertex('F');
		graph.addVertex('G');
		graph.addEdge(0, 1);
	    graph.addEdge(0, 2);
	    graph.addEdge(1, 3);
	    graph.addEdge(3, 4);
	    graph.addEdge(4, 5);
	    graph.addEdge(5, 6);
		graph.vertexCover();
	}
}
