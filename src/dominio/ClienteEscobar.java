package dominio;

public class ClienteEscobar implements Cliente{

	private String nombre;
	private Domicilio domicilio;
	
	// Constructores
	
	public ClienteEscobar() {
		this.nombre = "nombre";
		this.domicilio = new Domicilio();
	}
	public ClienteEscobar(String nombre, Domicilio domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	// Metodos
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " " + domicilio.toString() + ".";
	}
	
	// Getters y Setters
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected Domicilio getDomicilio() {
		return domicilio;
	}
	protected void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
}
