package Uebung_4;
import java.io.*;

public class Konsonantenschrift {

	public static void main(String[] args) {
		String input = "";
		//Achtung!!! Das hier ist für Windows.
		File file_in		= new File("ressources\\text1.txt");
		File file_out 	= new File("ressources\\text1_processed.txt");

		//einlesen
		try(BufferedReader br=new BufferedReader(new FileReader(file_in))){
			String line="";
			while((line=br.readLine()) !=null){
				input+=line;
			}
		}
		catch(Exception e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		//muss die Exception geworfen werden
		if(input.contains("NoProcessing!")){
			throw new ProcessingForbiddenException("Processing was forbidden at index " +  input.indexOf("NoProcessing!")+ "!");
		}
		
		//Formatierung
		String output=input.toLowerCase().replaceAll("[aeiouäöü]", "");
		
		//ausgabe
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(file_out))){
			bw.write(output);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}


class ProcessingForbiddenException extends RuntimeException{
	public ProcessingForbiddenException(String string) {
		super(string);
	}
}
