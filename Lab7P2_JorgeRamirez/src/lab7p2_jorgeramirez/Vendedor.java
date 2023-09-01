/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jorgeramirez;

/**
 *
 * @author Jorge Ramirez
 */
public class Vendedor {
    private String nombre;
    private int cantidadCarrosVendidos;
    private double dineroGenerado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadCarrosVendidos() {
        return cantidadCarrosVendidos;
    }

    public void setCantidadCarrosVendidos(int cantidadCarrosVendidos) {
        this.cantidadCarrosVendidos = cantidadCarrosVendidos;
    }

    public double getDineroGenerado() {
        return dineroGenerado;
    }

    public void setDineroGenerado(double dineroGenerado) {
        this.dineroGenerado = dineroGenerado;
    }

    public Vendedor(String nombre, int cantidadCarrosVendidos, double dineroGenerado) {
        this.nombre = nombre;
        this.cantidadCarrosVendidos = cantidadCarrosVendidos;
        this.dineroGenerado = dineroGenerado;
    }

    

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", cantidadCarrosVendidos=" + cantidadCarrosVendidos + 
                ", dineroGenerado=" + dineroGenerado + '}';
    }
    
    
}
