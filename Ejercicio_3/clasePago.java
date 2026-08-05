package Laboratorio_IV.Ejercicio_3;
import java.util.ArrayList;

public class clasePago {
    public static void main(String[] args){
        ArrayList<Pago> pagos = new ArrayList<>();

        pagos.add(new PagoTarjeta(283));
        pagos.add(new PagoEfectivo(2133));
        pagos.add(new PagoTarjeta(12323));
        pagos.add(new PagoEfectivo(800));

        for(int i = 0; i < pagos.size(); i++){
            Pago p = pagos.get(i);
            p.procesarPago();
        }
    }
}
