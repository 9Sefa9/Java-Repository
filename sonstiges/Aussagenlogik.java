import java.util.Scanner;
public class Aussagenlogik
{
	public static void main(String[] args)
	{
		int zahl1;
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Willkommen bei der Aussagenlogik!");
		System.out.println("Bitte Wählen sie Einer der Aussagen!\n");
		System.out.println("1. Und Tabelle (Konjuktion)");
		System.out.println("2. Oder Tabelle (Disjunktion)");
		System.out.println("3. \u00C4quivalenz Umformung (Bikonditional)");
		System.out.println("4. Folgerungs Tabelle (Implikation)");
		System.out.println("5. Zeichen in Word");
		System.out.println("6. 2er Potenz");
		System.out.println("Bitte eine Zahl eingeben!:\n");
		zahl1 = eingabe.nextInt();
		
		switch (zahl1)
		{
			case 1: 
			Konjuktion();
			break;
			
			case 2: 
			Disjunktion();
			break;
			
			case 3: 
			Bikonditional();
			break;
		
			case 4: 
			Implikation();
			break;
			
			case 5:
			Zeichen();
			break;
			
			case 6:
			Potenz();
			break;
			default:
			System.out.println("Bitte geben sie erneut ihre eingabe ein!: ");
			
			
			
			
		}

	
	
	}	
	
	public static void Konjuktion()
	{
		System.out.println("A\tB\tAnB");
		System.out.println("1\t1\t1");
		System.out.println("1\t0\t0");
		System.out.println("0\t1\t0");
		System.out.println("0\t0\t0");
	}
	public static void Disjunktion()
	{
		System.out.println("A\tB\tAvB");
		System.out.println("1\t1\t1");
		System.out.println("1\t0\t1");
		System.out.println("0\t1\t1");
		System.out.println("0\t0\t0");
	}
	public static void Implikation()
	{
		System.out.println("A\tB\tA->B");
		System.out.println("1\t1\t1");
		System.out.println("1\t0\t0");
		System.out.println("0\t1\t1");
		System.out.println("0\t0\t1");
	}
	public static void Bikonditional()
	{
		System.out.println("A\tB\tA<->B");
		System.out.println("1\t1\t1");
		System.out.println("1\t0\t0");
		System.out.println("0\t1\t0");
		System.out.println("0\t0\t1");
	}
	public static void Zeichen()
	{
		System.out.println("Zeichen\t\tTasten-Kombination");
		System.out.println("oder\t\t\t Alt + c 2228");
		System.out.println("und\t\t\t Alt + c 2227");		
		System.out.println("e\t\t\t Alt + c 2208");
		System.out.println("!e\t\t\t Alt + c 2209");
		System.out.println("Teilmenge\t\t Alt + c 2286");
		System.out.println("A\t\t\t Alt + c 2200");
		System.out.println("Vereinigung\t \t Alt + c 222A");
		System.out.println("Exis.\t\t\t Alt + c 2208");
		System.out.println("querstrich\t\t Alt + c 2216");
		System.out.println("ungleich\t\t Alt + c 2260");
	}
	public static void Potenz()
	{
		System.out.println("2hoch0\t2hoch1\t2hoch2\t2hoch4\t2hoch5\t2hoch6\t2hoch7\t2hoch8\t2hoch9");
		System.out.println("1\t2\t4\t8\t16\t32\t64\t128\t256");	
	}
	
	}