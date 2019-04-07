public class QuickFind{
	
	private int[] id;
	
	public QuickFind(int[] id){
		this.id = id;
	}
	
	public  boolean connected(int p, int q){
		return find(p) == find(q);
	}
	//find wusste ich garnicht, wie ich es implementieren sollte
	// es greift anscheinend auf den inhaltselement von p zu ( id[] p)
	public  int find(int p ){
		return id[p];
	}
	
	
	public void QuickFindUF(int n){
		id = new int[n];
		for(int i=0; i<n; i++){
			id[i] = i;
		}
	}
	
	
	public void union(int p, int q){
		int pid = id[p];
		int qid = id[q];
		//mein fehler hier waren folgende : i<n muss gändert werden zur array länge id.length
		for(int i=0; i<id.length; i++){
			if(id[i] == pid ){
				id[i] = qid;
			}
		}
	}
	
	public static void main(String[] args){
		int[] array = {3,1,5,8,4,6,8,6,3,9};
		QuickFind t = new QuickFind(array);
		for(Integer i: array)
			System.out.print(i);
		t.union(0,9);
		System.out.println();
		for(Integer i:array)
			System.out.print(i);
	}
}