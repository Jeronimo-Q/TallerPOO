package com.jeronimo.facturacion.dominio;

import java.time.LocalDate;

public class FacturaPalindroma extends Factura {
    private double descuento;
    protected FacturaPalindroma(long valor, String cliente, LocalDate fecha, String medioPago, double descuento){
        super(valor,cliente,fecha,medioPago);
        this.descuento = descuento;
        this.valor = calcularTotal();

    }

    public long calcularDescuento(){return (long) (descuento*valor);}
    @Override
    protected long calcularTotal() {
        return valor-calcularDescuento();
    }

    @Override
    public String toString() {
        return "FacturaPalindroma{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaDeVecimiento=" + fechaDeVecimiento +
                '}';
    }
}
