import java.io.*;
import java.lang.*;
public class FrageZurASCIITabelle{
	public static void main(String[] args){
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Sefa/Desktop/checksum.txt"))){
			int test = checksum();
			bw.write(""+test);
			
		}catch(IOException i){
			System.err.println("Fehler!");
		}
	}
	public static int checksum(){
		String S = "Ha2Kb8";
		int f=0,g=0,sum=0;
		for(int i = 0; i<=S.length()-1; i++){
			char c = S.charAt(i);
			
			if(('a'<= c && c<='z') || ('A' <= c && c<='Z')){
				f += (int)c; 
			}else{
			    g += Integer.parseInt(""+c); 
			}
			sum = f+g;

		}
		return sum;
	}
}