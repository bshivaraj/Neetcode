package BFS;

import java.util.LinkedList;
import java.util.List;

public class Vertex<T>{

	private  T data;
	private boolean visited;
	private List<Vertex<T>> verties=new LinkedList<>();
	
	public Vertex(T data) {
		this.data=data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public List<Vertex<T>> getVerties() {
		return verties;
	}
	public void setVerties(List<Vertex<T>> verties) {
		this.verties = verties;
	}
}
