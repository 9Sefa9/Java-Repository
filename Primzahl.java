import java.util.Scanner;
public class Primzahl{

	public static void main(String[] args) {
		
		boolean ergebnis = false; 
		int eingegebeneZahl;
		Scanner eingabe = new Scanner(System.in);
		//UserInput via Scanner Import.
		
		System.out.print(" Bitte die Zahl eingeben, wo du denkst, es ist eine Primzahl:>");
		eingegebeneZahl = eingabe.nextInt();
		
		/*Primzahl ermittlung startet erst dann, wenn die Zahl ziwschen 0 und 1000 ist ! ansonsten siehe Zeile 38
		*k ist != 1 , da laut definition, 1 keine Primzahl ist!
		* k zählt hoch bis zur eingegebeneZahl
		*/
		if((eingegebeneZahl<1000) && (eingegebeneZahl>0)){
		for (int k = 2; k<eingegebeneZahl; k++) {
			
			//wenn der rest zwischen eingegebeneZahl und k == 0 ergibt, 
			
			if ((eingegebeneZahl % k) == 0) {
				ergebnis = true; //wird boolean : ergebnis auf "wahr" eingestellt. 
			}
		}
		//falls weiterhin ergebnis false bleibt, dann ist es eine Primzahl
		
		if (ergebnis == false) {
			System.out.println("zahl ist eine Primzahl");
		}

		else {
			//ansonsten ist es keine Primzahl!.
			
			System.out.println("Zahl ist keine Primzahl");
		}
		}else System.out.print("Eingabe ist groesser 1000 oder kleiner 0 !");

	}
}