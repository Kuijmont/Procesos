package ejemplos;

public class Mama implements Runnable {
	
	
	
	public void run () {
		//while(true) //La madre siempre estar� esperando para reponer el tarro
			/*Wait(NoHayGalletas) //Aqu� se bloquea porque el sem�foro "NoHayGalletas" est� a 0
			Wait(mutex)
			galletas=n //Relleno el tarro de galletas
			Signal(mutex) //El sem�foro mutex impide que 2 procesos comprueben la variable "galletas" a la vez
			Signal(HayGalletas) //Aviso a los ni�os de que hay galletas poniendo a 1 el sem�foro "HayGalletas"
	*/}
}

