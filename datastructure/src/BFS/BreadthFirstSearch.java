package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T> {
	
	private Vertex<T> startVertex;
	
	@Override
	public String toString() {
		return "BreadthFirstSearch [startVertex=" + startVertex + "]";
	}

	BreadthFirstSearch(Vertex<T> startVertex){
		this.startVertex=startVertex;
	}
	
	public void trverseVertex() {
		Queue<Vertex<T>> queue=new LinkedList<Vertex<T>>();
		queue.add(startVertex);
		
		while(!queue.isEmpty()) {
			Vertex<T> current=queue.poll();
			if(!current.isVisited()) {
				current.setVisited(true);
				System.out.println(current);
				queue.addAll(current.getVerties());
			}
		}
		
	}

}
