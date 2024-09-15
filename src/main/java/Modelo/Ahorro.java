package Modelo;

public class Ahorro extends Cuenta {

	private double reajusteAnual;
	public Ahorro(Sucursal sucursal, Cliente cliente, String numeroCuenta, String fechaApertura, int saldo, double reajusteAnual) {
		super(sucursal, cliente, numeroCuenta, fechaApertura, saldo);
		this.reajusteAnual = reajusteAnual;
	}

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}


	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}

	@Override
	public String GetType() {
		return "Cuenta de ahorro";
	}

	@Override
	public String informacionCuenta() {
		String informacion="Numero de cuenta:"+" "+super.getNumeroCuenta()+" "+
				"Tipo de cuenta:"+" "+GetType()+" "+ "Fecha de apertura:"+" "+super.getFechaApertura()+" "+
				"Saldo:"+" "+super.getSaldo()+" "+"Reajuste anual:"+" "+getReajusteAnual();

		return informacion;

	}

}