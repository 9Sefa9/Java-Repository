public class Lehrer extends Mensch implements Schule{

	private String fach;
	private boolean istNett;

	public void arbeiten(){
		System.out.println(fach+" unterricht!");
	}
	public boolean gibtHausaufgaben(){
		return !istNett;
	}
	public void setFach(String fach){
		this.fach = fach;
	}
	public String getFach(){
		return fach;
	}
}