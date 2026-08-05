public class Carro extends Vehiculo {
    public Carro(String marca, int year){
        super(marca, year);        
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Marca de carro: "+marca+" - Año: "+year);
    }
}
