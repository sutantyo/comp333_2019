package graph;

import java.util.TreeSet;
import java.util.TreeMap;

public class Graph {

	private TreeSet<Vertex> vertices;
	
	
	public Graph() {
		vertices = new TreeSet<Vertex>();
	}
	
	/**
	 * Returns a list of vertices in the graph. The method returns a new
	 * TreeSet<Vertex> so that the original graph cannot be modified via 
	 * the returned object.
	 * 
	 * @return the list of vertices
	 */
	public TreeSet<Vertex> getVertices(){
		return new TreeSet<Vertex>(vertices);
	}
	
	
	public void addVertex(Vertex v) {
		vertices.add(v);
	}
	
	public boolean addEdge(Vertex a, Vertex b, int weight) {
		a.setNeighbour(b, weight);
		return true;
	}
	

	public void unmarkAll() {
		for (Vertex v : vertices) {
			v.setUnmarked();
		}
	}
	
	
}
