public class QuickFind{
	
	private int[] id;
	
	
	public static boolean connected(int p, int q){
		return find(p) == find(q);
	}
	//find wusste ich garnicht, wie ich es implementieren sollte
	// es greift anscheinend auf den inhaltselement von p zu ( id[] p)
	public static int find(int p ){
		return id[p];
	}
	
	
	public static void QuickFindUF(int N){
		id = new int[n];
		for(int i=0; i<n; i++){
			id[i] = i;
		}
	}
	
	
	public static void union(int p, int q){
		int pid = id[p];
		int qid = id[q];
		//mein fehler hier waren folgende : i<n muss gändert werden zur array länge id.length
		for(int i=0; i<n; i++){
			if(id[i] == pid ){
				id[i] = qid;
			}
		}
	}
	
	public static void main(String[] args){
		
	}
}