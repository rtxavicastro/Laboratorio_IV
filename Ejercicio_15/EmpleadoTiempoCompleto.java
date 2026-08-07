package Laboratorio_IV.Ejercicio_15;

public class EmpleadoTiempoCompleto extends Empleado{
    private double mensualidad;
    public EmpleadoTiempoCompleto(String nombre, double mensualidad){
        super(nombre);
        this.mensualidad = mensualidad;
    }

    @Override
    public double calcularPago(){
        return mensualidad;
    }
}
