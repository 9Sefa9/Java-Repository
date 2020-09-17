package Tests;

import java.util.Scanner;

public class TimeElapsOfTwoTimes {

	public static void main(String[] leckmich) {
		Scanner eingabe = new Scanner(System.in);
		float time1 = eingabe.nextFloat(); // 14:00
		float time2 = eingabe.nextFloat();//12:00
		

		if (time1 > time2) {
			System.out.println((time1-time2));
		}else System.out.println(time2-time1);
	}
}
