package com.jeronimo.facturacion.app;

import com.jeronimo.facturacion.dominio.Factura;
import com.jeronimo.facturacion.dominio.Facturacion;

import java.time.LocalDate;

public class AppFacturacion {
    public static void main(String[] args) {
        Facturacion facturacion= new Facturacion();

        facturacion.generarFactura(20000,"Alfredo", LocalDate.of(2024,5,3 ),"efectivo");
        facturacion.generarFactura(90000,"Luisa", LocalDate.of(2025,7,14),"tarjeta");
        facturacion.generarFactura(200000,"Samuel", LocalDate.of(2023,9,23),"efectivo");

        System.out.println(facturacion.getFacturasSinIva());
    }
}