package ejemplos;

import java.util.concurrent.Semaphore;

public class TarroGalletas {
	public void main () {
		int n;
		int galletas=n;
		Semaphore NoHayGalletas = new Semaphore(0);//semáforo NoHayGalletas -> 0
		Semaphore HayGalletas = new Semaphore(0);//semáforo HayGalletas -> 0
		Semaphore sem = new Semaphore(1);//semáforo mutex -> 1
		Niño niño = new Niño();
		Mama mama = new Mama();
		niño.CrearNiños();
		mama.CrearMadre();
		niño.LanzarNiños();
		mama.LanzarMadre();
	}

}
