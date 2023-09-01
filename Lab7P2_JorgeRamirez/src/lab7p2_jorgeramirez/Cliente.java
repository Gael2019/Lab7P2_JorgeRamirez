/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_jorgeramirez;

/**
 *
 * @author Jorge Ramirez
 */
public class Cliente {
    private String nombre;
    private int edad;
    private String profesion;
    private int cantidadCarrosComprados;
    private double sueldoDisponible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCantidadCarrosComprados() {
        return cantidadCarrosComprados;
    }

    public void setCantidadCarrosComprados(int cantidadCarrosComprados) {
        this.cantidadCarrosComprados = cantidadCarrosComprados;
    }

    public double getSueldoDisponible() {
        return sueldoDisponible;
    }

    public void setSueldoDisponible(double sueldoDisponible) {
        this.sueldoDisponible = sueldoDisponible;
    }

    public Cliente(String nombre, int edad, String profesion, int cantidadCarrosComprados, double sueldoDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.cantidadCarrosComprados = cantidadCarrosComprados;
        this.sueldoDisponible = sueldoDisponible;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + ", "
                + "cantidadCarrosComprados=" + cantidadCarrosComprados + ", sueldoDisponible=" + sueldoDisponible + '}';
    }
    
    
}
