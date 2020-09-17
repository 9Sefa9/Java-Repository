import java.io.*;
import java.lang.*;
import java.util.*;
public class kannichohneide{
	
public static void main(String[] args){
		

	methode("G:/Users/Progamer/Desktop/j/test.txt","G:/Users/Progamer/Desktop/j/test2.txt");
}
public static void methode(String data1, String data2){


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