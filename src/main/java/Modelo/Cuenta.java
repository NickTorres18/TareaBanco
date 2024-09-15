package Modelo;

public abstract class Cuenta {

	private Sucursal sucursal;
	private Cliente cliente;
	private String numeroCuenta;
	private String fechaApertura;
	private int saldo;

	public Cuenta(Sucursal sucursal, Cliente cliente, String numeroCuenta, String fechaApertura, int saldo) {
		this.sucursal = sucursal;
		this.cliente = cliente;
		this.numeroCuenta = numeroCuenta;
		this.fechaApertura = fechaApertura;
		this.saldo = saldo;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public abstract String GetType();

	public abstract String informacionCuenta();

}