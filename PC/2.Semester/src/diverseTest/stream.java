package diverseTest;

//Terminal aufbau version 1

import java.util.Scanner;
import java.io.*;

public class stream {
	public String userinput;

	public static void main(String[] args) {
		stream2 terminal = new stream2();	
		try {
			terminal.start();
		} catch (NullPointerException e) {
			System.out.println("Datei nicht gefunden");
			terminal.start();
		}
	}
}
