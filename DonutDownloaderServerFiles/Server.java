
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Server{
    private Socket client;
    private ServerSocket server;
    private InetAddress address;
    private int connectIndex=0;
    public final int SERVERID = 17;

    public static void main(String[] args) throws IOException {
        Server r = new Server();
        r.start();
    }
    public void start(){

        //192.168.178.75
        try{
            //address = InetAddress.getByName("localhost");
            server = new ServerSocket(3121/*,0,address*/);
            while(true) {
                client = server.accept();
                new Thread(new innerThreadClass(client,this.SERVERID)).start();
                connectIndex++;
                System.out.println("CONNECTED: "+connectIndex+" TIMES");
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
    public int SERVERID;
    Socket client;
    DataInputStream fileReaderLocal ;
    DataInputStream disClient;
    DataOutputStream dosClient;

    public innerThreadClass(Socket client, int SERVERID){
        this.client = client;
        this.SERVERID = SERVERID;
    }

    @Override
    public void run() {
        Path currentPath = Paths.get("");
        String currentLocation = currentPath.toAbsolutePath().toString();
        System.out.println("    READ NEW VERSION FROM::" + currentLocation);
        try {
            //Streams
            dosClient = new DataOutputStream(client.getOutputStream());
            disClient = new DataInputStream(client.getInputStream());
            FileInputStream f = new FileInputStream(currentLocation + "/DonutDownloader.jar");
            fileReaderLocal = new DataInputStream(f);

            //Client Data
            System.out.println("    InetAddress: "+client.getInetAddress());
            System.out.println("    Port: "+client.getLocalPort());
            System.out.println("    RemoteSocketAddress: "+client.getRemoteSocketAddress());

            //Process
            System.out.println("    SEND AND CHECK:: " + SERVERID+"\n\n");
            dosClient.writeInt(SERVERID);
            dosClient.flush();

            boolean isUpdateable = disClient.readBoolean();
            if(isUpdateable) {

                System.out.println("    MB-SIZE: " + f.getChannel().size()/(1024*1024));

                dosClient.writeLong(f.getChannel().size());
                dosClient.flush();
                byte[] buffer = new byte[(int) f.getChannel().size()+8192];
                int temp;
                System.out.println("    CONNECTION ESTABLISHED. SENDING DATA");

                while ((temp = fileReaderLocal.read(buffer)) != -1) {
                    dosClient.write(buffer, 0, temp);
                }
                System.out.println("    DONE!");
                System.out.println("====================================================\n\n");
            }else
            {System.out.println("NOTHING TO SEND!");
                System.out.println("====================================================\n\n");
            }
        }catch(EOFException e){
            System.out.println("EOFException");
        }catch (IOException i) {
            System.out.println("====================================================\n\n");
            System.out.println("    INPUT OUTPUT PROBLEM!");
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
                System.out.println("    CLOSE EXCEPTION");
                i.printStackTrace();
                System.out.println("\n\n====================================================\n\n");
            }
        }

    }
}
