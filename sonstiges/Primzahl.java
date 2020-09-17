import java.util.Scanner;
public class Primzahl {
public static boolean prim = true; 
public static void main(String[] args) { 
	  Scanner input = new Scanner(System.in);
	  System.out.println("n Eingeben : ");
	  long x = input.nextLong();
	  primzahlTest(x);
	  System.out.println(x+" ist " +(prim==true ? "eine Primzahl!" : "keine Primzahl!")); 
	  input.close(); } 
	  
	  public static void primzahlTest(long x){ 
		  for(long i = 2; i < x; ++i){ 
			  if(x % i == 0){ 
				  prim = false; 
				  System.out.println("Teiler: "+i); 
				} 
			} 
		} 
	}