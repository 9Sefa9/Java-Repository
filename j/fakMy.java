import java.util.Scanner;
public class fakMy{
	public static void main(String[] args){
		int zahl;
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Bitte die zu berechnende fakultät wählen:> ");
		zahl = eingabe.nextInt();
		System.out.println(fakultät(zahl));
	}
	public static int fakultät(int zahl){
		if(zahl >0)
			return zahl*fakultät(--zahl);
		
		else 
		return 1;
	}
}