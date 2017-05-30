package KontrollUndFunktionsstrukturen;

public class S�ugetier {
	private int alter;

	public int getAlter() {
		return alter;
	}

	public void altern() {
		alter++;
	}

	
	
	public static void main(String[] a){
		S�ugetier fido = new Hund();
		S�ugetier cindy = new Hund(); // sei ausnahmsweise nicht hund, sondern katze, weil kb nochmal neue klasse zu erstellen...
		//S�ugetier fido;  erzeugt noch kein Objekt !   die Referenzvariable "fido" wird nur dem objekttypen S�ugetier zugewiesen!(referenz)
		// erst mit dem new Operator wird eine Instanz erstellt.
		// die "instanziierung einer Klasse " ist �quivalent zu "erzeugen eines Objekts"
		fido.getAlter(); 
		System.out.println("Da alter vn fido ist: "+fido.getAlter());  // greift auf getAlter von der Superklasse!  
	//	System.out.println("Fido macht " + fido.bellen()); // Fehler, da die methode bellen nicht in der Superklasse ist!
		System.out.print("Fido macht:"+((Hund)fido).bellen());// hier wird gecastet ! es wird also gesagt: Fido ist ab sofort ein objekt von Hund! 
														// und Hund hat bellen als methode !
		cindy.altern(); //greift auf Superklasse altern
		System.out.println("Cindy ist jetzt " + cindy.getAlter()); // greift auf Superklasse getAlter
		
		
		((Hund)cindy).bellen();	// sei Cindy eine katze, und wir wollen Katze zu Hund Casten: das geht nicht ! beispieL:
//		s�ugetier olaf = hund
//		s�ugetier cindy = katze
//		folgendes funktioniert nicht: (hund)cindy.bellen    <--- wir k�nnen nicht cindy zu einem Hund machen, weil sie ist eine katze!
//		folgendes funktioniert jedoch: (Hund)fido.bellen();
		
	}
}
