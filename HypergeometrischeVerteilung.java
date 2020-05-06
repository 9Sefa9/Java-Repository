package Tools;

import java.util.Scanner;

public class HypergeometrischeVerteilung {

	private static double A, B, a, b;

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("HypergeometrischeVerteilung v1.0");
		System.out.println("-------------------------------------------------------------");
		System.out.println("1.Hypergeometrische Verteilung");
		System.out.println("2.Hypergeometrische Verteilung mit Zufallsvariable X");
		System.out.print("::>");
		switch (eingabe.nextLine()) {
		case "1":
			hypergeometrischeverteilung();
			break;
		case "2":
			System.out.println("wähle x€R  für  X<=x, wobei und X=Zufallsvariable");
			hypergeometrischeverteilungMItZufallsvariable(eingabe.nextDouble());
			break;
		default:
			System.out.println("es ist was schief gelaufen!");
		}

	}

	public static void hypergeometrischeverteilungMItZufallsvariable(double x) {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("====================================");
		System.out.print("B = ");
		B = eingabe.nextInt();

		System.out.print("b = ");
		b = eingabe.nextInt();

		System.out.print("A = ");
		A = eingabe.nextInt();

		System.out.print("a = ");
		a = eingabe.nextInt();
		System.out.println("Deine Rechnung: ");
		rechnung();
		System.out.println("wurde berechnet.\n");
		for (double i = 0; i < x; i++) {
			System.out.println("P(X<=" + i + ")=" + (binomial(B, i) * binomial(A - B, a - i)) / (binomial(A, a)));
			
		}
	}

	public static void hypergeometrischeverteilung() {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("==============================");
		System.out.print("B = ");
		B = eingabe.nextInt();

		System.out.print("b = ");
		b = eingabe.nextInt();

		System.out.print("A = ");
		A = eingabe.nextInt();

		System.out.print("a = ");
		a = eingabe.nextInt();

		System.out.println("Deine Rechnung: ");
		rechnung();
		System.out.println("wurde berechnet.\n");
		System.out.println("Hypergeometrische Verteilung deines Werts: =  "
				+ (binomial(B, b) * binomial(A - B, a - b)) / (binomial(A, a)));

	}

	public static void rechnung() {
		System.out.println();
		System.out.println("|" + (int) B + "|" + "  " + "|" + (int) (A - B) + "|");
		System.out.println("|" + (int) b + "|" + "  " + "|" + (int) (a - b) + "|");
		System.out.println("------------------------------------------------------------");
		System.out.println("|" + (int) A + "|");
		System.out.println("|" + (int) a + "|");

	}

	public static double binomial(double a, double b) {
		return (FakultaetRechnung(a)) / (FakultaetRechnung(a - b) * FakultaetRechnung(b));
	}

	public static double FakultaetRechnung(double x) {
		if (x == 0) {
			return 1;
		} else
			return x * FakultaetRechnung(x - 1);
	}
}
