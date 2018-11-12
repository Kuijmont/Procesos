package ej1;

/* 	Crea un nuevo proyecto en Eclipse. Crea una clase llamada HiloFor, que herede de thread, y en
	su método run() imprima 10 veces el mensaje “Estoy dentro del hilo”. Crea la clase DentroFuera
	que cree un objeto HiloFor, lo lance con start() y después imprima 10 veces el mensaje “Estoy
	fuera del hilo”. Ejecuta y analiza el resultado, ¿es el que esperabas? 
*/

class HiloFor extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Estoy dentro del hilo");
		}
	}
}

