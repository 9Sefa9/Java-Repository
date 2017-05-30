public class KlausurAufgabe7Animal{
	private boolean hasClaws;
	private boolean isDangerous;
	private double weight;
	
	public KlausurAufgabe7Animal(double weight){
		this.weight = weight;
	}
	
	public void setClaws(boolean klauen){
		this.hasClaws = klauen;
	} 
	public boolean getClaws(){
		return this.hasClaws;
	}
	public void setDangerous(boolean gefahr){
		this.isDangerous = gefahr;
	}
	public boolean getDangerous(){
		return this.isDangerous;
	}
	public double getWeight(){
		return this.weight;
	}
	public static void main(String[] args){
		KlausurAufgabe7Tiger test = new KlausurAufgabe7Tiger(3.4d);
		test.setClaws(true);
		System.out.print(test.getClaws());
	}
}