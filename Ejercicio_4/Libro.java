package Laboratorio_IV.Ejercicio_4;
public class Libro extends Material {
    private String categoria;

    public Libro(String nombre, String categoria){
        super(nombre);
        this.categoria = categoria;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre del libro: "+ nombre+ " | Categoria: "+categoria);
    }
}
