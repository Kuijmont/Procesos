package EjemploSocketDatagram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();//Crea el socket
            String mensaje = "Un datagrama";//Crea el mensaje
            InetAddress addr = InetAddress.getByName("localhost");//Crea la InetAddress
            DatagramPacket datagrama = new DatagramPacket(
                    mensaje.getBytes(),
                    mensaje.getBytes().length,
                    addr, 
                    5555);//Crea el datagrama
            ds.send(datagrama);//Envía el datagrama a través del socket
            ds.close();//Cierra la conexión
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
