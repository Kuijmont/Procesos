package EjemploSocketDatagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    public static void main(String[] args) {
        try {
            InetSocketAddress addr = new InetSocketAddress("localhost",5555);
            DatagramSocket ds = new DatagramSocket(addr);//Crea el socket
            int longitud = 12;//Longitud del mensaje
            byte[] mensaje = new byte[longitud];//Array de bytes donde almacenar el mensaje
            DatagramPacket datagrama = new DatagramPacket(mensaje, longitud);//Se crea el datagrama
            ds.receive(datagrama);//Se carga en el datagrama el mensaje recibido
            System.out.println("Mensaje recibido:" + new String(mensaje) + "*");
            ds.close();//Se cierra el socket
        } catch (SocketException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
