package TutorialFolder;

public class Tutorial33MehrereKonstruktoren1 {

	public static void main(String[] args) {
		//Konstruktor mit und ohne Parameter
		// 2 M�gliochkeiten
		
		//Nr.3 wird aufgerufen	
		Tutorial33MehrereKonstruktoren2 auto1 = new Tutorial33MehrereKonstruktoren2("Gr�n", 200);
		//Nr.1 wird aufgerufen, da wir einen konsturktor erstellt haben, f�r den falls, dass es keine parameter hat.
		Tutorial33MehrereKonstruktoren2 auto2 = new Tutorial33MehrereKonstruktoren2();
		
		

	}

}
