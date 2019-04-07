package Uebung_1;

public class Quersumme {
	
	//Main
	public static void main(String[] args) {		
		int zahl = 12345;	
		int quersumme1 = berechneQuersummeIterativ(zahl);
		System.out.println("Die iterativ-berechnete Quersumme ist: " + quersumme1);
		int quersumme2 = berechneQuersummeRekursiv(zahl);
		System.out.println("Die rekursiv-berechnete Quersumme ist: " + quersumme2);
		int quersumme3 = berechneQuersummeRekursivMitModulo(zahl);
		System.out.println("Die rekursiv mit Modulo berechnete Quersumme ist: " + quersumme3);
	}

	//Rekursiv mit String
	private static int berechneQuersummeRekursiv(int a) {
		String number=a+"";	
		
		if(number.length()==1){
			return Integer.parseInt(number);
		}
		else{
			return Integer.parseInt(number.charAt(0)+"")+berechneQuersummeRekursiv(Integer.parseInt(number.substring(1)));
		}
	}

	//Iterativ mit String
	private static int berechneQuersummeIterativ(int a) {
		String number=a+"";	
		int  crosssum=0;	
		for(int i=0;i<number.length();i++){
			crosssum+=Integer.parseInt(number.charAt(i)+"");
		}
		return crosssum;
	}
	
	//Rekursiv mit Modulo
	private static int berechneQuersummeRekursivMitModulo(int a) {
		if((a/10)==0){
			return a;
		}
		else{
			return (a%10) + berechneQuersummeRekursivMitModulo(a/10);
		}
	}
}
