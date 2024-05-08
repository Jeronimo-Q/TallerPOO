package com.jeronimo.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConDescuento extends FacturaSinIva{
    private double porcDescuento;
    protected FacturaConDescuento(long valor, String cliente, LocalDate fecha,String medioPago,double porcDescuento){
        super(valor, cliente, fecha, medioPago);
        this.porcDescuento = porcDescuento;
        this.valor = calcularTotal();
    }
    public long calcularDescuento(){
        return (long) (porcDescuento*valor);
    }
    @Override
    protected long calcularTotal() {
        return valor-calcularDescuento();
    }

    @Override
    public String toString() {
        return "FacturaConDescuento{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaDeVecimiento=" + fechaDeVecimiento +
                '}';
    }
}
