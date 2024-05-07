package ar.edu.unq.po2.TpSolidBancario;

import java.util.List;

import java.util.ArrayList;

/**
 * Clase que representa al banco, capaz de registrar y evaluar cualquier tipo de
 * entidad verificable.
 */
public class Banco {
	private List<Cliente> clientesDelBanco = new ArrayList<>();
	private List<Verificable> verificacionesPendientes = new ArrayList<>();

	public Banco(List<Cliente> clientesDelBanco, List<Verificable> verificacionesPendientes) {
		super();
		this.clientesDelBanco = clientesDelBanco;
		this.verificacionesPendientes = verificacionesPendientes;
	}

	public List<Cliente> getClientesDelBanco() {
		return clientesDelBanco;
	}

	public void setClientesDelBanco(List<Cliente> clientesDelBanco) {
		this.clientesDelBanco = clientesDelBanco;
	}

	public List<Verificable> getVerificacionesPendientes() {
		return verificacionesPendientes;
	}

	public void setVerificacionesPendientes(List<Verificable> verificacionesPendientes) {
		this.verificacionesPendientes = verificacionesPendientes;
	}

	public void agregarCliente(Cliente cliente) {
		clientesDelBanco.add(cliente);
	}

	/**
	 * Registra cualquier objeto que implemente la interfaz Verificable.
	 * 
	 * @param verificable El objeto verificable a registrar.
	 */
	public void registrarVerificable(Verificable verificable) {
		verificacionesPendientes.add(verificable);
	}

	/**
	 * Evalúa todas las entidades verificables registradas.
	 */
	public void evaluarVerificables() {
		for (Verificable verificable : verificacionesPendientes) {
			if (verificable.esAceptable()) {
				System.out.println("Entidad verificable aceptada.");
				// Aquí podrían ir más acciones, como actualizar el estado del objeto, notificar
				// al interesado, etc.
			}
		}
	}
}
