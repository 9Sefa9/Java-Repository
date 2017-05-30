public class ThePolymorph3{
	public static void main(String[] args){
		// das ist eine Test klasse für Polymorphismus 1 & 2
		//poly1 ist super klasse. 
		//poly2 ist unterklasse(subklasse)
		ThePolymorph1 tp = new ThePolymorph2(2.0);
		tp.a1(3);
		tp.polyester1("HI");
	}
}