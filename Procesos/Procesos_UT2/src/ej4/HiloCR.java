package ej4;

/*	
 * 	Repite el ejercicio 2 utilizando Runnable, cambiando las clases HiloC y VariosHilos por HiloCR y
 *	VariosHilosR (R de Runnable).
*/

public class HiloCR implements Runnable{
	int c;
	Thread t;
	public HiloCR(int c) {
		super();
		this.c = c;
		t = new Thread(this, "Creando hilo "+ c);
		//System.out.println("Creando hilo "+ c);
		t.start();
	}

	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Hilo "+c+" línea "+i);
		}
	}
}

