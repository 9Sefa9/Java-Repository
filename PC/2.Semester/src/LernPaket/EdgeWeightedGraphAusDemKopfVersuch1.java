package LernPaket;

import Algorithmen.Bag;
import Algorithmen.MinPQ;
//Fehler : int e geh�rt nciht hierhin
// MST geh�rt nicht hierhin. es ist wirklich nur die erstelleung eines Graphen 
//Konstruktor besitzt einen integer v
// bag initialisierung in dem konstruktor
//addEdge hat ne h��liche funktioni ! adj[v] && adj[w]. add(e)  <<< soll hei�en, dass wir uns in der adj liste die kanten einspeichern
// iterable f�rs ausgeben von adj fehlt !
//
public class EdgeWeightedGraphAusDemKopfVersuch1 {
		
	public Bag<Edge> adj[];
	public int v;

	
	public EdgeWeightedGraphAusDemKopfVersuch1(int V){
	
		this.v=V;
		adj =(Bag<Edge>[])  new Bag[V];
		for(int v = 0; v<V; v++){
			adj[v] = new Bag<Edge>(); 
		}
		
	}
	public int V(){
		return v;
	}
	
	public void addEdge(Edge e){
		int v = e.either();
		int w = e.other(v);
		adj[v].add(e);
		adj[w].add(e);
	
	}
}