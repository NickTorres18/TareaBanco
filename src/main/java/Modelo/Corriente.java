package Modelo;

public class Corriente extends Cuenta {

	private int lineaSobregiro;

	public Corriente(Sucursal sucursal, Cliente cliente, String numeroCuenta, String fechaApertura, int saldo, int lineaSobregiro) {
		super(sucursal, cliente, numeroCuenta, fechaApertura, saldo);
		this.lineaSobregiro = lineaSobregiro;
	}

	public int getLineaSobregiro() {
		return lineaSobregiro;
	}
	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	@Override
	public String GetType() {
		return "Cuenta corriente";
	}

	@Override
	public String informacionCuenta() {
		String informacion="Numero de cuenta:"+" "+super.getNumeroCuenta()+" "+
				"Tipo de cuenta:"+" "+GetType()+" "+ "Fecha de apertura:"+" "+super.getFechaApertura()+" "+
				"Saldo:"+" "+super.getSaldo()+" "+"Linea de sobregiro:"+" "+getLineaSobregiro();

		return informacion;


	}




}