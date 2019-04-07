public class sum{
	
	public static void main(String[] args){
		int s ={1,2,3,4,5};
		System.out.println(sum(s,0));
	}
	public static int summe(int[] a, int b){
		if(b>=0){
			a[b]+=a[b];
			int c=a[b];
			System.out.println(c);
			
		}
	}
	
}