import java.util.Scanner;

public class Gr��terGemeinsamerTeiler {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.println("gr��ter gemeinsamer teiler: " + ggt(8964,5063));
	}

	public static int ggt(int a, int b) {
		if (b == 0)
			return a;
		else
			return ggt(b, a % b);
	}

}
