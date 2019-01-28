package ej3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		try {

			DatagramSocket ds = new DatagramSocket();//Crea el socket
			String mensaje; // Almacena el string leido del teclado
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.print("Introduce cadena: ");
				mensaje = sc.next();
				System.out.println(">> ECO: " + mensaje.getBytes().length);
				InetAddress addr = InetAddress.getByName("localhost");
            	DatagramPacket datagrama = new DatagramPacket(
                    mensaje.getBytes(),
                    mensaje.getBytes().length,
                    addr, 
                    5000);//Crea el datagrama
            	ds.send(datagrama);//Envía el datagrama a través del socket
			} while (mensaje.getBytes().length != 0);
            ds.close();//Cierra la conexión
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
