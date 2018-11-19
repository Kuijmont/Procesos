package ej6;
/*
 * Implemente un programa en java que use hilos independientes. Un hilo imprime números pares
 * del 1 al 10, y otro hilo imprime números impares del 1 al 10. Cree dos instancias (hilos) de cada
 * uno y muestre la salida. Realice el programa utilizando herencia y otro con la interfaz.
 */

public class HiloPar extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			if(i%2==0)
				System.out.println("Par: "+i);
		}
	}
}
