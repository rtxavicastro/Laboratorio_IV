public class PagoEfectivo extends Pago {
    public PagoEfectivo(double cantidad){
        super(cantidad);
    }

    @Override
    public void procesarPago(){
        System.out.println("Pago con efectivo de Q"+cantidad+" ha sido procesado");
    }
}
