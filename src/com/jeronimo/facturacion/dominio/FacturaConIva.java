package com.jeronimo.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConIva extends Factura{
    private double porcentajeIva;

    protected FacturaConIva(long valor, String cliente, LocalDate fecha,double porcentajeIva,String medioPago){
        super(valor,cliente,fecha,medioPago);
        this.porcentajeIva = porcentajeIva;
        this.valor = calcularTotal();
    }

    public long calcularIva(){
        return (long) (valor*porcentajeIva);
    }

    @Override
    protected long calcularTotal() {
        return calcularIva()+valor;
    }

    @Override
    public String toString() {
        return "FacturaConIva{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaDeVecimiento=" + fechaDeVecimiento +
                '}';
    }
}
