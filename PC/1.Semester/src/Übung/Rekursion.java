
package Übung;
import java.util.Scanner;
public class Rekursion {
	public static boolean wahrheit = false; //
	public static void main(String[] a){
	
		int[] s = {6, 9, 8, 3, 4, 7, 5};
		System.out.println(sum(s, 0));

	
	
	}
	public static int sum(int[] a, int b){
		if(b<a.length-1){  
			
			System.out.println(a.length);
			++b;
			a[0]+=a[b];   // bspiechert alles auf a[0];  a[0] ist ein integer ! 
			System.out.println(a[0]);
			wahrheit = false;
			System.out.println(wahrheit);
			return sum(a, b);
			
		}else if(a[0] == 42){
			wahrheit = true;
			System.out.println(wahrheit);
			return a[0]; // wir returnen den a aus dem obigen erstellten array!
		}
		return a[0];// am ende eine int ausgabe, da es sich um eine int rückgabewert handelt. 
					// a[0] hat alle informationen gespeichert.
	}
		

	
	
	

}
