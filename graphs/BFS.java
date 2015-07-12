import java.util.List;
import java.util.ArrayList;
public class BFS {
	int visitedCount;
	List<Integer> visited;
	Graph G;
	public void traverse(Graph G){
		this.G = G;
		visitedCount = 0;
		visited = new ArrayList<Integer>();
		for(int i = 0; i < G.V.size(); i++){
			if(!visited.contains(G.V.get(i).getV())){
				System.out.println("vertex: "+G.V.get(i).getV());
				bfsVisit(G.V.get(i));
			}
		}
	}
	private void bfsVisit(Vertex v){
		// System.out.println("In bfsVisit.");
		visitedCount++;
		visited.add(v.getV());
		List<Integer> queue = new ArrayList<Integer>();
		queue.add(v.getV());
		while(queue.size() > 0){
		// System.out.println("In while.");
			Integer front = queue.get(0);
			List<Integer> adj = G.getAdjactentVertices(front);
			for(int i = 0; i < adj.size(); i++){
				if(!visited.contains(adj.get(i))){
					visitedCount++;
					visited.add(adj.get(i));
					queue.add(adj.get(i));
					System.out.println("vertex: "+adj.get(i));
				}
			}
			queue.remove(front);
		}
	}
}