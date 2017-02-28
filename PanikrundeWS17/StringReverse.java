public class StringReverse{
	public static void main(String[]args){
		iterativ("Hakan");
		//rekursiv("Hakan");
	}
	public static void iterativ(String s){
		for(int i = s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
	}
}