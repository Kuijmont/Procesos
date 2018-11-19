package ej7;

import java.util.Random;

public class Areas {

	public static void main(String[] args) {
		Random r = new Random();
		r.nextInt();
		for (int i = 1; i < 11; i++) {
			new HiloDatos(i,r.nextInt(10)).start();
		}	
	}

}
