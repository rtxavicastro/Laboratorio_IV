import java.util.ArrayList;

public class claseAnimal {
    public static void main(String[] args){
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Benji"));
        animales.add(new Gato("Rufus"));
        animales.add(new Perro("Bobby"));
        animales.add(new Gato("Rayitas"));

        for(int i = 0; i<animales.size(); i++){
            Animal a = animales.get(i);
            a.hacerSonido();
        }
    }
}