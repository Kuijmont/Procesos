package ej2;

public class VariosHilos {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			new HiloC(i).start();
		}
		System.out.println("Todos los hilos creados.");
	}
}
