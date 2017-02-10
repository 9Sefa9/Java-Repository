public class hilfsklasse{

	public static void main(String[] args){
    float spannung = 250;
	boolean turnon=true;
	boolean turnoff=false;

     Computer pc = new Netzteil();
	   pc.Start(spannung,turnon);
	   pc.Stop(turnoff);
	   pc.test();
	   ((Netzteil)pc).test2();
	}
}