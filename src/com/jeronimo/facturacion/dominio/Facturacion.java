package com.jeronimo.facturacion.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Facturacion {
    private List<Factura> facturas;
    public static final int diasAntesDeVencimiento = 30;

    public Facturacion(){
        this.facturas = new ArrayList<>();}

    public void generarFactura(long valor,String cliente , LocalDate fecha,String medioPgo) {
        Factura factura = null;
        String palabraReve = new StringBuilder(cliente).reverse().toString();

        if(0 > ChronoUnit.DAYS.between(LocalDate.now(),fecha)){
            factura = new FacturaVencida(valor,cliente,fecha,medioPgo);
        }
        if(fecha.isEqual(LocalDate.of(fecha.getYear(),10,31))){
            factura = new FacturaHallowen(valor,cliente,fecha,medioPgo,666666);
        }
        if(medioPgo.toLowerCase().equals("tarjeta")){
            factura = new FacturaConTarjCred(valor,cliente,fecha,medioPgo,0.10);
        }
        if(cliente.equals(palabraReve)){
            factura = new FacturaPalindroma(valor,cliente,fecha,medioPgo,0.70);
        }
        if(valor<100000){
            factura = new FacturaSinIva(valor,cliente,fecha,medioPgo);
            if(diasAntesDeVencimiento < ChronoUnit.DAYS.between(LocalDate.now(),fecha)) {
                factura = new FacturaConDescuento(valor, cliente, fecha, medioPgo, 0.15);
            }
        }else if(valor>=100000){
            factura = new FacturaConIva(valor,cliente,fecha, 0.19, medioPgo);
        }
        this.facturas.add(factura);
    }
    public long getTotalFacturacion(){
        long total = 0;
        for(Factura factura:facturas){
            total += factura.calcularTotal();
        }
        return total;
    }
    public Factura getFacturarMasCara(){
       Factura facturaCara = null;
        long mayor = facturas.getFirst().valor;
       for(Factura factura:facturas){
           if(factura.valor>mayor){
                mayor = factura.valor;
              facturaCara = factura;
           }
      }
       //this.facturas.stream().max(Comparator.comparing(Factura::calcularTotal)).orElse(null);
        return facturaCara;
    }
    public List<FacturaSinIva> getFacturasSinIva(){
        List<FacturaSinIva> facturasSinIva = new ArrayList<>();
        for(Factura factura:facturas){
            if(factura instanceof FacturaSinIva){
                facturasSinIva.add((FacturaSinIva) factura);
            }
        }
        return facturasSinIva;
    }


}
