/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jorgeramirez;

/**
 *
 * @author Jorge Ramirez
 */
public class Venta {
   Vendedor vendedor;
   Cliente cliente;
   double costoTransaccion;
   Vehiculo vehiculoVendido;

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCostoTransaccion() {
        return costoTransaccion;
    }

    public void setCostoTransaccion(double costoTransaccion) {
        this.costoTransaccion = costoTransaccion;
    }

    public Vehiculo getVehiculoVendido() {
        return vehiculoVendido;
    }

    public void setVehiculoVendido(Vehiculo vehiculoVendido) {
        this.vehiculoVendido = vehiculoVendido;
    }

    public Venta(Vendedor vendedor, Cliente cliente, double costoTransaccion, Vehiculo vehiculoVendido) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.costoTransaccion = costoTransaccion;
        this.vehiculoVendido = vehiculoVendido;
    }

    @Override
    public String toString() {
        return "Venta{" + "vendedor=" + vendedor + ", cliente=" + cliente + ", "
                + "costoTransaccion=" + costoTransaccion + ", vehiculoVendido=" + vehiculoVendido + '}';
    }

   
    
    

}
