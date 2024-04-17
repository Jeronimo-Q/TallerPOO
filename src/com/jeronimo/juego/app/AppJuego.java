package com.jeronimo.juego.app;

import com.jeronimo.calculadora.App.AppCalculadora;
import com.jeronimo.calculadora.dominio.Calculadora;
import com.jeronimo.juego.dominio.Juego;

import javax.swing.*;
import java.util.Arrays;

public class AppJuego {
    private static final ImageIcon IMAGEN = new ImageIcon(AppJuego.class.getResource("imagen.jpg"));

    public static void main(String[] args) {
        Juego juego = new Juego();
        while(true) {
            int opcion = JOptionPane.showOptionDialog(null, "Bienvenid@\n¿Que quieres hacer?", "POO-Piedra, Papel o Tijera", 0
                    , 0, IMAGEN, Arrays.asList("Ver instrucciones", "Jugar", "Ver resultados").toArray(), null);

            if (opcion == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
            }
            switch (opcion) {
                case 0:
                    mostrarMensaje("Las reglas del juego son:\n\n1) Para jugar debe escoger entre Piedra Papel o Tijera\n2) Las normas son las siguientes :\n *   La piedra le gana a las tijeras pero pierde contra el papel" +
                            "\n*   Las tijeras le ganan al papel pero pierden contra la piedra\n*   El papel le gana a la piedra pero pierde contra las tijeras");
                    break;
                case 1:
                    String desicion = (String) JOptionPane.showInputDialog(null, "!Juguemos¡\nPor favor selecciona una opcion",
                            "POO-Piedra, Papel o Tijera", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Piedra", "Papel", "Tijera"}, null);
                    mostrarMensaje(juego.juego(desicion));
                    break;
                case 2:
                    mostrarMensaje("Tu: "+juego.getPersona()+" partidas ganadas\n"
                            +"La computadora: "+juego.getMaquina()+" partidas ganadas\n"+
                            "Empates: "+juego.getEmpates()+" partidas");
                    break;

            }
        }
    }
    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje,
                "POO - Calculadora", JOptionPane.INFORMATION_MESSAGE);
    }

}
