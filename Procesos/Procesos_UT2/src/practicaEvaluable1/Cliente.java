package practicaEvaluable1;



public class Cliente{
	
	private String nombre;
	private int[] lista;

	public Cliente(){
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}

	public Cliente(String nombre, int[] lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}
	
}
