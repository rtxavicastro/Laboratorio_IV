package Laboratorio_IV.Ejercicio_12;
import java.util.Scanner;

public class menuBasico {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opc=0;
        int num1, num2;
        do{
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Sumar numeros");
            System.out.println("2. Restar numeros");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opcion a ejecutar: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = entrada.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = entrada.nextInt();
                    System.out.println("La suma de los dos numeros es "+(num1 + num2));
                break;
                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    num1 = entrada.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    num2 = entrada.nextInt();
                    System.out.println("La resta de los dos numeros es "+(num1 - num2));
                break;
                case 3:
                    System.out.println("Cerrando programa...");                
                    
                break;
                default:
                    System.out.println("Opcion ingresada no valida.");
            }
        }while(opc != 3);
    }
}
