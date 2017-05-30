import java.util.Scanner;
public class Maximum{
	
	public static void main(String[] args){
		
		int ersteEingabe;
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Bitte gib eine Zahl ein!:> ");
		ersteEingabe = eingabe.nextInt();
		System.out.print(max(0));
		
		}
		
	
	public static int max(int zahl, int zahl2){
		
		int x;
		x = eingabe.nextInt();
		
		if(x != 0){
			if(zahl>zahl2){
				return zahl;
		....
		}
		else return max(zahl>zahl);
		
		
	}
	
}