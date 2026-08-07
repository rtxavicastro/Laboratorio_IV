package Laboratorio_IV.Ejercicio_16;
import java.util.ArrayList;

public class claseProducto {
    public static void main(String[] args){
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new ProductoFisico("Teclado HyperX", 900));
        productos.add(new ProductoDigital("Licencia de Windows 11 Pro", 1500));
        productos.add(new ProductoFisico("Mouse Logitech", 525));
        productos.add(new ProductoDigital("Resident Evil 4 Remake", 450));

        for(int i=0; i<productos.size();i++){
            Producto p = productos.get(i);
            p.mostrarInformacion();
        }
    }
}
