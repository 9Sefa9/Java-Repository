import java.util.Scanner;
public class ArrayScanner{
	public static void main(String[] args){
			String [] str = new String[4]; // 4 Elemente! 
			
			Scanner eingabe = new Scanner(System.in);
			
			for(int i=0; i<str.length; i++){
				str[i] = eingabe.nextLine();
			}
			
			for(String a:str){
				System.out.print(a);
			}
			eingabe.close();
	}

}