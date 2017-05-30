package diverseTest;

import java.util.Scanner;
import java.io.*;

public class stream2 extends stream {

	public void start() {

			Scanner eingabe = new Scanner(System.in);

			System.out.println("\t\t\tTerminal-Build v0.1");
			System.out.print(" ~*;> ");
			userinput = eingabe.nextLine();

			// SWITCH CASE EINBAUEN um cd und ls einzubauen
				listDirectoryOf(userinput);
			lookUpThis(userinput);
				
			
	}

	public void listDirectoryOf(String pfad) {
		File f = new File(pfad);
		if (f.isDirectory()) {
			// .listFiles gibt alle files +path zurück. Während .list() nur die
			// files ausgibt(nicht den path)

			File[] test = f.listFiles();
			for (int i = 0; i < test.length; i++) {
				System.out.println(test[i].getPath());
			}
			for (int j = 0; j < 50; j++)
				System.out.print("=");

			System.out.println();

			start();
		} else
			listDirectoryOf(f.getParent());
	}

	public void lookUpThis(String pfad) {
		try (BufferedReader br = new BufferedReader(new FileReader(pfad))) {
			System.out.println(
					"\n========================================STARTE SEQUENZ========================================\n");

			String wort;
			while ((wort = br.readLine()) != null) {
				System.out.println(wort);
			}

		} catch (IOException e) {
			System.out.println("Pfad nicht gefunden");
		} finally {
			start();
		}
	}

}
