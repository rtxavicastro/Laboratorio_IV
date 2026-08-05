package Laboratorio_IV.Ejercicio_2;
public class Vehiculo {
    protected String marca;
    protected int year;

    public Vehiculo(String marca, int year){
        this.marca = marca;
        this.year = year;
    }

    public void mostrarDatos(){
        System.out.println("No existe una marca");
        System.out.println("No existe un año");
    }
}
