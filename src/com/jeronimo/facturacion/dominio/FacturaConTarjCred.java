package com.jeronimo.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConTarjCred extends Factura{
    private double comision;
    protected FacturaConTarjCred(long valor, String cliente, LocalDate fecha, String medioPago,double comision){
        super(valor,cliente,fecha,medioPago);
        this.comision = comision;
        this.valor = calcularTotal();
    }

    public long calcularComision(){return (long) (comision*valor);}
    @Override
    protected long calcularTotal() {
        return calcularComision()+valor;
    }

    @Override
    public String toString() {
        return "FacturaConTarjCred{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaDeVecimiento=" + fechaDeVecimiento +
                '}';
    }
}