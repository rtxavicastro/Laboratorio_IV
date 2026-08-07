package Laboratorio_IV.Ejercicio_15;
import java.util.ArrayList;

public class claseempleado {
    public static void main(String[] args){
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoTiempoCompleto("Selvyn", 6000));
        empleados.add(new EmpleadoPorHoras("Jimena", 20, 160));
        empleados.add(new EmpleadoTiempoCompleto("Xavier", 5250));
        empleados.add(new EmpleadoPorHoras("Maria", 50, 100));

        for(int i = 0; i<empleados.size(); i++){
            Empleado e = empleados.get(i);
            System.out.println("Nombre de empleado: "+e.nombre+" | Salario: "+e.calcularPago());
        }
    }
}
