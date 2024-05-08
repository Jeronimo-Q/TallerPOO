package com.jeronimo.facturacion.dominio;

import java.time.LocalDate;

public abstract class Factura {
    protected long valor;
    protected String cliente;
    protected LocalDate fechaDeVecimiento;
    protected String medioDePago;

    public Factura(long valor, String cliente, LocalDate fechaDeVecimiento,String medioDePago) {
        this.valor = valor;
        this.cliente = cliente;
        this.fechaDeVecimiento = fechaDeVecimiento;
        this.medioDePago = medioDePago;
    }

    public void facturar(){
    }
    protected abstract long calcularTotal();

    @Override
    public String toString() {
        return "Factura{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fechaDeVecimiento=" + fechaDeVecimiento +
                '}';
    }
}
