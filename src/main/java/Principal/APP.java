package Principal;

import Controller.GestionBanco;
import Modelo.*;

public class APP {
    public static void inicializar(){
        GestionBanco gestionBanco=new GestionBanco();
        Sucursal sucursal =new Sucursal("Cod1","Cod2");

        Cliente cliente=new Cliente("Nombre1");

        gestionBanco.insatnciarCliente(cliente);
        gestionBanco.instanciarSucursal(sucursal);


        Ahorro cuentaAhorro=new Ahorro(sucursal,cliente,"N1","Fecha1",100,0.40);
        Corriente cuentaCorriente=new Corriente(sucursal,cliente,"n1","f1",200,30);

        gestionBanco.instanciarCuenta(cuentaAhorro,cliente,sucursal);

        gestionBanco.instanciarCuenta(cuentaCorriente,cliente,sucursal);

       gestionBanco.mostrarInfoCuenta(cliente);
       System.out.println(gestionBanco.mostrarCuentaAhorro(sucursal).get(0).informacionCuenta());
       System.out.println(gestionBanco.mostrarCuentasCorriente(sucursal).get(0).informacionCuenta());
    }
    public static void main(String[]args) {
        inicializar();
    }
}