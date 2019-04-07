import java.net.*;
public class Server{
	public static void main(String[] args){
		try{

			ServerSocket server = new ServerSocket(22);
			server.accept();
			System.out.println("Connection...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}