package ej3_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class Ejer3B {
	public static void main(String[] args) {
		try {
			// Creando socket servidor
			ServerSocket serverSocket = new ServerSocket();
			// Realizando el bind
			InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
			serverSocket.bind(addr);
			// Aceptando conexiones
			Socket newSocket = serverSocket.accept();
			System.out.println("Conexión recibida");
			InputStream is = newSocket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			// Cerrando el nuevo socket
			newSocket.close();
			//Cerrando el socket servidor
			serverSocket.close();
			// Terminado
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}