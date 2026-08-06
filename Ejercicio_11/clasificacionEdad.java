package Laboratorio_IV.Ejercicio_11;
import java.util.Scanner;

public class clasificacionEdad {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese la edad: ");
        edad = entrada.nextInt();
        if(edad > 0 && edad <13){
            System.out.println("La edad "+edad+" corresponde a la de un niño");
        }else if( edad > 12 && edad < 18){
            System.out.println("La edad "+edad+" corresponde a la de un adolecente");
        }else if(edad > 17 && edad < 100){
            System.out.println("La edad "+edad+" corresponde a la de un adulto");
        }else{
            System.out.println("La edad "+edad+" no es una edad valida");
        }
    }
}
