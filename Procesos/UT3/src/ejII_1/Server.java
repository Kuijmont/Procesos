package ejII_1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static final int PUERTO = 5000;

	public Server() {
		try {

			ServerSocket skServidor = new ServerSocket(PUERTO);
			System.out.println("Puerto: " + PUERTO);

			for (int numCli = 1; numCli < 5; numCli++) {
				Socket skCliente = skServidor.accept(); // Crea objeto
				System.out.println("Sirvo al cliente " + numCli);
				OutputStream aux = skCliente.getOutputStream();
				DataOutputStream flujo = new DataOutputStream(aux);
				flujo.writeUTF("");
				skCliente.close();
			}

			System.out.println("Demasiados clientes por hoy");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] arg) {
		new Server();
	}

}
