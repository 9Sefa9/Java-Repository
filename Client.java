import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    Socket client;
    public static void main(String[] args) throws IOException {
            Client c = new Client();
            c.client = new Socket("192.168.178.75",80);
        try(DataOutputStream dos = new DataOutputStream(c.client.getOutputStream())){
            dos.writeUTF("HIII");
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}