package diverseTest;

public class length {

	public static void main (String[] args){
		String[] isim = {"Sefa","ist","Cool","ha"};
		int[] isim2= {0,1,2,3};
		String isim3 = "Sefa";
		
		System.out.println("String length:  "+(isim.length));      //4
		System.out.println("String length():  "+(isim3.length())); //4
		System.out.println("int length:  "+(isim2.length));  	   //4
		
//		length 	 gibt die anzahl der Elemente zur�ck !   es wird ab 1 gez�hlt ! aus 0123 = 4
//		length-1 ist f�rs Array relevant, da dort ab 0 gez�hlt wird.  aus 012 = 3
		
		
	}
}
