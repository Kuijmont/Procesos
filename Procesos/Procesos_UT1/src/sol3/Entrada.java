package sol3;

import java.io.*;

public class Entrada {
	static String inicializar() {
		String buzon = "";
		InputStreamReader flujo = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
		try {
			buzon = teclado.readLine();
		} catch (Exception e) {
			System.out.append("Entrada incorrecta)");
		}
		return buzon;
	}

	public static int entero() {
		int valor = Integer.parseInt(inicializar());
		return valor;
	}

	public static double real() {
		double valor = Double.parseDouble(inicializar());
		return valor;
	}

	public static String cadena() {
		String valor = inicializar();
		return valor;
	}

	public static char caracter() {
		String valor = inicializar();
		return valor.charAt(0);
	}

	public static int enteroVal(String mensajeSolicitud, String mensajeError, int min, int max) {
		System.out.print(mensajeSolicitud);
		int numeroAValidar = Entrada.entero();
		if (numeroAValidar < min || numeroAValidar > max) {
			System.out.println(mensajeError);
		}else {
			System.out.println("Numero dentro del Rango");
		}
		return numeroAValidar;
	}
}
