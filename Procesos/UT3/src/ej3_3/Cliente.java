package ej3_3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String entrada="";

		try {
			
			int puerto = 4567; // puerto del servidor
			
			byte[] mensaje = new byte[1024];
			
			while(true){
				
				InetAddress destino = InetAddress.getByName("localhost");
				// throws UnknownHostException
			
				System.out.println("Introduzca mensaje:");
				
				//CUIDADO CON sc.next(); SOLO NOS ENVIARÃ�A HASTA EL PRIMER ESPACIO!!
				//entrada=sc.next();
				
				entrada=sc.nextLine();
				mensaje = entrada.getBytes(); // codifico string a bytes
				
				// construyo el datagrama a enviar
				DatagramPacket enviado = new DatagramPacket(mensaje,
						mensaje.length, destino, puerto);
				// creo el socket
				DatagramSocket socketUDP = new DatagramSocket();
				// throws SocketException
				// envio datagrama
				socketUDP.send(enviado);
				
				// visualizo informacion
				//System.out.println("Longitud del datagrama: " + enviado.getLength());
				//System.out.println("Host destino: " + destino.getHostName());
				//System.out.println("Puerto local: " + socketUDP.getLocalPort());
				//System.out.println("Puerto destino: " + enviado.getPort());
				
				// cierro socket
				
				socketUDP.close(); // throws IOException
			}
			
			


		} catch (SocketException e) {
			System.out.println("Socket:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO:" + e.getMessage());
		}
	}// main
}
