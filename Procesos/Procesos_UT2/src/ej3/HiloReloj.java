package ej3;

public class HiloReloj {

	public static void main(String[] args) {
		
		HiloTic hiloA = new HiloTic();
		hiloA.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HiloTac hiloB = new HiloTac();
		hiloB.start();
		
	}

}
