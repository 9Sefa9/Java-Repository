//the impoerts should be named..
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.lang.Exception;
import java.io.IOException;
import java.util.Scanner;
public class kannichohneide{
//making this onbject-oriented is better..	
public static void main(String[] args){
		
	kannichohneide k = new kannichohneide();
	k.methode("G:/Users/Progamer/Desktop/j/test.txt","G:/Users/Progamer/Desktop/j/test2.txt");
	
}
public void methode(String data1, String data2){


	try(BufferedReader br = new BufferedReader(new FileReader(data1));
		BufferedWriter bw = new BufferedWriter(new FileWriter(data2))){

		String leer = "";
		String nichtleer = "";

		while((leer = br.readLine())!= null){
			nichtleer +=leer;
		}
		
		for(int i = 0; i<=nichtleer.length()-1; i+=2){
			char c = nichtleer.charAt(i);
			bw.write(c);
		}

	}
	catch(IOException e ){
		e.printStackTrace();
	}


}



}