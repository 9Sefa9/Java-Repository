import java.util.Scanner;
public class Char {
	public static void main(String[] a){
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Bitte irgendwas eingeben, um den jeweiligen ASCII wert zu sehen!");
		String irgendwas = eingabe.nextLine();
		System.out.print("Buchstabe \t ASCII-wert\n");
		for(int i=0; i<irgendwas.length(); ++i){
			char c = irgendwas.charAt(i);
			int ASCIIdezimalzahl = c;  // klappt weil 32 bit überdeckt 16 bit
			
			System.out.println(""+irgendwas+" \t\t"+ASCIIdezimalzahl);
		}
		eingabe.close();
		
	}
}
