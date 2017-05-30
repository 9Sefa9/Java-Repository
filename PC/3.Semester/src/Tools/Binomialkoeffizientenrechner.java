package Tools;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class Binomialkoeffizientenrechner {

	public static void main(String[] args){
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Binomialkoeffizientenrechner v1.0");
		
		System.out.print("n = ");
		double n = eingabe.nextInt();
		
		System.out.print("k = ");
		double k = eingabe.nextInt();
		if(k == 0){
			System.out.println("Binomialkoeffizient =  "+1);
		}else if(k == n){
			System.out.println("Binomialkoeffizient = "+1);
		}else{
		System.out.println("Fakultät von n = "+Fakultaet(n));
		System.out.println("Fakultät von k = "+Fakultaet(k));
		System.out.println("Binomialkoeffizient =  "+(Fakultaet(n)/Fakultaet(n-k)*Fakultaet(k)));
		}
	}
	public static double Fakultaet(double x){
		if(x == 0){
			return 1;
		}else return x*Fakultaet(x-1);
	}
}
