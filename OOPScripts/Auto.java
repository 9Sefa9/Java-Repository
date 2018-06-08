public class Auto{

	private int psstaerke;
	private int reifen;
	private int tuere;
	private String automarke;
	public Auto(){

	}
	public Auto(String automarke,int psstaerke, int reifen,int tuere){
		this.automarke = automarke;
		this.psstaerke = psstaerke;
		this.reifen = reifen;
		this.tuere = tuere;
	}
	public String getAutomarke(){
		return this.automarke;
	}

	public int getPsstaerke(){
		return this.psstaerke;
	}
	public int getReifen(){
		return this.reifen;
	}
	public int getTuere(){
		return this.tuere;
	}
	public void setPsstaerke(int p){
		this.psstaerke = p;
	}
	public void setReifen(int r){
		 this.reifen = r;
	}
	public void setTuere(int t){
		this.tuere = t;
	}
	public void ausstattung(){
		System.out.println("es ist leder!");
	}

	public String toString(){
		return "Psstärke:"+this.psstaerke+"\nReifenanzahl:"+this.reifen+"\nTürenanzahl: "+this.tuere+"."+"\nFarbe: "+this.automarke;
	}

}
