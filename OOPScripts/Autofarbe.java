public class Autofarbe extends Auto{
	
	private String farbe1,farbe2;

	public Autofarbe(){

	}
	public void mischen(String farbe1, String farbe2){
		System.out.println(farbe1+farbe2);
	}
	public void mischen(String farbe1){
		System.out.println(farbe1+"irgendwasfarbe");
	}
	public void mischen(){
		System.out.println("garnichts mischen");
	}

}