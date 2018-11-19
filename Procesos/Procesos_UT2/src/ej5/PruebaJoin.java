package ej5;

public class PruebaJoin {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			HiloJoin hilo = new HiloJoin(i);
			hilo.start();
			try {
				hilo.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
