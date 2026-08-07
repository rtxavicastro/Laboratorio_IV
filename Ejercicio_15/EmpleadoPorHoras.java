package Laboratorio_IV.Ejercicio_15;

public class EmpleadoPorHoras extends Empleado {
    private double pagoHora;
    private int horas;
    public EmpleadoPorHoras(String nombre, double pagoHora, int horas){
        super(nombre);
        this.pagoHora = pagoHora;
        this.horas = horas;
    }

    @Override
    public double calcularPago(){
        return pagoHora * horas;
    }
}
