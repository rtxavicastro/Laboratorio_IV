package Laboratorio_IV.Ejercicio_1;
public class Perro extends Animal {

    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println(nombre +" El perro ladra");
    }
}
