package com.jeronimo.calculadora.dominio;

import javax.swing.*;
import java.util.ArrayList;

public class Calculadora {
    public static double sumar(ArrayList<Double> numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static double restar(ArrayList<Double> numeros) {
        double resultado = 0;
        for (double numero : numeros) {
            resultado -= numero;
        }
        return resultado;
    }

    public static double multiplicar(ArrayList<Double> numeros) {
        double resultado = 1;
        for (double numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }

    public static double dividir(ArrayList<Double> numeros, JCheckBox redondear) {
        double resultado = numeros.get(0);
        for (int i = 0; i < numeros.size() - 1; i++) {
            double numSiguiente = numeros.get(i + 1);
            resultado /= numSiguiente;
            if (redondear.isSelected()) {
                resultado = Math.round(resultado);
            }
        }
        return resultado;
    }
    public static double promedio(ArrayList<Double>numeros,JCheckBox redondear){
        double resultado = sumar(numeros);
        resultado = resultado/ numeros.size();
        if (redondear.isSelected()) {
            resultado = Math.round(resultado);
        }
        return resultado;
    }
}