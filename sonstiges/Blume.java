package Panikrunde2016;

public class Blume extends Pflanze {
	private String bl�tenfarbe;
	
	public Blume(String art){
		super.art = art;
	}
	
	public void setBluetenfarbe(String bl�tenfarbe){
		this.bl�tenfarbe = bl�tenfarbe;
	}
	public String getBluetenfarbe(){
		return this.bl�tenfarbe;
	}
	/*public String toString(){
		return "Deine Bl�tenfarbe ist "+getBluetenfarbe()+" und du bist eine : "+super.art+"";
	}
	*/
}
