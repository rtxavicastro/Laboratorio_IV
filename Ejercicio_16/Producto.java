package Laboratorio_IV.Ejercicio_16;

public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInformacion(){
        System.out.println("No hay informacion que mostrar");
    }
}
