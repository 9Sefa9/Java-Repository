public class KlausurAufgabe7Tiger extends KlausurAufgabe7Animal{
	
	public KlausurAufgabe7Tiger(double weight){
	super(weight);
	}
	public double getWeight(){
		return super.getWeight();
	}
	public void setDangerous(boolean gefahr){
		super.setDangerous(gefahr);
	}
	public void setClaws(boolean klauen){
		super.setClaws(klauen);
	}
	public void roar(){
		System.out.println("Roarrr");
	}
	
}