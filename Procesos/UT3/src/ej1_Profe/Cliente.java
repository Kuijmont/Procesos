package ej1_Profe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws IOException {
		String host = "172.30.106.73";
		int nPuerto = 5000; // puerto remoto
		Socket cliente = null;

		Scanner sc = new Scanner(System.in);
		String entrada;
		int contador = 1;

		while (true) {
			System.out.println("Introduce cadena " + contador + ":");
			cliente = new Socket(host, nPuerto); // throws IOException &
													// UnkNownHostExcept
			// creamos flujo de salida al servidor
			DataOutputStream flujoSalida = new DataOutputStream(
					cliente.getOutputStream()); // throws IOException
			// el cliente envía un mensaje

			entrada = sc.next();

			//flujoSalida.writeUTF(entrada);
			
			PrintWriter printWriter = new PrintWriter (flujoSalida,true);
			//AQU�? USO EL TRUE PARA EVITAR USAR EL FLUSH, PERO ACTUA DE MANERA SIMILAR
		    printWriter.println (entrada);
		    
			
			// throws IOException
			// creamos flujo de entrada al servidor
				//DataInputStream flujoEntrada = new DataInputStream(cliente.getInputStream()); // throws IOException
			// envío datos del servidor
			//System.out.println("Recibiendo datos del SERVIDOR....");
			//System.out.println(flujoEntrada.readUTF()); // throws IOException
			
			// cerramos streams y sockets
				//flujoEntrada.close(); // throws IOException
			flujoSalida.close(); // throws IOException
			printWriter.close ();
			
			contador++;
		}

		
		//cliente.close(); // throws IOException
	}

}
