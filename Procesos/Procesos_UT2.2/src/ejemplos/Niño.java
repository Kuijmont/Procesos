package ejemplos;

import java.util.concurrent.Semaphore;

public class Niño implements Runnable {
	private int galletas;
	private Semaphore sem;
	public void run () {
		while(true) //Los niños son pachones y siempre estarán comiendo galletas
			Wait(mutex) /*Aquí evitamos que dos procesos comprueben el número de
						galletas a la vez, ya que podría darse una falsa lectura*/
		if(galletas==0){ //Si no hay galletas...
			Signal(NohayGalletas) //Desbloquea a la madre para que rellene
			Wait(HayGalletas) //Espera a que la madre rellene para continuar
			galletas-; //coge galleta
		}else{
			galletas--; //una galleta menos
		}
		signal(mutex)
	}
}
