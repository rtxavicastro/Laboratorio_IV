package Laboratorio_IV.Ejercicio_16;

public class ProductoDigital extends Producto {
    public ProductoDigital(String nombre, double precio){
        super(nombre, precio);
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre del producto digital: "+nombre+" | Precio: Q"+precio);
    }
}
