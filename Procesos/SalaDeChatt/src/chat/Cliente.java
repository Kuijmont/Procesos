package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		try {
			//Creamos el cliente.
			String host = "localhost";
			int puerto = 5000;
			Socket cliente = new Socket(host, puerto);
			System.out.println("Cliente activo.");
			//Creamos un objeto Scanner para recibir datos por teclado.
			Scanner sc = new Scanner(System.in);
			//Definimos los dos objetos que van a servir para el envío y recibo de mensajes entre clientes.
			PrintWriter pw = new PrintWriter(cliente.getOutputStream(), true);
			BufferedReader br = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			//Se registra el cliente.
			System.out.print("Nombre de usuario: ");
			String nombre = sc.nextLine();
			pw.println(nombre);
			/*
			 * Comienza la interacción en el chat:
			 * -Recibimos mensaje de bienvenida.
			 * -Leemos los mensajes que vayan escribiendo el resto de usuarios/clientes.
			 * -Si no hay interacción podremos escribir.
			 */
			String mensaje;//Variable para recibir mensajes del chat.
			//Recibimos mensaje de bienvenida.
			mensaje= br.readLine();
			System.out.println(mensaje);
			//Bucle infinito que corresponde a las interacciones con el chat.
			while(true) {//Se leen los mensajes del chat.
				do { 
					while (!br.ready()) {
				          Thread.sleep(200);
				     }
				     mensaje = br.readLine();
				     System.out.println(mensaje);
				}while (("").equals(mensaje));//Si no hay actividad, podemos escribir.
				System.out.println("Mensaje:");
				pw.println(sc.nextLine());
			}
		} catch (IOException | InterruptedException e) {//Si ocurre algún error, lo visualizamos por pantalla.
			System.out.println("Ha ocurrido un error: "+e.getMessage());
		}
	}

}
