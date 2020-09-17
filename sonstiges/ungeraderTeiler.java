package Tests;
import java.util.Scanner;
public class ungeraderTeiler {

	public static void main(String[] arg){
		Scanner eingabe = new Scanner(System.in);
		int zahl = eingabe.nextInt();
		System.out.println(ungeradezahl(zahl,zahl));
		System.out.println(alternativloesung(zahl));
	}
	public static int ungeradezahl(int zahl, int teiler){
		if((teiler%2 == 1) && (zahl%teiler== 0))
			return teiler;
		else return ungeradezahl(zahl,teiler-1);
	}
	//primfaktorzerlegung
	public static int alternativloesung(int z){
		if(z % 2 == 1)//ist meine zahl ungerade ?
			return z;
		else{//wenn nicht, dann ist sie durch 2 teillbar
			return alternativloesung(z/2);
		}
		//solange durch 2 teilen, bis ich was ungerades raus bekommen	
	}
}
