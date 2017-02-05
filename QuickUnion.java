public class QuickUnion{

		private static int[] id;
		public static void QuickUnionUF(int n){
			id = new int[n];
			for(int i=0; i<n; i++){
				id[i] = i;
			}
		}

		
		public static int find(int i){
				
				while(i != id[i]){
				//id[i] = id[id[i]}; das ist path compressing --> every node is linked to his grandparent 
					i = id[i];
					
				}
				return i;
				
		}
		


		public static void union(int p, int q){
			int rootp = find(p);
			int rootq = find(q);
			id[rootp] = rootq;
		} 
		public static void main(String[] args) {
			QuickUnionUF(10);
			union(4,3);
			union(3,8);
			union(6,5);
			union(9,4);
			for(int s:id){
				System.out.print(s);
			}
			
		}
}