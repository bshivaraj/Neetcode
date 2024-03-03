package BFS;

import java.util.Arrays;

public class BFS_Test {
	public static void main(String[] args) {
		Vertex<Integer> v0=new Vertex<Integer>(0);
		Vertex<Integer> v1=new Vertex<Integer>(1);
		Vertex<Integer> v2=new Vertex<Integer>(2);
		Vertex<Integer> v3=new Vertex<Integer>(3);
		Vertex<Integer> v4=new Vertex<Integer>(4);
		Vertex<Integer> v5=new Vertex<Integer>(5);
		Vertex<Integer> v6=new Vertex<Integer>(6);
		
		v0.setVerties(Arrays.asList(v1,v5,v6));
		v0.setVerties(Arrays.asList(v3,v4,v5));
		v0.setVerties(Arrays.asList(v2,v6));
		v0.setVerties(Arrays.asList(v0));
		
		BreadthFirstSearch bfs=new BreadthFirstSearch<Integer>(v1);
		bfs.trverseVertex();
		
	}

}
