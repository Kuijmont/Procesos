package ej2;

/*	Continuamos ahora el ejercicio anterior creando varios hilos.
	Crea una nueva clase llamada HiloC, que herede de thread, que tenga un atributo entero int c.
	En el constructor, se le pasa el valor de c como parámetro, e imprime el mensaje “Creando hilo
	c”, donde c es valor pasado por parámetro.
	En su método run() imprimirá 5 veces el mensaje “Hilo c línea x”, donde x es el número de línea.
	Crea la clase VariosHilos que, en un bucle, cree y lance 5 objetos HiloC, pasando a cada uno los
	valores 1, 2, 3, 4 y 5 respectivamente. Antes de finalizar el main, imprimirá el mensaje “Todos
	los hilos creados”.
	Ejecuta varias veces. Comenta el resultado. ¿Es siempre el mismo? ¿Cuándo se imprime la
	sentencia “Todos los hilos creados”? ¿Por qué? ¿Cuántos hilos hay en ejecución?
*/

public class HiloC extends Thread{
	int c;

	public HiloC(int c) {
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

