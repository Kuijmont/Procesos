package ej3_3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Servidor {

	public static void main(String[] args) {

		try {
			
			int puerto = 4567; // puerto local
			byte[] bufer = new byte[1024]; // buffer para recibir eldatagrama
			

			while(true){
				
				DatagramSocket socketUDP = new DatagramSocket(puerto);
				
				// throws SocketException
				System.out.println("Esperando cliente....");
				// recibo el datagrama
				DatagramPacket recibido = new DatagramPacket(bufer, bufer.length);
				// throws IOException
				socketUDP.receive(recibido);
				String info = new String(recibido.getData());
				// visualizo informacion
				//System.out.println("Numero de bytes recibidos:"+ recibido.getLength());
				System.out.println("Recibiendo: " + info);
				//System.out.println("Puerto de origen: " + recibido.getPort());
				// cierro el socket
				socketUDP.close();
			}
			

		} catch (SocketException e) {
			System.out.println("Socket: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO: " + e.getMessage());
		}

	}// main
}
