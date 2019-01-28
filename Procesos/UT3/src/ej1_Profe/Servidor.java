package ej1_Profe;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		int nPuerto = 5000; // puerto local
		ServerSocket servidor = null;
		Socket clienteConectado = null;
		servidor = new ServerSocket(nPuerto); // throws IOException

		while (true) {
			System.out.println("Esperando al cliente....");
			clienteConectado = servidor.accept(); // throws IOException

			// creamos flujo de entrada del cliente
			InputStream entrada = null;
			entrada = clienteConectado.getInputStream();// IOException
			DataInputStream flujoEntrada = new DataInputStream(entrada);

			BufferedReader br = new BufferedReader (new InputStreamReader (flujoEntrada));

			String entrada2 = br.readLine();

			// el cliente envía un mensaje
			//System.out.println("Recibiendo: "+flujoEntrada.readUTF()); // IOException
			System.out.println("Recibiendo: "+entrada2);

			// creamos flujo de salida al cliente
			//OutputStream salida = null;
			//salida = clienteConectado.getOutputStream(); // IOException
			//DataOutputStream flujoSalida = new DataOutputStream(salida);
			
			// envío datos al cliente
			//flujoSalida.writeUTF("Recibido, gracias!!!"); // IOExcep.
			
			// cerramos streams y sockets
			entrada.close(); // throws IOException
			flujoEntrada.close(); // throws IOException
			//salida.close(); // throws IOException
			//flujoSalida.close(); // throws IOException
		}

		
		//clienteConectado.close();// throws IOException
		//servidor.close(); // throws IOException
	}

}
