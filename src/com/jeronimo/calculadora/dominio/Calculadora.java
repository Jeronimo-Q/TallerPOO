package com.jeronimo.calculadora.dominio;

import javax.swing.*;

public class Calculadora {
    public static double sumar(double a, double b){return a + b;}

    public static double restar(double a, double b){return a - b;}

    public static double multiplicar(double a, double b){return a * b;}

    public static double dividir(double a, double b, JCheckBox redondear){
        double resultado = a/b;
        if(redondear.isSelected()){
            resultado = Math.round(resultado);
        }
        return resultado;
    }

}
