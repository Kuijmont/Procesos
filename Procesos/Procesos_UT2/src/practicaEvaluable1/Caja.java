package practicaEvaluable1;

public class Caja extends Thread {
	
	private String nombre;
	
	private Cliente cliente;
	
	private long initialTime;
	
	public Caja(String nombre, Cliente cliente, long initialTime) {
		this.nombre=nombre;
		this.cliente=cliente;
		this.initialTime=initialTime;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		System.out.println("La "+nombre+ " comienza a procesar la compra "+cliente.getNombre()+ " en el tiempo: "+(System.currentTimeMillis()-initialTime)/1000+"seg");
		for (int i = 0; i < cliente.getLista().length; i++) {
			try {
				Thread.sleep(cliente.getLista()[i]*1000);//Lee el número de la lista de la compra*1000 y hacemos el sleep.
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Procesado del producto "+(i+1)+" del "+cliente.getNombre()+" ->Tiempo: "+(System.currentTimeMillis()-initialTime)/1000+"seg");
		}
		System.out.println("La "+ nombre+ " ha terminado de procesar "+ cliente.getNombre()+ " en el tiempo: "+(System.currentTimeMillis()-initialTime)/1000+"seg");
	}
	
}

