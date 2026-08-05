package Laboratorio_IV.Ejercicio_2;
public class Moto extends Vehiculo{
    public Moto(String marca, int year){
        super(marca, year);
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Marca de moto: "+marca+" - Año: "+year);
    }
}
