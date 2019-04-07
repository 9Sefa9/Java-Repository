public class RekursionVonDerProbeklausur{
	
	public static void main(String[] args){

		int[] a = {2,4,5,7,9};
		printRec(a,0);
	
	}													//0
	public static void printRec(int[] a,int j){
		int i =a.length-1; //9
		
		if( j <= i){
				printRec(a,1+j);    // int z = 2     ++z      4++   4+1   4
				System.out.println(a[j]);
	}
		else return;
			
		
	}
	
	
}