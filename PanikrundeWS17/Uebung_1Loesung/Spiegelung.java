package Uebung_1;

public class Spiegelung {

	//Main
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String text=sc.nextLine();
		System.out.println(mirrorTextIterativ(text));
		System.out.println(mirrorTextRekursiv(text));
	}
	
	
	
	//Iterativ
	private static String mirrorTextIterativ(String string) {
		String mirrored="";
		for(int i=string.length()-1;i>=0;i--){
			mirrored+=string.charAt(i);
		}
		return mirrored;
	}
	
	//Rekursiv
	private static String mirrorTextRekursiv(String string)
	{
		if(string.length()  == 1){
			return string;
		}
		else {
			return mirrorTextRekursiv(string.substring(1)) + string.charAt(0);
		}
	}

}
