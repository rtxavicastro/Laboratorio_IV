package Laboratorio_IV.Ejercicio_8;

public class promedioNotas {
    public static void main(String[] args){
        double[] notas = {87, 96, 100, 67, 100};
        double suma = 0;

        for(int i = 0; i<5;i++){
            suma = notas[i]+suma;
        }
        System.out.println("El promedio de las notas ingresadas es de: "+(suma/5));
    }
}
