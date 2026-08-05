package Laboratorio_IV.Ejercicio_1;
public class Gato extends Animal {
    public Gato(String nombre){
        super(nombre);
    }

    @Override
    public void hacerSonido(){
        System.out.println(nombre+ " esta maullando");
    }
}
