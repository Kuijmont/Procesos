package ej1;

public class DentroFuera {
	public static void main(String[] args) {
		//new HiloFor().start();
		HiloFor hilo = new HiloFor();
		hilo.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Estoy fuera del hilo");
		}
	}
}
