package Laboratorio_IV.Ejercicio_9;
import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[3];

        for(int i = 0; i< 3;i++){
            System.out.print("Ingrese el no. "+(i+1)+": ");
            numeros[i]=entrada.nextInt();
        }

        int validacion = numeros[0];
        for(int i = 0; i<3;i++){
            if(numeros[i]> validacion){
                validacion = numeros[i];
            }
        }
        System.out.println("El numero mayor es: "+validacion);
    }
}
