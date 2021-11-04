package entidad;

public class ClienteTigre {
	private String nroCliente;
	private String nombre1;
	private String nombre2;
	private String domicilio;
	
//	Constructor
	public ClienteTigre(String nroCliente, String nombre1, String nombre2, String domicilio) {
		super();
		this.nroCliente = nroCliente;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.domicilio = domicilio;
	}
	
//	Getters y Setters
	public String getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(String nroCliente) {
		this.nroCliente = nroCliente;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Cliente zona Tigre [nroCliente=" + nroCliente + ", nombre1=" + nombre1 + ", nombre2=" + nombre2
				+ ", domicilio=" + domicilio + "]";
	}
}
