package ejemplos;

import java.util.concurrent.Semaphore;

public class TarroGalletas {
	public void main () {
		int n;
		int galletas=n;
		Semaphore NoHayGalletas = new Semaphore(0);//sem�foro NoHayGalletas -> 0
		Semaphore HayGalletas = new Semaphore(0);//sem�foro HayGalletas -> 0
		Semaphore sem = new Semaphore(1);//sem�foro mutex -> 1
		Ni�o ni�o = new Ni�o();
		Mama mama = new Mama();
		ni�o.CrearNi�os();
		mama.CrearMadre();
		ni�o.LanzarNi�os();
		mama.LanzarMadre();
	}

}
