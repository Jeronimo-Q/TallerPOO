package com.jeronimo.facturacion.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FacturaVencida extends Factura{
    public static final int VALOR_DIA_VENCIDO = 10000;
    protected FacturaVencida(long valor, String cliente, LocalDate fecha,String medioPago){
        super(valor,cliente,fecha,medioPago);
        this.valor = calcularTotal();
    }

    public int getDiasVencidos(){
        return (int) ChronoUnit.DAYS.between(LocalDate.now(),fechaDeVecimiento);
    }

    public long calularVecimiento(){
        return (long) getDiasVencidos() *VALOR_DIA_VENCIDO;
    }

    @Override
    protected long calcularTotal() {
        return calularVecimiento()+valor;
    }

    @Override
    public String toString() {
        return "FacturaVencida{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaDeVecimiento=" + fechaDeVecimiento +
                '}';
    }
}

