public class PagoTarjeta extends Pago {
    public PagoTarjeta(double cantidad){
        super(cantidad);
    }

    @Override
    public void procesarPago(){
        System.out.println("Pago con tarjeta de Q"+cantidad+" ha sido procesado");
    };
}
