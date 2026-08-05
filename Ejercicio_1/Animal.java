package Laboratorio_IV.Ejercicio_1;
public abstract class Animal {
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public abstract void hacerSonido();
}
