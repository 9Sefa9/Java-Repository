package Polymorphismus;
public class Fruit extends Product {

	private int quantity;

	public Fruit(int id, String name, double price, int quantity) {
	/* id name price wurden vom konstruktor erstellt. 
	 *sie greifen auf den Konstruktor super zu.
	 *super greift allerdings auf die protecteds zu. 
	 *quantit�t wurde noch hinzugef�gt!
	 */
	
		super(id, name, price);
		this.quantity = quantity;
	}
	// override bedueted anscheinend �berschreiben!
	@Override
	public void runPastScanner() {
		System.out.println("Produkt " + name + " wurde gewogen.");
	}

	@Override
	public String toString() {
		return "Mein Id ist " + id + ". Ich heiße " + name
				+ ". Ich koste " + price + " Euro und meine Anzahl ist "
				+ quantity + ".";

	}

}
