package com.jeronimo.calculadora.App;

import com.jeronimo.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppCalculadora {
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;
    private static final ImageIcon IMAGEN = new ImageIcon(AppCalculadora.class.getResource("calculadora.jpg"));

    public static void main(String[] args) {
        while (true) {
            JCheckBox redondear = new JCheckBox("¿Redondear?");
            ArrayList<Double> numeros = new ArrayList<>();
            int opcion = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "POO - UCO",
                    0, 0, IMAGEN,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", redondear).toArray()
                    , null);
            if (opcion == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
            }

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese lacantidad de valores"));
            for(int i = 0; i<cantidad; i++){
                double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor :"));
                numeros.add(numero1);
            }
            double resultado = 0;

            switch (opcion) {
                case 0:
                    resultado = Calculadora.sumar(numeros);
                    break;
                case 1:
                    resultado = Calculadora.restar(numeros);
                    break;
                case 2:
                    resultado = Calculadora.multiplicar(numeros);
                    break;
                case 3:
                    resultado = Calculadora.dividir(numeros, redondear);
                    break;
            }
            mostrarMensaje("El resultado es " + resultado);
        }
    }
        private static void mostrarMensaje(String mensaje){
            JOptionPane.showMessageDialog(null,mensaje,"POO - UCO",JOptionPane.INFORMATION_MESSAGE,IMAGEN);
        }
}
