package ejemploFTP;
import java.io.IOException;
import java.net.SocketException;
import java.lang.Object;
import org.apache.commons.net.ftp.*;

public class ClienteFTP {
	public static void main(String[] args) throws IOException, SocketException{
		FTPClient cliente = new FTPClient();
		String servidor = "localhost";
		System.out.println ("Conecto con el servidor: "+servidor);
		//conectamos cliente FTP al servidor FTP
		cliente.connect(servidor);
		//obtenemos la respuesta
		System.out.println (cliente.getReplyString());
		//código de respuesta
		int respuesta = cliente.getReplyCode();
		//comprobación del código
		if (!FTPReply.isPositiveCompletion(respuesta)) {
			System.out.println ("Conexion NO ESTABLECIDA: "+respuesta);
			cliente.disconnect();
		System.exit(0);
		}
		
		
		cliente.login("Prueba", "prueba");
		
		
		//aqui el resto del programa...
		cliente.disconnect();
		System.out.println ("Conexión FINALIZADA");
	}
}
