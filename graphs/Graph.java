import java.util.List;
import java.util.ArrayList;
public class Graph {
	public List<Vertex> V = new ArrayList<Vertex>();
	public List<Edge> E = new ArrayList<Edge>();

	public void addVertex(int v) {
		V.add(new Vertex(v));
	}
	public void addEdge(int v1, int v2){
		E.add(new Edge(v1, v2));
	}

	public void printAllEdges(){
		for (int i = 0; i < E.size(); i++)
			System.out.println(E.get(i).getV1()+" -- "+E.get(i).getV2());
		System.out.println();
	}

	public List<Integer> getAdjactentVertices(Integer v){
		List<Integer> adj = new ArrayList<Integer>();
		for(int i = 0; i < E.size(); i++){
			if(E.get(i).getV1() == v){
				adj.add(Integer.valueOf(E.get(i).getV2()));
			}
			if(E.get(i).getV2() == v){
				adj.add(Integer.valueOf(E.get(i).getV1()));
			}
		}
		return adj;
	}
}