package ej3;

/*
 * 	Crea dos nuevos hilos llamados HiloTic e HiloTac. El primero debe visualizar en pantalla un bucle
	infinito con la plabra “TIC”, y el segundo con la palabra “TAC”. Crea la clase HiloReloj, que en su
	método main cree e inicie los hilos anteriores.
	Introduce después de la sentecia de escritura de cada hilo un retardo de 1 segundo. Utiliza el
	método sleep(long mils), donde se indica el tiempo en milisegundos. Este método arroja
	excepciones InterruptedException, por lo que debes añadir un bloque try-cath para capturarla.

 */
public class HiloTic extends Thread{

	@Override
	public void run() {
		for (;;) {
			System.out.println("TIC");
			try {
				HiloTic.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
