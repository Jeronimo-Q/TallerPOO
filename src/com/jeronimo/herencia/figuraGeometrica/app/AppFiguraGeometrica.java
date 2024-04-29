package com.jeronimo.herencia.figuraGeometrica.app;

import com.jeronimo.herencia.figuraGeometrica.dominio.*;

public class AppFiguraGeometrica {

    public static void main(String[] args) {
        Triangulo triangulo = new Escaleno(2,20,3);
        Triangulo cc = new Equilatero(3);
        Triangulo i = new Isoseles(4,5.6);

        calcularValores(triangulo);
        calcularValores(cc);
        calcularValores(i);
    }
    public static void calcularValores(FiguraGeometrica figura){
        System.out.println(figura.calcularArea());
        System.out.println(figura.calcularPerimetro());
    }
}
