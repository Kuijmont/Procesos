package sol1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Crear una clase Java que sea capaz de sumar todos los números comprendidos
 * entre dos valores incluyendo ambos valores. Para resolverlo crearemos una
 * clase Sumador que tenga un método que acepte dos números n1 y n2 y que
 * devuelva la suma de todo el intervalo. Además, incluiremos un método main que
 * ejecute la operación de suma tomando los números de la línea de comandos (es
 * decir, se pasan como argumentos al main). Una vez hecha la prueba de la clase
 * sumador, le quitamos el main, y crearemos una clase que sea capaz de lanzar
 * varios procesos.
 * 
 * @author alumno
 * @version 22/10/2018
 */
public class LanzadorSumador {

	public static void main(String[] args) throws IOException {
		Process process = new ProcessBuilder(args).start();
		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line;
		System.out.println("Salida del proceso " + Arrays.toString(args) + ":");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

}
