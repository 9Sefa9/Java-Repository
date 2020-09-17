package GPT;

import java.util.Scanner;

public class DezimalZuBin�rUmrechner {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.print("Zahl eingeben zum umrechen: ");
		int zahl = eingabe.nextInt();
		System.out.println(bin�r(zahl));

	}

	public static String bin�r(int dezimal) {
		String binaer = "";
		while (dezimal > 0) {
			if (dezimal % 2 == 0) {
				binaer = "0" + binaer;
			}
			if (dezimal % 2 == 1) {
				binaer = "1" + binaer;
			}
			dezimal /= 2;
		}
		return binaer;
	}

}
