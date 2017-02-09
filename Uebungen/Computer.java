public class Computer implements Netzteil{

	private float spannung = 250;
	private boolean turnon = true;
	private boolean turnoff = false;
	
	public static void main(String[] args){
     Computer c = new Computer();
	   c.Start(this.spannung,this.turnon);
	   c.Stop(this.turnoff);
	}
	public void Start(float spannung, boolean turnon){
		System.out.println("System wurde gestartet");
		System.out.println("mit spannung: "+spannung);
	}
	public void Stop(boolean turnoff){
		System.out.println("System wurde heruntergefahren");
	}
}
