package backup;
import java.io.*;

public class Backup {
public static void main(String[] args) {
		
		String s="Ich freue mich riesig auf die Klausur!";
		streamen(s);
		bufferedStr(s);
		System.out.println("done");
		System.out.println(lesenVonBytes());
		
	}
	
	
	
	public static void streamen(String s){
		
		try(FileOutputStream fis = new FileOutputStream("mydata.gpt")){
			fis.write(s.getBytes());
		}catch(IOException e){
			
		}
	}
	
	public static String lesenVonBytes() {
		String in="";
		StringBuilder sB = new StringBuilder();
		
		try(FileInputStream fin = new FileInputStream("mydata.gpt")){
			while(fin.available()>0){
				//sB.append((char)fin.read());
				System.out.print((char)fin.read());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return in=sB.toString();
	}
	
	public static void bufferedStr(String s){
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("buefferedeData.gpt"))){
			bw.write(s);
		}catch(Exception e){
			
		}
	}
	
	public static void lesenBR(String dataName){
		try(BufferedReader br = new BufferedReader(new FileReader(dataName))){
			System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
