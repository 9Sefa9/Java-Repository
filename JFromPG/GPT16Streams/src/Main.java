import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		/*System.out.println("wie groﬂ soll das array sein");
		
		int b;
		for(int i=0;i<a.length;i++){
			System.out.println("n‰chste zahl eingeben");
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}*/
		int[] a = {1,5,9};
		schreibeStream("", a);
		leseStream();
		//bufferedWriting("C:\\Users\\Eloy\\Documents\\Uni Due\\16SS\\Internet&Webengineering\\meineDatei.gpt");
		readB();
		
		File f = new File("C:\\Users\\Eloy\\Java\\workspace\\GPT16Streams\\meinOrdner\\test.gpt");
		f.mkdirs();
		try {
			boolean erstellt = f.createNewFile();
			f.delete();
			f.createNewFile();
			System.out.println(erstellt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fertig");
		
		
		
	}
	
	public static void schreibeStream(String dateiName, int[]a){
		String s="Ich freue mich sehr auf die Klausur!";
		try{
			FileOutputStream fos = new FileOutputStream("meineDatei.gpt");
			for(int i=0;i<a.length;i++){
				fos.write(s.getBytes());
			}
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void leseStream(){
		try(FileInputStream fin = new FileInputStream("meineDatei.gpt")){
			
			while(fin.available()>0){
				System.out.println("Aus datei gelesen: "+(char)fin.read());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void bufferedWriting(String dateiName){
		String s="Ich freue mich sehr auf die Klausur!";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(dateiName))){
			bw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readB(){
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Eloy\\Documents\\Uni Due\\16SS\\Internet&Webengineering\\meineDatei.gpt"))){
			String s;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	
}
