public class arraysum{
	public static void main(String[] args){
		int s[] = {6,9,8,3,7,5,4};
		System.out.println(sum(s,0));
	}
	public static int sum(int[] a, int i){

		if(i == a.length-1){
			return a[i];
		}
		else return a[i] += sum(a,i+1);
		// 3 + 

	}
}