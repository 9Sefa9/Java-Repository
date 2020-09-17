public class summealleradditionen{
	public static void main(String[] args){
		System.out.println("Die summe aller ganzzahlen zwischen 1 und 5 lautet: "+sum(0,5));
	}
	public static int sum(int a, int b){
		if( a == b)
			return a;
		else
			return a += sum(a+1,b);
	}	
}