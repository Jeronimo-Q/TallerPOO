package com.jeronimo.herencia.figuraGeometrica.dominio;

public class Cuadrado extends Cuadrilatero{
    public Cuadrado(double lado){super(lado,lado);}

    @Override
    public double calcularArea() {
        return ladoA*ladoA;
    }

    @Override
    public double calcularPerimetro() {
        return super.calcularPerimetro();
    }
}
