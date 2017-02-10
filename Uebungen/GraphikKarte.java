public class GraphikKarte extends Computer implements Netzteil{
	public void Start(float spannung, boolean turnon){
		System.out.println("Starte Graphikkarte mit "+spannung+"watt");
	}
	public void Stop(boolean turnoff){
		System.out.println("Stope Graphikkarte");
	}
}