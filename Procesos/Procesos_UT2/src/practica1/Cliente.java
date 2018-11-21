package practica1;

import ej3.HiloTic;

public class Cliente extends Thread{
	private int [] array;
	private int productos,tiempo,c;
	
	public Cliente(int[] cliente, int c) {
		super();
		this.productos = cliente.length;
		this.tiempo = cliente[0];
		for (int i = 0; i < cliente.length; i++) {
			this.tiempo = this.tiempo + cliente[i];
			
		}
		array = cliente.clone();
		System.out.println("Cliente "+ c);
	}
	
	@Override
	public void run() {
		long tinicial = System.currentTimeMillis();
		int total = 0;
		for (int i = 1; i < array.length+1; i++) {
			
			System.out.println("Producto: "+i+" | Tiempo: "+array[i-1]);
			total = total + array[i-1];
			try {
				HiloTic.sleep(array[i-1]*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Tiempo total: "+total);
	}
}
