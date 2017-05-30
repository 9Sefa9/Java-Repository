public class FamilieA{
	private String Mitglied;
	public static void main(String[] args){
	
	FamilieB aile = new FamilieB();
	aile.setMitglied("Sefa");
	System.out.println("erste Mitglied 1:"+getMitglied());
	}	
		
	public void setMitglied(String mitglied){
		this.Mitglied = mitglied;
	}
	public String getMitglied(){
		return this.Mitglied;
	}
}
