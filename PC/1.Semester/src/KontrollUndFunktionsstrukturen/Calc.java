package KontrollUndFunktionsstrukturen;
import java. util.Scanner;
public class Calc {
	
	/*
	 * Dieses Programm stellt einen einfachen Taschenrechner dar, der die vier Grundrechenarten mit Integerzahlen l�st. 
	   Es wurden if-else-Zweige verwendet
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bitte zwei Zahlen eingeben");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Bitte Operator eingeben (1 f�r +, 2 f�r -, 3 f�r *, 4 f�r /");
		int operator = scan.nextInt();
		
		if (operator == 1) {
			System.out.println(a+b);
		} else if ( operator == 2) {
			System.out.println(a-b);
		} else if (operator == 3) {
			System.out.println(a*b);
		} else if (operator == 4) {
			
			if  (b != 0) {
				System.out.println((a/b));
			} else {
				System.out.println("Division durch null");
			}
		} else 
			System.out.println("Keine g�ltige Operation, bitte von vorne starten!");
		
		
		
	}

}
