package Übung;

public class SuperAufrufÜbung extends SuperDieSuperKlasse {
	
	private int test;
	
	public SuperAufrufÜbung(int geschwindigkeit){
		super(2,4);
		this.test = geschwindigkeit;
	}
	public String toString(){
		return super.toString()+test;
	}
}
