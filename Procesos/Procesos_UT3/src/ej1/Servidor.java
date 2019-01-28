package ej1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		try {
			ServerSocket yo = null; // Socket para escuchar por peticiones de conexión
			Socket cliente = null; // Socket para comunicarse con el cliente, recibir
									// el string y mandar el entero
			BufferedReader entrada; // flujo para poder leer del socket un string,
									// con el método readline()
			DataOutputStream salida;// flujo para poder mandar un entero al cliente
									// con el método writeInt()
			String llego; // El string donde se almacenará el string
							// recibido del cliente

			yo = new ServerSocket(5000);
			cliente = yo.accept();

			entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			salida = new DataOutputStream(cliente.getOutputStream());

			do {
				llego = entrada.readLine();
				System.out.println("Recibiendo: " + llego);
				salida.writeInt(llego.length());
			} while (llego.length() != 0);

			entrada.close();
			cliente.close();
			yo.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
