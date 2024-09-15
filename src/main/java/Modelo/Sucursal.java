package Modelo;

import java.util.*;

public class Sucursal {

	private List<Cuenta> cuentasSucursal=new ArrayList<>();
	private String codigoSucursal;
	private String codigoPostal;

	public Sucursal( String codigoSucursal, String codigoPostal) {
		this.codigoSucursal = codigoSucursal;
		this.codigoPostal = codigoPostal;
	}

	public List<Cuenta> getCuentasSucursal() {
		return cuentasSucursal;
	}

	public void setCuentasSucursal(List<Cuenta> cuentasSucursal) {
		this.cuentasSucursal = cuentasSucursal;
	}

	public String getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

}