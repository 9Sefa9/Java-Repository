import java.net.*;
public class Client{
	public static void main(String[] args){
		try{
		String ip = Inet4Address.getByName("rudralovesparo.ddns.net").getCanonicalHostName();
		InetSocketAddress isa = new InetSocketAddress(ip,22);

		Socket client = new Socket();
		client.connect(isa);
		
		}catch(Exception i){
			i.printStackTrace();
		}
	
	}
}