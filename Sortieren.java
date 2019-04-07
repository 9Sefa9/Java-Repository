import java.util.Scanner;
public class Sortieren{
	public static void main(String[] args)
	{
		int zahl1; 
		int zahl2;
		int zahl3;
		Scanner eingabe = new Scanner(System.in);
		Scanner eingabe2 = new Scanner(System.in);
		Scanner eingabe3 = new Scanner(System.in);
		System.out.print("erste (Ganz-)zahl: ");
		zahl1 = eingabe.nextInt();
		System.out.print("zweite (Ganz-)zahl: ");
		zahl2 = eingabe2.nextInt();
		System.out.print("dritte (Ganz-)zahl: ");
		zahl3 = eingabe3.nextInt();
		
		if((zahl1<1000 && zahl1>0) && (zahl2<1000 && zahl2>0) && (zahl3<1000 && zahl3>0)){ 
		if((zahl1>zahl2) && (zahl2>zahl3))
		{
			System.out.println(zahl1);
			System.out.println(zahl2);
			System.out.println(zahl3);
		}else if((zahl1>zahl3) && (zahl3>zahl2))
		{
			System.out.println(zahl1);
			System.out.println(zahl3);
			System.out.println(zahl2);
		}else if((zahl2>zahl1) && (zahl1>zahl3))
		{
			System.out.println(zahl2);
			System.out.println(zahl1);
			System.out.println(zahl3);
		}else if((zahl2>zahl3) && (zahl3>zahl1))
		{
			System.out.println(zahl2);
			System.out.println(zahl3);
			System.out.println(zahl1);
		}else if((zahl3>zahl2) && (zahl2>zahl1))
		{
			System.out.println(zahl3);
			System.out.println(zahl2);
			System.out.println(zahl3);
		}else if ((zahl3>zahl1) && (zahl1>zahl2))
		{
			System.out.println(zahl3);
			System.out.println(zahl1);
			System.out.println(zahl2);	
		}
		}else System.out.println("Einer der Zahlen sind uber 1000 oder kleiner 0 !");
	}
}