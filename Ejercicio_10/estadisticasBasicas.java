package Laboratorio_IV.Ejercicio_10;
import java.util.Scanner;

public class estadisticasBasicas {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[5];
        double suma=0;

        for(int i = 0; i< 5; i++){
            System.out.print("Ingrese el no. "+(i+1)+": ");
            numeros[i] = entrada.nextDouble();
            suma = numeros[i]+suma;
        }

        System.out.println("La suma de los numeros ingresados es: "+suma);
        System.out.println("El promedio de los numeros ingresados es: "+(suma/5));

        double mayor = numeros[0];
        for(int i = 0; i<5;i++){
            if(numeros[i]> mayor){
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor de los numeros es: "+mayor);
        
        double menor = numeros[0];
        for(int i = 0; i<5; i++){
            if(numeros[i]<menor){
                menor = numeros[i];
            }
        }
        System.out.println("El menor de los numeros es: "+menor);
    }
}
