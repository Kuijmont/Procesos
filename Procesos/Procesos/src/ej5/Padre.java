package ej5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

import Utilidades.Entrada;

public class Padre {
	public static void main(String[] args) {
		String comandoHijo1 = "java -jar I:\2DAM\Git\Procesos\Procesos\Procesos\src\aMayus.jar";
		System.out.println("Introduzca palabra");
		String palabra = Entrada.cadena();
		try {
			Process hijo = new ProcessBuilder(args).start();
			
			//El proceso padre le envia la palabra al hijo
			OutputStream os = hijo.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			pw.print(palabra);
			pw.close();
			
			//El proceso padre recoge la salida del proceso hijo
			InputStream is = hijo.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;
			System.out.println("Salida del proceso " + Arrays.toString(args) + ":");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
