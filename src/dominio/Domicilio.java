package dominio;

public class Domicilio {
	private String direccion;
	private String barrio;
	
	// Constructores
	public Domicilio() {
		direccion = "direccion";
		barrio = "barrio";
	}
	public Domicilio(String direccion, String barrio) {
		this.direccion = direccion;
		this.barrio = barrio;
	}
	
	// Metodos
	
	@Override
	public String toString() {
		return "Domicilio: " + direccion + ", Barrio: " + barrio;
	}
	
	// Getters y Setters
	
	protected String getDireccion() {
		return direccion;
	}
	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	protected String getBarrio() {
		return barrio;
	}
	protected void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
}
