import java.util.List;
import java.util.ArrayList;
public class DFS {
	List<Integer> visited = new ArrayList<Integer>();
	Graph G;
	public void traverse(Graph G){
		this.G = G;
		for(int i = 0; i < G.V.size(); i++){
			if(!visited.contains(G.V.get(i).getV())){
				dfsVisit(G.V.get(i).getV());
			}
		}
	}
	public void dfsVisit(Integer v){
		System.out.println("vertex: "+v);
		visited.add(v);
		List<Integer> adj = G.getAdjactentVertices(v);
		for(int i = 0; i< adj.size(); i++){
			if(!visited.contains(adj.get(i))){
				dfsVisit(adj.get(i));
			}
		}
	}
}