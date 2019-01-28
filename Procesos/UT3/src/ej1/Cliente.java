package ej1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) {
		try {

			Socket yo = null; // Socket para comunicarse con el servidor

			PrintWriter alServidor; // Para poder mandar el string leido al servidor
									// con el método println()
			BufferedReader delTeclado; // Para leer del teclado con el método readLine()

			DataInputStream delServidor; // Para poder leer con readInt() el entero que
											// manda el servidor
			String tecleado; // Almacena el string leido del teclado

			yo = new Socket("172.30.106.73", 5000);
			delTeclado = new BufferedReader(new InputStreamReader(System.in));
			alServidor = new PrintWriter(yo.getOutputStream(), true);
			delServidor = new DataInputStream(yo.getInputStream());
			do {
				System.out.print("Introduce cadena: ");
				tecleado = delTeclado.readLine();
				alServidor.println(tecleado);
				System.out.println(">> ECO: " + delServidor.readInt());
			} while (tecleado.length() != 0);

			delServidor.close();
			delTeclado.close();
			alServidor.close();
			yo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
