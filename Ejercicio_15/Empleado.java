package Laboratorio_IV.Ejercicio_15;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public abstract double calcularPago();
}
