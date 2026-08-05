package Laboratorio_IV.Ejercicio_2;
import java.util.ArrayList;

public class claseVehiculo {
    public static void main(String[] args){
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Carro("Toyota", 2026));
        vehiculos.add(new Moto("Honda", 2020));
        vehiculos.add(new Carro("BMW", 2026));
        vehiculos.add(new Moto("Yamaha", 2010));

        for(int i = 0; i<vehiculos.size(); i++){
            Vehiculo v = vehiculos.get(i);
            v.mostrarDatos();
        }
    }
}
