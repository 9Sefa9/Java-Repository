package Verkn�pfungen;

public class AutoTutorial30 {
	
	private String autoFarbe;
	private int Pferdest�rke;
	static int navi;	//Statisch. Einmal ver�ndert, Mehrmals nutzbar als die wert die eingetragen wurde.
	
	public AutoTutorial30(String farbe, int ps) //Konstruktor 
	{
		this.autoFarbe = farbe;
		this.Pferdest�rke = ps;
	}
	public void updateNavi(int navigationssystem) //setter
	{
		this.navi = navigationssystem;
	}
	public int getNavi()						 //getter		
	{
		return navi;
	}

	//Regeln f�r Konstruktor:
	//1.Sie tragen immer den Namen der Klasse.
	//2.Sie k�nnen �berladen werden (mehrere Konstruktoren).
	//3.Sie besitzen keinen R�ckgabewert.
}
