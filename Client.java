import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    Socket client;
    public static void main(String[] args) throws IOException {
            Client c = new Client();
            c.client = new Socket("rudralovesparo.ddns.net",25);
        try(DataOutputStream dos = new DataOutputStream(c.client.getOutputStream())){
            dos.writeUTF("HIII");
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}