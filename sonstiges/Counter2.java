package �bungenL�sungen;
import java.util.Scanner;
public class Counter2 {


	public static String countMostFrequentChar(String line) {
	    // Array speichert Vorkomnisse einzelner Buchstaben
	    int cnt[] = new int[line.length()];

	    // In der �u�eren Schleife selektieren wir jeden einzelnen Buchstaben 'i'
	    // und in der inneren Schleife m�ssen wir lediglich vom aktuell
	    // selektierten Buchstaben 'i' bis zum Ende des Strings 'line' alle
	    // restlichen Buchstaben vergleichen
	    for (int i = 0; i < line.length(); i++) {
	      for (int j = i; j < line.length(); j++) {
	        // sind 2 Buchstaben gleich, z�hlen wir den Counter an Stelle i um 1
	        // hoch, Leerzeichen k�nnen als Eingabe auftauchen, sind jedoch keine
	        // Buchstaben und werden daher verworfen
	        if (line.charAt(i) == line.charAt(j) &&
	            Character.isLetter(line.charAt(i))) {

	          cnt[i] = cnt[i] + 1;
	        }
	      }
	    }

	    // Maximumssuche: den kleinsten Wert als Anfangsmaximum setzen, bietet sich
	    // an, da man so nicht Gefahr l�uft, das Maximum von vornherein zu gro� zu
	    // w�hlen
	    int max = Integer.MIN_VALUE;

	    // der am h�ufigsten vorkommende Buchstabe
	    String mostFrequent = "";

	    // Wir durchlaufen einfach unser Array und merken uns den Buchstaben mit
	    // gr��ter H�ufigkeit
	    for (int i = 0; i < cnt.length; i++) {
	      // wenn unser aktuelles Maximum kleiner ist als der Wert, den wir
	      // betrachten, haben wir ein neues Maximum gefunden und ersetzen es
	      if (max < cnt[i]) {
	        max = cnt[i];
	        // da im cnt-Array nur int-Werte sind, m�ssen wir durch erneuten
	        // Zugriff auf line den Buchstaben extrahieren
	        mostFrequent = "" + line.charAt(i);
	      }
	    }

	    return "" + mostFrequent + "\n" + max;
	  }

	  public static void main(String[] args) {
	    Scanner localScanner = new Scanner(System.in);
	    System.out.println(countMostFrequentChar(localScanner.nextLine()));
	    localScanner.close();
	  }
}
