package Tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Server {
	ArrayList<String> username;
	ArrayList<Object> user;
	private Socket clientsocket;
	private int port;
	private String userName;
	BufferedReader br = null;
	String msg;

	public Server(int port) {
		this.port = port;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("<<<Server Initialization>>>");
		int port = 5555;

		Server server = new Server(port);
		server.start();
	}

	public void start() throws Exception {
		ServerSocket serversocket = new ServerSocket(port);
		System.out.println("<<-----Searching for Clients----->>");
		clientsocket = serversocket.accept();
		System.out.println("----->>Listen to Clients<<-----");
		ClientThread client = new ClientThread();
		System.out.println("<.<.<.<A Client has Connected>.>.>.>");

		user = new ArrayList<Object>();
		username = new ArrayList<String>();

		user.add(client);
		username.add(userName);

		new ClientThread().start();
	}

	class ClientThread extends Thread {
		public void run() {
			try {
				br = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
				while ((msg = br.readLine()) != null)
					System.out.println(msg);

			} catch (IOException e) {
				System.out.println("Error while Receiving from Client.:  " + e);
			}
		}
	}
}
