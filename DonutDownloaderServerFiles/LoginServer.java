
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class LoginServer{
    private Socket client;
    private ServerSocket server;
    private InetAddress address;
    private int connectIndex=0;
    private Hashtable<String,String> data = new Hashtable<String, String>();
    public static void main(String[] args) throws IOException {
        LoginServer r = new LoginServer();
        r.Server();
    }
    public LoginServer(){
        data.put("9schurke9","diabolo31213");
        data.put("moddi","m2345");
        data.put("freddy","f3456");
        data.put("shizui","s1234");
        data.put("pandayapil","p3210");
	data.put("perez","p123");
    }
    public void Server(){

        //192.168.178.75
        try{
            //address = InetAddress.getByName("localhost");
            server = new ServerSocket(3122/*,0,address*/);
            while(true) {
                client = server.accept();
                new Thread(new innerThreadClass(client,data)).start();
                connectIndex++;
            }
        }catch(IOException i){
            System.out.println("====================================================\n\n");
            System.out.println("SERVER INITIALIZATION ERROR");
            i.printStackTrace();
            System.out.println("====================================================\n\n");
        }
    }
}
class innerThreadClass implements Runnable{
    Socket client;
    DataInputStream fileReaderLocal ;
    DataInputStream disClient;
    DataOutputStream dosClient;
    Hashtable<String, String> data;

    public innerThreadClass(Socket client, Hashtable<String,String> data){
        this.client = client;
        this.data = data;
    }

    @Override
    public void run() {
        try {
            //Streams
            dosClient = new DataOutputStream(client.getOutputStream());
            disClient = new DataInputStream(client.getInputStream());

            //Client Data
            System.out.println("	InetAddress: "+client.getInetAddress());
            System.out.println("	Port: "+client.getLocalPort());
            System.out.println("	RemoteSocketAddress: "+client.getRemoteSocketAddress());

            //Process
            String clientLogin = disClient.readUTF();
            String clientPasswort = disClient.readUTF();
            System.out.println("RECEIVED: "+clientLogin+", "+clientPasswort);
            Set<String> keys = data.keySet();
            for(String key : keys){
                if(clientLogin.equals(key)){
                    if(clientPasswort.equals(data.get(key))){
                    	System.out.println("SEND CONFIRMATION TO CLIENT...");
                        dosClient.writeBoolean(true);
                    	dosClient.flush();
                    	break;
                    } else {
                    	dosClient.writeBoolean(false);
                    	dosClient.flush();
                    	break;
                    }
                }
            }
            dosClient.writeBoolean(false);
            dosClient.flush();

        }catch(EOFException e){
        	
            System.out.println("DONE! ");
        }catch (IOException i) {
        	
            System.out.println("====================================================\n\n");
            System.out.println("	INPUT OUTPUT PROBLEM!");
            i.printStackTrace();
            System.out.println("\n\n====================================================\n\n");
        }finally {
            try {
                if (dosClient != null)
                    dosClient.close();

                if(disClient != null)
                    disClient.close();

                if(fileReaderLocal != null)
                    fileReaderLocal.close();

            } catch (Exception i) {
                System.out.println("====================================================\n\n");
                System.out.println("	CLOSE EXCEPTION");
                i.printStackTrace();
                System.out.println("\n\n====================================================\n\n");
            }
        }

    }
}
