package Panikrunde2016;

public class Baum extends Pflanze {
	private int jahresringe;
	
	public Baum(String art, int jahresringe){
		this.art = art;
		this.jahresringe = jahresringe;
	}

	public void setJahresringe(int ringe) {
		this.jahresringe = jahresringe;
		
	}
	public int setJahresringe() {
		return this.jahresringe;
		
	}
	public String toString(){
		return "Du bist eine : "+art+"und Du hast "+this.jahresringe+""; 
	}
	
}
