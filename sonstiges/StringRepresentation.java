package Tests;

import java.util.Scanner;

public class StringRepresentation {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Dies soll die Eigenschaften eines Strings representieren");
		System.out.println("Gib einen String zur analyse: ");
		String m = eingabe.nextLine();
		String [] a = {m,m,m};
		System.out.println("Du hast eingegeben: "+m);
		System.out.println("=====================================================\n");
		System.out.println(".length = "+m.length());
		System.out.println(".charAt(2) = "+m.charAt(2));
		System.out.println(".substring(1,4)="+m.substring(1, 4));
		System.out.println(".substring(3)="+m.substring(3));
		System.out.println(".startsWith(m,3)="+m.startsWith(m,3));
		System.out.println(".indexOf(3= if(found, return the position, else return -1))"+m.indexOf(3));
		System.out.println(".length Anzahl der Elemente in einem Array fängt bei 1 an = "+a.length);
	}
}
