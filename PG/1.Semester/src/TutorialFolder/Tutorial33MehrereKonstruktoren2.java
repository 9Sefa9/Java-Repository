package TutorialFolder;

public class Tutorial33MehrereKonstruktoren2 {
	
	private String farbe;
	private int ps;
	
	public Tutorial33MehrereKonstruktoren2() //Konstruktor 
	{
		this("Blau",100);	//this verwenden wir hier um den konstruktor aufzurufen, der mit den anzahl der parametern umgehen kann. Wir haben hier 2 Parameter , das hei�t es wird Nr.3 aufgerufen 
	}
	public Tutorial33MehrereKonstruktoren2(String farbe)
	{
		this(farbe, 100);
	}
//Nr3	
	public Tutorial33MehrereKonstruktoren2(String farbe, int ps)
	{													//es gibt 3 m�glichkeiten f�r konstruktor. Nr1. verwendet z.b this um zu �berpr�fen was die anderen gleichen konstruktoren f�r parameter haben und gleicht diese ab
		setAuto(farbe,ps);
	}
	public void setAuto(String farbe, int ps)
	{
		setFarbe(farbe);
		setPs(ps);
	}
	public void setFarbe(String farbe)
	{
		this.farbe=farbe;
	}
	public void setPs(int ps)
	{
		this.ps=ps;
	}
}
