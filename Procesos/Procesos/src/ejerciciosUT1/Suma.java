package ejerciciosUT1;

public class Suma {

	public static void main(String[] args) {
		
		int res =sumar(Integer.valueOf(args[0]),Integer.valueOf(args[1]));
		
		System.out.println(res);
		
	}

	private static int sumar(int a, int b) {
		int suma = 0;
		for (int i = a; i <= b; i++) {
			suma=suma+i;
		}
		return suma;
	}	
}

