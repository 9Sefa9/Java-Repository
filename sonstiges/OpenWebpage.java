import java.io.*;
import java.net.*;
import java.awt.Desktop;
public class OpenWebpage{
  public static void main(String[] args){
    try{
      URI uri = new URI("http://www.google.com");
      Desktop.getDesktop().browse(uri);
    }catch(IOException i){
      i.printStackTrace();
    }catch(URISyntaxException u){
      u.printStackTrace();
    }

  }
}
