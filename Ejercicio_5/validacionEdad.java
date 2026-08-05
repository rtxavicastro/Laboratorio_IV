package Laboratorio_IV.Ejercicio_5;
import java.util.Scanner;

public class validacionEdad {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        try{
            if(edad < 0){
                throw new IllegalArgumentException("Error: La edad no puede ser negativa");
            }
            System.out.println("Tienes "+edad+" años");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
