package entidad;

public class Memoria{
	
	private String memoria;
	
	public Memoria(String memoria) {
		this.memoria = memoria;
	}

	public String llenarMemoria() {
		return memoria;
	}

	public String vaciarMemoria() {
		return "";
	}
	
}
