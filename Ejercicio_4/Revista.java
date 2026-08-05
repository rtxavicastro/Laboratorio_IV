package Laboratorio_IV.Ejercicio_4;
public class Revista extends Material {
    private int year;

    public Revista(String nombre, int year){
        super(nombre);
        this.year = year;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre de la revista: "+ nombre+ " | Año: "+year);
    }
}
