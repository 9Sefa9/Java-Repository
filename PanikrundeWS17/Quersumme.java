public class Quersumme{
	public static void main(String[] args){
		int zahl = Integer.parseInt(args[0]);
		int quersum = berechneQuersummeIterativ(zahl);
		System.out.println("Die iterativ: "+quersum);
		int quersum2 = berechneQuersummeRekursiv(zahl);
		System.out.println("Die rekursive: "+quersum2);
	}
	public static int berechneQuersummeIterativ(int zahl){
			String str = ""+zahl;
			int b =0;
			for(int i = 0; i<=str.length()-1;i++){
				char a = str.charAt(i);			
				b+=(Integer.parseInt(""+a));				
			}
			return b;
	}
	public static int berechneQuersummeRekursiv(int zahl){
		String z = ""+zahl;
		if(z.length()== 1){
			return Integer.parseInt(z);
		}else{
			return Integer.parseInt(z.charAt(0)+"")+berechneQuersummeRekursiv(Integer.parseInt(z.substring(1)));
		}
	}
}
