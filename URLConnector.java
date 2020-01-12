import java.net.*;
import java.io.*;
public class URLConnector{ 
public static void main(String[] args){
    while(true){
    try{
   URL myURL = new URL("https://www.fupa.net/spieler/abdul-rahim-goevercin-1417229.html");
    URLConnection myURLConnection = myURL.openConnection();
    myURLConnection.connect();
    System.out.println("Connected. Next->");
    Thread.sleep(300000);
    }
    catch (IOException e) {   
        e.printStackTrace();
    }catch(InterruptedException s){
        s.printStackTrace();
    }
    }


}
}