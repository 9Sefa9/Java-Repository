package Uebung_2;
public class Lehrer extends Person implements KannArbeiten{

	private String fach;
	private boolean istNett;
	
	@Override
	public void arbeiten() {
		System.out.println(fach + "unterricht!");
	}
	
	public boolean gibtHausaufgaben(){
		return !istNett;
	}
	
	public void setFach(String fach){
		this.fach=fach;
	}
	public String getFach(){
		return fach;
	}

}
