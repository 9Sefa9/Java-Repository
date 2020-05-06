package Tests;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	private String userName;
	private int port;
	private String serverAddress;
	boolean status;
	Socket socket;
	BufferedWriter bw = null;
	Scanner eingabe = null;

	public Client(String user, int port, String serverAddress) {
		this.userName = user;
		this.port = port;
		this.serverAddress = serverAddress;
	}

	public static void main(String[] args) throws IOException {

		Scanner eingabe = new Scanner(System.in);
		System.out.println("<----------Initialization----------->");

		System.out.print("Address::> ");
		String serverAddress = eingabe.nextLine();

		System.out.print("Name::>  ");
		String userName = eingabe.nextLine();

		System.out.print("Port::> ");
		int port = eingabe.nextInt();

		// Starte Client mit neuen Daten
		Client client = new Client(userName, port, serverAddress);
		client.start();
	}

	public void start() throws IOException {
		socket = new Socket(serverAddress, port);
		String connection = "<<===Verbindung mit Server hergestellt===>>\n" + socket.getPort() + " "
				+ socket.getLocalAddress();
		System.out.println(connection);
		sendMessage();
	}

	public void sendMessage() throws IOException {
		bw = new BufferedWriter(new PrintWriter(socket.getOutputStream()));
		bw.write(userName);
		bw.flush();

		while (true) {
			try {
				eingabe = new Scanner(System.in);
				bw.write(":: " + eingabe.nextLine() + "\n");

			} finally {
				if (bw != null)
					bw.flush();
			}
		}
	}
}

/*
 * public void receive() { // empfangen try (BufferedReader br = new
 * BufferedReader(new InputStreamReader(socket.getInputStream()))) {
 * 
 * String msg = null; if ((msg = br.readLine()) != null)
 * System.out.println(msg);
 * 
 * } catch (IOException e) { System.out.println(
 * "Error while receiving from Server.: " + e); } }
 */
