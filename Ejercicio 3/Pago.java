public class Pago {
    protected double cantidad;

    public Pago(double cantidad){
        this.cantidad = cantidad;
    }

    public void procesarPago(){
        System.out.println("No hay pagos que procesar");
    }
}
