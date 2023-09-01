/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jorgeramirez;

import java.awt.Color;

/**
 *
 * @author Jorge Ramirez
 */
public class Vehiculo {
    String Marca;
    Color color;
    String modelo;
    String año;
    int ID;
    double precioVenta;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Vehiculo(String Marca, Color color, String modelo, String año, int ID, double precioVenta) {
        this.Marca = Marca;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
        this.ID = ID;
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Marca=" + Marca + ", color=" + color + 
                ", modelo=" + modelo + ", a\u00f1o=" + año + ", ID=" + ID + ", precioVenta=" + precioVenta + '}';
    }

    
}
