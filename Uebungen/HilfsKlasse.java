public class HilfsKlasse{
	public static void main(String[] args){
		//in die Hilfsklasse kommt üblich die Main Methode rein.
		//wir hatten das aber in die Superklasse ausgelagert!.
	Computer pc = new Computer();
	pc.Start(250,true);
	pc.Stop(false);

	}
}