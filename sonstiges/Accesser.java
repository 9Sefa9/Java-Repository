import java.lang.*;
import java.io.*;
import java.util.*;

public class Accesser{
	
	private String path1;
	public  static void main(String[] args){
		Scanner eingabe = new Scanner(System.in);
		Accesser a = new Accesser(eingabe.nextLine());
		a.checkDirectory();
	}
	public Accesser(String path1){
		this.path1 = path1;
	}
	public void checkDirectory(){
		File f;
		try{
			f = new File(path1);
			if(f.exists()){
				System.out.println(f.getAbsolutePath());
				System.out.println(f.getFreeSpace());
				System.out.println(f.getParent());
				System.out.println(f.getTotalSpace());			
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}