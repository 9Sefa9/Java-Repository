package LernPaket;

import Algorithmen.Graph;

public class BreadthFirstSearch {
	private boolean[] marked;
	private int[] edgeTo;
	private int[] distTo;
	public Queue<Integer> queue = new Queue<Integer>();
	
	private void bfs(Graph G, int s) {

		marked[s] = true;
		distTo[s] = 0;
		queue.enqueue(s);
		
		while (!queue.isEmpty()) {
			int v = queue.dequeue();
			for (int w : G.adj(v)) {
				if (!marked[w]) {
					queue.enqueue(w);
					marked[w] = true;
					edgeTo[w] = v;
					distTo[w] = distTo[v] + 1;
				}
			}
		}
	}
}
