package �bung;

public class Schulverwaltung{
	public int Dienstalter;
	public int anzahlF�cher;
	public String[] f�cher  = new String[anzahlF�cher-1];
	
	public Schulverwaltung (int alter, int f�cheranzahl, String []dieF�cher){
		this.Dienstalter = alter;
		this.anzahlF�cher = f�cheranzahl;
		this.f�cher = dieF�cher;
	}
}
