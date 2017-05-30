import java.util.Scanner; // ist jedem klar. 
public class Expand {
        public static void main(String[] args) {
        // üblicher Vorgang, deshalb nicht nötig.
		String s; 
		Scanner eingabe = new Scanner(System.in);
		System.out.print("Gib bitte irgendwas ein.:>> ");
		s=eingabe.nextLine();
		
		
                for(int i = 0; i<s.length(); i++) {
                        char c = s.charAt(i);		// gehe alle Buchstaben durch ( bis i) wobei i = ++i
                        if(c > '0' && c <= '9') {  // wenn zahl zwischen 0 und 9 dann mache folgendes:
                                
								// erstelle ein Integer n, nimm die "zahl" aus dem char raus und subtrahiere sie mit 48. 
								// warum 49 ? weil die Zahlen von 1 bis 9 auf der ASCII-Tabelle,: ab 49 bis 57 eingetragen sind. 
								// wobei die zahl 49 die Dezimalstelle in der Tabelle ist. 
								// char 0 kommt nichtt in frage weil ja z.b 0 x a = a ist.
								// Beispiel: char c = '0' - '5' = als Integer: 53-48, oder besser gesagt: Integer 5    also char c = 53-48 = int 5
								
								int n = c-49;		
                                
								String anfang = s.substring(0, i);	//substring läuft von anfang bis zur Zahl
                                String wiederholung = repeat(n, s.charAt(i+1)); //SIEHE FUNKTION UNTEN!
                                String schluss = s.substring(i+1);	//substring startet ab dem gefundenen char und gibt laut def. den rest aus.
                                
								s = anfang + wiederholung + schluss;	//teilStringA + die zuWiederholendeString + teilStringB 
																
					   }
                }
                System.out.println(s); // gibt den String mit ihren eigenschaften aus.
        }
									//n= -38		//c = buchstabe++
        public static String repeat(int n, char c) {
                String r = ""; // leerer Inhalt.
                //solange der "leere" String kleiner als n ist 
				while(r.length()<n){
                        //addiere r mit dem gefundenen char "zahl" und speicher sie auf r.
						r=r+c;
                }//und gebe anschließen r aus.
                return r;
        }
}
// Tabelle: https://www.uni-due.de/hummell/infos/ascii/