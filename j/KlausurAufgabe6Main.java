public class KlausurAufgabe6Main{
	public static void main(String[] args){
		KlausurAufgabe6MyComputer c = new KlausurAufgabe6MyComputer();
		c.setRamSize(8000);
		c.setHasCdDrive(true);	
		System.out.println(c.getRamSize());
	}
}