import java.util.List;
import java.util.ArrayList;
public class TraversalClient {
	public static void main(String[] args) {
	
		Graph G = new Graph();
		G.addVertex(1);
		G.addVertex(2);
		G.addVertex(3);
		G.addVertex(4);
		G.addVertex(5);
		G.addVertex(6);

		G.addEdge(1, 2);
		G.addEdge(1, 3);
		G.addEdge(2, 3);
		G.addEdge(2, 5);
		G.addEdge(2, 6);
		G.addEdge(3, 4);
		G.addEdge(4, 5);
		
		// List<Integer> adj = G.getAdjactentVertices(2);
		// for(Integer i : adj){
		// 	System.out.println(i + "  ");
		// }
		// G.printAllEdges();


		BFS b = new BFS();
		b.traverse(G);
		System.out.println("\n");

		DFS d = new DFS();
		d.traverse(G);
	}
}