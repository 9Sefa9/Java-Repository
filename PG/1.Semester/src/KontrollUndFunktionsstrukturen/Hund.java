package KontrollUndFunktionsstrukturen;

public class Hund extends S�ugetier {
	private int alter;

	public int getAlter() {
		return alter;
	}

	public void alter() {
		alter++;
	}
	public String bellen(){
		return "Wuff";
	}
}
