import java.util.Scanner;
public class Rechner
{
	public static void main(String[] args)
	{
		Scanner eintippen = new Scanner (System.in);
		int a,b,c;
		
		System.out.println("Geben sie bitte eine Zahl ein !: ");
		a = eintippen.nextInt();
		
		System.out.println("Geben sie bitte eine zweite Zahl ein!: ");
		b = eintippen.nextInt();
		c = a + b;
		System.out.println("Ihr Ergebnis/Addition: "+c);
		
	}
}