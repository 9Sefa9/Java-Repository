public class Automarke extends Auto{
	
	private String automarke; //mitsubishi
	
	public Automarke(String automarke,int ps,int reifen, int tuere){
		super(automarke,ps,reifen,tuere);
	}

	public void setAutomarke(String automarke){
		this.automarke = automarke;
	}
	public String getAutomarke(){
		return this.automarke;
	}
}