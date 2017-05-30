
//Die Abstrakte Klasse 
//2 arten von Methoden: abstrakte Methode ohne body und normale Methode mit Body
//Konstruktoren sind erlaubt
//Kann einen Interface implementieren und muss dabei keine Methoden �berschreiben
//sobald eine Methode abstrakt ist, wird die ganze Klasse abstrakt
//es ist m�glich objekte von anderen Klassen zu erstellen, au�er Interfaces und AbstractClasses
//Super ausdruck kommt als erste anweisung

public abstract class TheAbstract {

	private String name ;
	private int [] a;
	//this() l�uft intern ab
	//super() ruft den superkonsturktor auf 
	public TheAbstract(int[] array){
		a= new int[array.length];
		this.a = array;
	}
	
	public TheAbstract(String s){
		this.name = s;
	}
	public int[] abstractMethodArray() {
		return this.a;
	
	}
	public abstract int abstractMethod(String abs);
}
