import java.util.Scanner;
public class PerfekteZahlen{
	public static void main(String[] args){
		Scanner eingabe = new Scanner(System.in);
		boolean wahrheitswert = false;
		
		System.out.print("Bitte Zahl eingeben!");
		int zahl = eingabe.nextInt();
	
		
		for(int i = 2; i<zahl; i++){
			int summe = 1;
				if((zahl%i) == 0){ 
				summe+=i;
				summe+=(zahl/i);
				if(summe == zahl){
					wahrheitswert = true;
					break;
				} 
				}
		}
		System.out.println("Wahrheitwert: "+wahrheitswert);
	}
}
/*public class PerfectLoop {
    public static void main(String... args) {
        int n = 2;
        int upto = Integer.parseInt(args[0]);
        while(n < upto) {
            int factor = 2;             // potenzieller Teiler
            int sum = 1;                // Teilersumme
            while(factor*factor < n) { // Teiler bis zur Wurzel ausprobieren
                if(n%factor == 0) {   // Teiler gefunden
                    sum += factor;      // Teiler zur Summe addieren
                    sum += n/factor;  // weiteren Teiler addieren
                }
                factor++;               // nächster potenzieller Teiler
            }
            if(factor*factor == n)    // Quadratzahl?
                sum += factor;          // Wurzel addieren
            if(n == sum)                // perfekte Zahl?
                System.out.println(n);  // ja, ausgeben
            n++;
        }
    }
}*/