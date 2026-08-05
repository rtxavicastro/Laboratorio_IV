package Laboratorio_IV.Ejercicio_4;
import java.util.ArrayList;
public class claseMaterial {
    public static void main(String[] args){
        ArrayList<Material> materiales = new ArrayList<>();
        materiales.add(new Libro("Harry Potter", "Fantasia"));
        materiales.add(new Revista("National Geographic", 2026));

        for(int i = 0 ; i< materiales.size();i++){
            Material m = materiales.get(i);
            m.mostrarInformacion();
        }
    }
}
