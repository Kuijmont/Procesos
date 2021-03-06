package sol3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 3. Escribe un programa Aleatorios que haga lo siguiente:
   Cree un proceso hijo que est� encargado de generar n�meros aleatorios. Para su
   creaci�n puede utilizarse cualquier lenguaje de programaci�n, generando el ejecutable
   correspondiente.
   Este proceso hijo escribir� en su salida est�ndar un n�mero aleatorio del 0 al 10 cada
   vez que reciba una petici�n de ejecuci�n por parte del padre. Nota: no es necesario
   utilizar JNI, solamente crear un ejecutable y llamar correctamente al mismo desde Java.
   El proceso padre lee l�neas de la entrada est�ndar y por cada l�nea que lea solicitar� al
   hijo que le env�e un n�mero aleatorio, lo leer� y lo imprimir� en pantalla.
   Cuando el proceso padre reciba la palabra �fin�, finalizar� la ejecuci�n del hijo y
   proceder� a finalizar su ejecuci�n.
   
 * @author Yehoshua
 *
 */
public class PadreAleatorios {

	public static void main(String[] args) {
		try {
			String entrada="";
			while (entrada!=null) {
				Process process = new ProcessBuilder(args).start();
				InputStream is = process.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				String line;
				line = br.readLine();
				System.out.println("Numero Aleatorio: "+line);	
				br.close();
				System.out.print("Introduzca Enter para generar otro\no FIN para terminar: ");
				entrada=Entrada.cadena().toLowerCase().trim();
				if (entrada.equals("fin")) {
					entrada=null;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
