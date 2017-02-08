import java.util.*;
import java.lang.*;
import java.io.*;

public class generalisierung<datatype>{

	private datatype data;

	public void setText(datatype txt){
		this.data = txt;
	}
	public datatype getText(){
		return this.data;
	}
	// wie funktionieren methoden mit generics ?
	public void writeToFile(datatype location, datatype msg){
		try(BufferedWriter bw = new BufferedWriter(new FileWriter((String)location))){
			bw.write((String)msg);
		}catch(IOException i){
			i.printStackTrace();
		}
		System.out.print("writeToFile method was succesfully created");
	}
	public void readFromFile(datatype location){
		try(BufferedReader br = new BufferedReader(new FileReader((String)location))){
			String leer = "";
			while((leer = br.readLine())!= null){
				System.out.println(leer);
			}
		}catch(IOException i){
			i.printStackTrace();
		}
		System.out.print("readFromFile was succesfully created");
	}

}
