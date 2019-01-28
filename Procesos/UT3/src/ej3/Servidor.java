package ej3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Servidor {

	public static void main(String[] args) {
		try {
			InetSocketAddress addr = new InetSocketAddress("localhost",5000);
            DatagramSocket ds = new DatagramSocket(addr);//Crea el socket
            int longitud = 12;//Longitud del mensaje
            byte[] mensaje = new byte[longitud];//Array de bytes donde almacenar el mensaje
            DatagramPacket datagrama;
            do{
	            datagrama = new DatagramPacket(mensaje, longitud);//Se crea el datagrama
	            ds.receive(datagrama);//Se carga en el datagrama el mensaje recibido
	            System.out.println("Mensaje recibido:" + new String(mensaje));
            
            }while(new String(mensaje).length() != 0);
            ds.close();
		} catch (SocketException ex) {
            ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
