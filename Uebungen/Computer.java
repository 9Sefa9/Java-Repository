public class Computer{

	private float spannung = 250;
	private boolean turnon = true;
	private boolean turnoff = false;
	
	public static void main(String[] args){
     //fehler wurde behoben!
	//Parameter werte für Start und Stop wurden verändert, warum?
	
	//weil wir die Main Methode in der Superklasse ausgelagert haben,
	//müssen wir uns vorstellen,: die Main methode gehört nicht zu Computer.
	//da diese Denkweise schwierig ist, ist eine einfache Hilfsklasse sinnvoll.
	
	//FAZIT: lieber keine Main Methode rein packen! weder in sub noch superklasse
	//Hilfsklasse erstellen und von dort aus zugreifen ist die beste mögl..	
     Computer c = new Computer();
	   c.Start(c.spannung,c.turnon);
	   c.RenderMonitor();
	   

	 //Graphikkarte Start und Stop (Polymorphismus)
	   Computer pc = new GraphikKarte();

	   //statt c.spannung oder so hätten wir auch Getter Setter nutzen können(wäre eleganter)
	   ((GraphikKarte)pc).Start(c.spannung-200,c.turnon);
	   ((GraphikKarte)pc).Stop(c.turnoff);

	   c.Stop(c.turnoff);
	   //gebe information über Computer aus (siehe toString methode).
	   System.out.println(c);
	}
	public void Start(float spannung, boolean turnon){
		System.out.println("System wurde gestartet");
		System.out.println("mit spannung: "+spannung);
	}
	public void Stop(boolean turnoff){
		System.out.println("System wurde heruntergefahren");
	}
	public void RenderMonitor(){

	}
	public String toString(){
		return ""+Computer.class.getName()+" hat folgende Komponente: "
		+Netzteil.class.getName()+" und  "+GraphikKarte.class.getName()+".";
	}
}
