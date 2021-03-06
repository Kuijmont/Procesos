package sol2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Escribe una clase llamada Ejecuta que reciba como argumentos el comando y las
 * opciones del comando que se quiere ejecutar. El programa debe crear un
 * proceso hijo que ejecute el comando con las opciones correspondientes
 * mostrando un mensaje de error en el caso de que no se realizase correctamente
 * la ejecución. El padre debe esperar a que el hijo termine de informar si se
 * produjo alguna anomalía en la ejecución del hijo.
 * 
 * @author alumno
 * @version 24/10/2018
 */

public class Ejecuta {

	public static void main(String[] args) {
		if (args.length <= 0) {
			System.err.println("Necesita introducir un argumento como programa.");
			System.exit(0);
		}
		try {
			Process process = new ProcessBuilder(args).start();
			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Proceso hijo ejecutado " + Arrays.toString(args) + ":");
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			int exitValue = process.waitFor();
			if (exitValue == 0) {
				System.out.println("La ejecución ha sido correcta");
			} else {
				System.err.println("Error en la ejecución del argumento");
			}
		} catch (IOException e1) {
			System.err.print("Excepción de E/S!!");
			System.exit(0);
		} catch (InterruptedException e) {
			System.err.println("El proceso hijo finalizó de forma incorrecta");
			System.exit(0);
		}
	}

}
