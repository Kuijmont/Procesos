package ej7;
/*
 * Crear un programa que lance 10 hilos de ejecución donde a cada hilo se le pasará la base y la
 * altura de un triángulo, y cada hilo ejecutará el cálculo del área de dicho triángulo informando de
 * qué base y qué altura recibió y cuál es el área resultado.
 */
public class HiloDatos extends Thread{
	double a,b;

	public HiloDatos(double a, double b) {
		super();
		this.a = a;
		this.b = b;

	}
	@Override
	public void run() {
		
			System.out.println("Área "+(int)a+" :"+ b*a/2);
		
	}
}
