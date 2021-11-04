package negocio;

import java.util.ArrayList;
import dao.DaoTigre;
import entidad.ClienteTigre;

public class ImportadorTigre{
	
	public ArrayList<ClienteTigre> listaClientes;
	
	public ImportadorTigre() {
		DaoTigre dao = new DaoTigre();
		dao.leerLineas();
		listaClientes = dao.getListaClientes();
	}

	public ArrayList<ClienteTigre> getListaClientes() {
		return listaClientes;
	}
}
