package com.jeronimo.facturacion.dominio;

import java.time.LocalDate;
import java.util.List;

public class FacturaSinIva extends Factura{
    protected FacturaSinIva(long valor, String cliente, LocalDate fecha,String medioPago){
        super(valor,cliente,fecha,medioPago);
    }
    @Override
    protected long calcularTotal() {return valor;}

    @Override
    public String toString() {
        return "FacturaSinIva{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaDeVecimiento=" + fechaDeVecimiento +
                '}';
    }
}
