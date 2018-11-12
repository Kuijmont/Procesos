package ej5;

/*	Recupera las clases HiloC y VariosHilos del ejercicio 2. Llámalas ahora HiloJoin y PruebaJoin.
	Utilizando el método join() realiza las modificaciones necesarias para que la ejecución sea:
		Creando Hilo 1
			Hilo 1 linea 1
			Hilo 1 linea 2
			Hilo 1 linea 3
			Hilo 1 linea 4
			Hilo 1 linea 5
		Creando Hilo 2
			Hilo 2 linea 1
			Hilo 2 linea 2
			…
			Hilo 5 linea 5
	Todos los hilos creados
*/

public class HiloJoin extends Thread{
	int c;

	public HiloJoin(int c) {
		super();
		this.c = c;
		System.out.println("Creando hilo "+ c);
	}
	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Hilo "+c+" línea "+i);
		}
	}
}

