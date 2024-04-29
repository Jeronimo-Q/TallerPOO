package com.jeronimo.herencia.figuraGeometrica.dominio;

public class Escaleno extends Triangulo{
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;
    protected double semiperimetro;
    public Escaleno(double ladoA,double ladoB,double ladoC){
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;

    }
    @Override
    public double calcularArea() {
        semiperimetro =calcularPerimetro()/2;
        return Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro*ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoA+ladoB+ladoC;
    }
}
