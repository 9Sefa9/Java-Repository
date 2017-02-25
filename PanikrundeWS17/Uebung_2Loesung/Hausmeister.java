package Uebung_2;

public class Hausmeister extends Person implements KannArbeiten{

	@Override
	public void arbeiten() {
		System.out.println(name + " repariert alles.");
	}

}
