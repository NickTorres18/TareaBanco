package Controller;

import Modelo.*;

import java.util.ArrayList;
import java.util.List;

public class GestionBanco {
private List<Cliente>clientes=new ArrayList<>();
private List<Sucursal>sucursales=new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
    public Cliente insatnciarCliente(Cliente cliente){
    this.clientes.add(cliente);
    return cliente;
    }

public Sucursal instanciarSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
        return sucursal;
    }

public Cuenta instanciarCuenta(Cuenta cuenta,Cliente cliente, Sucursal sucursal){
        cliente.getCuentasCliente().add(cuenta);
        sucursal.getCuentasSucursal().add(cuenta);
        return cuenta;
    }
public void mostrarInfoCuenta(Cliente cliente){
      for(Cuenta cuenta:cliente.getCuentasCliente()){
          System.out.println(cuenta.informacionCuenta());
      }
}
public List<Ahorro>mostrarCuentaAhorro(Sucursal sucursal){
        List<Ahorro>cuentasAhorro=new ArrayList<>();
        for (Cuenta cuenta:sucursal.getCuentasSucursal()){
            if(cuenta.GetType().equals("Cuenta de ahorro")){
                cuentasAhorro.add((Ahorro) cuenta);
            }
        }
        return cuentasAhorro;
}

public List<Corriente>mostrarCuentasCorriente(Sucursal sucursal){
        List<Corriente>cuentasCorriente=new ArrayList<>();
        for(Cuenta cuenta:sucursal.getCuentasSucursal()){
            if(cuenta.GetType().equals("Cuenta corriente")){
                cuentasCorriente.add((Corriente) cuenta);
            }
        }
        return cuentasCorriente;


    }


}