package TutorialFolder;

public class Tutorial25ArraysVer�nderungen {

	public static void main(String[] args) {
		String[] tierArray = { "Hund", "Katze", "Maus", "Elefant" };

		for (String index : tierArray) {
			System.out.println(index);
		}
		tierArray[0] = "Amaise";			//erkl�rt sich von selbst ! 
//		tierArray[2] = "L�wer";				//tierArray soll position 0 und 2 amaise und l�wer sein.

		for (String index : tierArray) {		//arrays funktionieren mit Strings doubles integers etc.
			System.out.println(index);
		}

	}

}
