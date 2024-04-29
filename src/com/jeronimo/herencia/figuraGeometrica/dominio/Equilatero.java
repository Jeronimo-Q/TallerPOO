package com.jeronimo.herencia.figuraGeometrica.dominio;

public class Equilatero extends Triangulo{
    protected double ladoA;
    public Equilatero(double ladoA){
        this.ladoA = ladoA;
    }
    @Override
    public double calcularArea() {
        return (Math.sqrt(3)*Math.pow(ladoA,2))/2;
    }

    @Override
    public double calcularPerimetro() {
        return ladoA*3;
    }
}
