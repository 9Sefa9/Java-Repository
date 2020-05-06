package LernPaket;

import Algorithmen.*;

public class QuickUnionAusDemKopf {

	private int[] id;
	private  int[] size;
	private  int count; // ANZAHL DER KOMNPONENTE!

	public static void main(String[] args) {
		int n = StdIn.readInt();
        QuickUnionAusDemKopf uf = new QuickUnionAusDemKopf(n);
        
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }

	//MUSS DER KONSTRUKTOR SEIN !
	public  QuickUnionAusDemKopf(int N) {
		id = new int[N];
		size = new int[N];
	//DARF NICHT STEHEN: 	count = 0;
		count = N;
		for (int i = 0; i < N; i++) {
			id[i] = i; 
	// DARF NICHT STEHEN!		count++;
			size[i] = 1;
		}

	}
	public int  count(){
		return count;
	}
	public boolean connected(int p, int q){
		return find(p) == find(q);
	}
	public int find(int i){
		while(i != id[i]){
			id[i] = id[id[i]];
			i = id[i];
			size[i]	= i;
		}
		return i;
	}
	public  void union(int p , int q){
		
	int rootp = find(p);
	int rootq = find(q);
//	id[rootp] = rootq;
	if(rootp == rootq) return;
	
		if(size[rootp] <size[rootq]){
			id[rootp] = rootq;
			size[rootq] += size[p];
		}else if( size[rootp] > size[rootq]){
			id[rootq] =rootp;
			size[rootp] += size[rootq];
		}
		//DA DER ROOT VERWEIS AUF EIN ANDERES ROOT ZEIGT: count--; 
		count--;
	}
	
}
