package com.jeronimo.EPS.dominio;

import com.jeronimo.biblioteca.dominio.Libro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EPS {
    public static final byte CAPACIDAD =100;
    private String nombre;
    private List<Paciente> pacientes;

    public EPS(){
        this.pacientes=new ArrayList<>();
    }

    //Metodos
    public boolean afiliarPaciente(long cedula,String nombre){

        boolean afiliado = false;

        if(this.pacientes.size()<CAPACIDAD){
            if(buscarPaciente(cedula)==null){
                Paciente paciente = new Paciente(cedula,nombre);
                this.pacientes.add(paciente);
                afiliado = true;
            }else System.out.println("El usuario "+cedula+" ya se encuentra afiliado");

        }else System.out.println("La EPS ya no tiene mas espacios");
        return afiliado;
    }

    public void sacarPaciente(long cedula){
        if(buscarPaciente(cedula)==null){
            System.out.println("El paciente con la cedula "+cedula+" no se encuentra afiliado a la EPS");
        }else this.pacientes.remove(buscarPaciente(cedula));
    }

    public Paciente buscarPaciente(long cedula){
        Paciente pacienteBuscado = null;
        for(Paciente paciente: this.pacientes){
            if(paciente.getCedula()==cedula){
                pacienteBuscado = paciente;
            }
        }
        return pacienteBuscado;
    }
    public List<Paciente> buscarPacientesPorEnfermedad(String enfermedad){
        List<Paciente> pacienteEnfermo = new ArrayList<>();
        for(Paciente paciente: this.pacientes) {
            if (paciente.getNombre().equalsIgnoreCase(enfermedad)) {
                pacienteEnfermo.add(paciente);
            } else System.out.println("No se encuentra pacientes enfermos");
        }
        return pacienteEnfermo;
    }
    public List<Paciente> obtenerPacientesSinEnfermedades(){

        return null;
    }
    public void ordenarPacientesPorNombre(){
        Collections.sort(pacientes, Comparator.comparing(Paciente::getNombre));
    }
}

