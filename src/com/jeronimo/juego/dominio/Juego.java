package com.jeronimo.juego.dominio;

import com.jeronimo.juego.app.AppJuego;

import java.util.Random;

public class Juego {
     String[] opciones = {"Piedra", "Papel", "Tijera","Navaja"};
     private int maquina=0;
     private int persona=0;
     private int empates=0;
     private  Random random = new Random();

    //Metodos

    public  String juego(String desicion) {
        int indiceComputadora = random.nextInt(opciones.length);
        String seleccionComputadora = opciones[indiceComputadora];
        if (desicion.equals(seleccionComputadora)) {
            empates++;
            return "Tu seleccionaste:"+desicion+
                    "\nLa computadora selecciono:"+seleccionComputadora+"\nEmpate";
        }
        else if ((desicion.equals("Piedra") && seleccionComputadora.equals("Tijera")) ||
                (desicion.equals("Papel") && seleccionComputadora.equals("Piedra")) ||
                (desicion.equals("Tijera") && seleccionComputadora.equals("Papel"))||
                (desicion.equals("Navaja") && seleccionComputadora.equals("Papel"))||
                (desicion.equals("Piedra") && seleccionComputadora.equals("Navaja"))||
                (desicion.equals("Tijera") && seleccionComputadora.equals("Navaja"))){
                if (desicion.equals("Papel")||desicion.equals("Navaja")){
                    persona++;
                }
                persona++;
            String seleccionPC = seleccionComputadora;
            return "Tu seleccionaste:"+desicion+
                    "\nLa computadora selecciono:"+seleccionComputadora+"\nHaz ganado";
        } else
            if (seleccionComputadora.equals("Papel")||seleccionComputadora.equals("Navaja")){
                maquina++;}
            maquina++;
            return "Tu seleccionaste:"+desicion+
                    "\nLa computadora selecciono:"+seleccionComputadora+"\nPerdiste";
    }

    //Getters
    public  int getMaquina() {
        return maquina;
    }

    public  int getPersona() {
        return persona;
    }
    public  int getEmpates(){

        return empates;
    }

}
