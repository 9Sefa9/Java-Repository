public class Fak {
	// Reksursive Funktion
	public static int fak(int v){ // int v erstellt{
		while (v>=1){
			return v*fak(v-1);  
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(fak(4));		
	}
}
