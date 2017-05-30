package diverseTest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class buffering {

	public static void main(String[] args) {
		String input;
		Scanner eingabe = new Scanner(System.in);

		System.out.println("Willkommen ! Bitte wähle ein Pfad aus !");
		input = eingabe.nextLine();
		
		System.out.println("Du hast eingegeben :  "+ input +".");
		System.err.println("Vorgang gestartet !");
		Schreiber(input);
	}

		public static void Schreiber(String input){
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(input));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
				
				br.
				
			}catch(IOException e){
				e.printStackTrace();
			}

	}
}
