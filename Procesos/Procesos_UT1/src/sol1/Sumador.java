package sol1;

public class Sumador {

	// Importante que el jar sea Runnable y como lanzador esta clase
	public static void main(String[] args) {
		int resultado = sumar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println(resultado);
	}

	/**
	 * Metodo sumar. En este metodo sumamos los numeros desde el numero inicial
	 * hasta el numero final ambos incluidos.
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	private static int sumar(int n1, int n2) {
		int resultado = 0;
		for (int i = n1; i <= n2; i++) {
			resultado += i;
		}
		return resultado;
	}

}
