package com.jeronimo.herencia.figuraGeometrica.dominio;

public class Cuadrilatero extends FiguraGeometrica{
    protected double ladoA;
    protected double ladoB;

    public Cuadrilatero(double ladoA,double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {return ladoA*ladoB;}

    @Override
    public double calcularPerimetro() {return (2*ladoB)+(2*ladoA);}
}
