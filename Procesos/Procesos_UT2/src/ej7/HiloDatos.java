package ej7;
/*
 * Crear un programa que lance 10 hilos de ejecuci�n donde a cada hilo se le pasar� la base y la
 * altura de un tri�ngulo, y cada hilo ejecutar� el c�lculo del �rea de dicho tri�ngulo informando de
 * qu� base y qu� altura recibi� y cu�l es el �rea resultado.
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
		
			System.out.println("�rea "+(int)a+" :"+ b*a/2);
		
	}
}
