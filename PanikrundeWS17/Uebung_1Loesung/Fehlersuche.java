package Uebung_1;
import java.util.Scanner; //1. import

class Fehlersuche {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in); //2. System.in missing
		
		System.out.println("Please enter a number:");
		int a=scan.nextInt();
		boolean b=isPrime(a); //3. b->a
		if(b)System.out.println(a+ " is prime!"); // 4. ++ (just one + is needed)
		else{
			System.err.println(a + " is not prime!");
		} // 5. Bracket missing 
	}
	
	static public boolean isPrime(int z){ // 6. bool -> boolean
		for(int i=2;i<=Math.sqrt(z);i++){
			if(0==z%i){
				return false;
			}
		}
		return true; // 7. return value missing (true or false is not relevant)
	}
}
