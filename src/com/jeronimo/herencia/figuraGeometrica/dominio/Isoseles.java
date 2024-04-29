package com.jeronimo.herencia.figuraGeometrica.dominio;

public class Isoseles extends Triangulo{
    protected double ladoA;
    protected double ladoB;
    protected double altura;
    public Isoseles(double ladoA,double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;

    }
    @Override
    public double calcularArea() {
        altura = Math.sqrt(Math.pow(ladoA,2)-Math.pow(ladoB/2,2));
        return (ladoB*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return (ladoA*2)+ladoB;
    }
}
