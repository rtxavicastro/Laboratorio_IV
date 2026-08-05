import java.util.Scanner;

public class divisionSegura {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double numerador, denominador;
        System.out.print("Ingrese el numerador: ");
        numerador = entrada.nextDouble();
        System.out.print("Ingrese el denominador: ");
        denominador = entrada.nextDouble();
        try{
            if(denominador == 0){
                throw new ArithmeticException("Error: No se puede dividir entre 0");
            }
            System.out.println("El resultado de la division es: "+(numerador/denominador));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
