package ej3_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
public class Ejer3A {
	public static void main(String[] args) {
		try {
			// Creando socket cliente
			Socket clientSocket = new Socket();
			// Estableciendo la conexión
			InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
			clientSocket.connect(addr);
			OutputStream os = clientSocket.getOutputStream();
			// Abriendo el fichero
			BufferedReader br = new BufferedReader(new FileReader("fichero_prueba.txt"));
			// Enviando el contenido del fichero
			PrintWriter pw = new PrintWriter(os, true);
			while (br.ready()) {
				String line = br.readLine();
				pw.println(line);
			}
			// Cerrando el socket cliente
			clientSocket.close();
			// Terminado
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}