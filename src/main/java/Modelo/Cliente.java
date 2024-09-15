package Modelo;

import java.util.*;

public class Cliente {

	private List<Cuenta> cuentasCliente=new ArrayList<>();
	private String nombreCliente;

		public Cliente( String nombreCliente) {
		this.nombreCliente = nombreCliente;
		}

	public List<Cuenta> getCuentasCliente() {
		return cuentasCliente;
	}

	public void setCuentasCliente(List<Cuenta> cuentasCliente) {
		this.cuentasCliente = cuentasCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
}