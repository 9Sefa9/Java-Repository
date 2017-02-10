public class Computer {

	private float spannung = 250;
	private boolean turnon = true;
	private boolean turnoff = false;
	
	public void Start(float spannung, boolean turnon){
		System.out.println("System wurde gestartet");
		System.out.println("mit spannung: "+spannung);
	}
	public void Stop(boolean turnoff){
		System.out.println("System wurde heruntergefahren");
	}
	public void test(){
		System.out.println("nicht hi");
	}
}
