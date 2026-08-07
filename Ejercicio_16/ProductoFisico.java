package Laboratorio_IV.Ejercicio_16;

public class ProductoFisico extends Producto {
    public ProductoFisico(String nombre, double precio){
        super(nombre, precio);
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Nombre del producto físico: "+nombre+" | Precio: Q"+precio);
    }
}
