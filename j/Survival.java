import java.util.Scanner;
public class Survival
{
	public static void main(String[] args)
	{
		Menu();
		Story1();
		
		
	}
	public static void Menu()
	{
		String eingang;
		
		Scanner auswahl = new Scanner(System.in);
		
		System.out.print("\n\n\t\t\t\t\t\t\tTHE SURVIVAL GAME BY KIROSHI!\n\n");
		System.out.print("\t\t\t\t\t\t\t\t   Men\u00fc");
		System.out.print("\n\t\t\t\t\t\t\t1.Start the Story! (type:> Story)");
		System.out.print("\n\t\t\t\t\t\t\t2.Quit the Game!(type:> Quit");
		System.out.print("\n\t\t\t\t\t\t\t Type:> ");
		eingang = auswahl.nextLine();	
		if(eingang.equals("Story") || eingang.equals("story"))
		{
			Charakter();
		//	Story(); ein beispiel!	
		}
		else if(eingang.equals("Quit") || eingang.equals("quit"));
		{
			return;
		}
	}
	public static void Charakter()	
	{
		int alter;
		int faehigkeit;
		String name;
		String antwort;
		String reset;
		String geschlecht;
		
		Scanner eingabe1 = new Scanner(System.in);
		Scanner eingabe2 = new Scanner(System.in);
		Scanner eingabe3 = new Scanner(System.in);
		Scanner eingabe4 = new Scanner(System.in);
		Scanner eingabe5 = new Scanner(System.in);
		
		System.out.print("Bist du ein Weib Sterblicher ? (tippe w oder m) :>");
		eingabe4.nextLine();
		
		System.out.print("Wie hei\u00dft du Sterblicher ?! :> ");
		name = eingabe1.nextLine();
		
		System.out.print("\nWie alt bist du Sterblicher "+name+"? :> ");
		alter = eingabe2.nextInt();
		if(alter>80 || alter<0)
		{
			System.out.print("\nFehler! alter unreal!");
			Menu();
		}	
		System.out.print("Wähle deine Fähigkeiten Sterblicher "+name);
		System.out.println("\n1.Ruhig\n2.Normal\n3.Mysteriös\n4.Trevor-like");
		faehigkeit = eingabe5.nextInt();
	
		switch(faehigkeit)
		{
			case 1:
			System.out.println("Du hast die Fähigkeit: Ruhig!");
			Story1ruhig();
			break;
			
			case 2:
			System.out.print("Du hast die Fähigkeit: Normal! ");
			break;
			
			case 3:
			System.out.println("Du hast die Fähigkeit: Trevor-like");
			break;
		    default: System.out.print("Eingabe ungueltig ! bitte wiederhole den ganzen vorgang!");
		}
		
		System.out.print("\nBist du bereit zu \u00dcberleben Sterblicher "+name+"? (tippe ja oder nein!):>");
		antwort = eingabe3.nextLine();
		
		if(antwort.equals("Ja") || antwort.equals("ja"))		//probleme bei der initialisierung von Strings in der If bedingung!
		{
			System.out.print("...\ntauche dich in die Welt von Kartia "+name+"!");
			//Story();
		} //falls nein, dann soll Character nochmal abgespielt werden und bei nicht, zurück ins menü.
		else if(antwort.equals("Nein") || antwort.equals("nein"))
		{
			System.out.print("\nDu bist anscheinend nicht bereit! "+name+"\nzur\u00fcck zur Men\u00fcauswahl ? oder Programm beenden ?(zurueck/beenden)\n\n\n :>");
			reset = eingabe3.nextLine();
			
			if(reset.equals("Zurueck") || reset.equals("zurueck"))
			{
				 Menu();
			}
			else if(reset.equals("Beenden") || reset.equals("beenden"))
			{
				 return;
			}
		   /*RETURN to come out of the method execution, 
			*BREAK to come out of a loop execution and continue to skip the rest of the current loop. 
			*In your case, just return, 
			*but if you are in a for loop, for example, 
			*do BREAK to stop the loop or continue to skip to next step in the loop
			*/
		}
	}
	public static void Story1ruhig()
	{
			int AUSSAGE1;
			Scanner aussage1 = new Scanner(System.in);
			
			System.out.println("\n Kartia... ein vergessenes Land.. ein Land ohne perspektiven. Ungern moechten sich Menschen dort Niederlassen!");
			System.out.println(" Doch schon bald wird es jemand geben, der bereit ist sich der Gefahr zu stellen.");
			System.out.println(" Alles begann in einem kleinem Dorf namens smeltos..............................");
			System.out.println(""+name+"!!!"+""+name+"!!!"+"Steh schon auf! raus aus den Federn  hab ich gesagt !");
			System.out.println(" 1. Ach lass mich doch weiter schlafen... ich flehe dich an!");
			System.out.println(" 2. Ok Mutter ich stehe ja schon auf...");
			System.out.println(" 3. Laut meinen Berechnungen zu folge, müssen Menschen 10 Stunden am Tag schlafen... verlass bitte mein Zimmer..");
			System.out.print(":> ");
			AUSSAGE1 = aussage1.nextInt();
			if(AUSSAGE1 == 1)
			{
				System.out.print("Auch wenn du bettelst, ich hab keine Gnade ! und jetzt AUFSTEHEN "+name+" !");
			}
			
			
	}
}


