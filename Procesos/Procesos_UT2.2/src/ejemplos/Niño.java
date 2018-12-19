package ejemplos;

import java.util.concurrent.Semaphore;

public class Ni�o implements Runnable {
	private int galletas;
	private Semaphore sem;
	public void run () {
		while(true) //Los ni�os son pachones y siempre estar�n comiendo galletas
			Wait(mutex) /*Aqu� evitamos que dos procesos comprueben el n�mero de
						galletas a la vez, ya que podr�a darse una falsa lectura*/
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
