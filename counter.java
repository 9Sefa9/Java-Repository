import java.util.Scanner;
public class counter{
	
	public static int counter;
	
	
	public static void main(String[] args){
		
		String[] str = {"E","E","E","E","F","A"};
		System.out.println(analysiere(str));
		System.out.println(counter);
		
		
	}
	public static String analysiere(String[] str){
		
		String leer = "";
		String inhalt = "";
		for(int i=0; i<str.length; ++i){
		    for(int j=i+1; j<str.length; ++j){
			
				if((str[i]) == (str[j])){
					// probleme bei 4 E´s und höher..
					leer += str[i];
					inhalt = str[i];
					// counter gibt komischerweise 6 aus.
					counter = leer.length();
					
				}		
			}
		}
	return inhalt;
	} 
}