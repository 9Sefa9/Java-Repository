import java.util.Scanner;
public class Taschenrechner{
	public static void main(String[] args){
		getCalculation();
	}
	public static void getCalculation(){
		
		double zahl1;
		double zahl2;
		String text3;
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("tippe zahl 1: ");
		zahl1 = eingabe.nextDouble();
		
		System.out.print("tippe zahl 2: ");
		zahl2 = eingabe.nextDouble();
		
		System.out.println("1.Addition\n2.Subtraktion\n3.Division\n4.Multiplikation");
		text3 = eingabe.nextLine();
		
		switch (text3){
			case "addition": System.out.print("Addition: "+(zahl1+zahl2));
			break;
			case "subtraktion": System.out.print("SUbtraktion: "+(zahl1-zahl2));
			break;
			case "Division": System.out.print("Division"+(zahl1/zahl2);
			break;
			case "Multiplikation": System.out.print("Multiplikation: "+(zahl1*zahl2);
			break;		
		default: System.out.println("Fehler!");
		}	
		
		)
	}
}