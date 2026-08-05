package Laboratorio_IV.Ejercicio_7;
import java.util.Scanner;

public class entradaNum {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String numero;
        int num;
        System.out.print("Ingrese un numero: ");
        numero = entrada.nextLine();
        try{
            num = Integer.parseInt(numero);
        }catch(IllegalArgumentException e){
            System.out.println("Error: solo se pueden ingresar numeros. "+e.getMessage());
        }
    }
}
