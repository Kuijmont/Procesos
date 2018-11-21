package practica1;

import java.util.GregorianCalendar;

public class Caja {
	private static int[] cliente1 = { 1, 3 };
	private static int[] cliente2 = { 2, 2, 1, 2 };
	private static int[] cliente3 = { 1, 3, 1, 1, 1, 1 };
	private static int[] cliente4 = { 1, 1, 1 };
	private static int[] cliente5 = { 2, 5 };

	public static void main(String[] args) {
		long tinicial = System.currentTimeMillis();
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println("Tiempo inicial: "+);
//		for (int i = 1; i < 4; i++) {
//			new Cliente(cliente+i,i).start();
//		}
		Cliente c = new Cliente(cliente1, 1);

		c.start();

		try {
			c.join();

		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		Cliente c2 = new Cliente(cliente2, 2);
		c2.start();
		try {
			c2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cliente c3 = new Cliente(cliente3, 3);
		c3.start();
		try {
			c3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}Cliente c4 = new Cliente(cliente4, 4);
		c4.start();
		try {
			c4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Cliente c5 = new Cliente(cliente5, 5);

		c5.start();
		try {
			c5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Tiempo final: " + (System.currentTimeMillis() - tinicial) / 1000);
		System.out.println("Todos los hilos creados.");
	}

}
