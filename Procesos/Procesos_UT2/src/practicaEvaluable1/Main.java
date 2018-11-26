package practicaEvaluable1;

public class Main {

	public static void main(String[] args) {
		
		//Tiempo inicial
		long initialTime = System.currentTimeMillis();
		
		//Creamos los clientes, pasando como parámetros el nombre del cliente y el array de la lista de la compra.
		//En el que el número hace referencia al tiempo que dura en procesar el producto de la posición de la lista.
		Cliente cliente1 = new Cliente("cliente 1",new int [] {2, 2, 1, 2});
		Cliente cliente2 = new Cliente("cliente 2",new int [] {1, 3, 1, 1, 1, 1});
		Cliente cliente3 = new Cliente("cliente 3",new int [] {1, 1, 1});
		Cliente cliente4 = new Cliente("cliente 4",new int [] {2, 5});
		
		//Creamos las cajas, pasando como parámetros el nombre de las cajas, el cliente que hace la compra y el tiempo inicial del proceso.
		Caja caja1 = new Caja("caja 1",cliente1,initialTime);
		Caja caja2 = new Caja("caja 2",cliente2,initialTime);
		Caja caja3 = new Caja("caja 3",cliente3,initialTime);
		Caja caja4 = new Caja("caja 4",cliente4,initialTime);
		
		//Método start()
		caja1.start();
		caja2.start();
		caja3.start();
		caja4.start();
		}
}
