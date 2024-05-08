package com.jeronimo.facturacion.dominio;

import java.time.LocalDate;

public class FacturaHallowen extends Factura {
    private long aumento;
    protected FacturaHallowen(long valor, String cliente, LocalDate fecha, String medioPago,long aumento){
        super(valor,cliente,fecha,medioPago);
        this.aumento = aumento;
        this.valor = calcularTotal();
    }

    @Override
    protected long calcularTotal() {
        return valor+aumento;
    }

    @Override
    public String toString() {
        return "FacturaHallowen{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaDeVecimiento=" + fechaDeVecimiento +
                '}';
    }
}
