package com.jeronimo.dispensadora.dominio;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.sort;

public class MaquinaDispensadora {
    public static  final int CAPACIDAD = 12;
    private List<Snack> dispensadora;

    public MaquinaDispensadora(){this.dispensadora = new ArrayList<>();}
    //Metodos
    public void agregarSnack(String nombre,long codigo, int precio) {

        Snack snack = new Snack(nombre, codigo, precio, 0);

        if (this.dispensadora.size() < CAPACIDAD) {
            if (this.buscarSnack(nombre) == null && this.buscarSnack(codigo)==null) {
                this.dispensadora.add(snack);
            } else {
                System.out.println("La maquina dispensadora ya cuenta con este producto");
            }

        } else {
            System.out.println("La maquina dispensadora ya esta llena");
        }
    }
    public void sacarSnackPorCodigo(long codigo){
        if (this.buscarSnack(codigo)==null) {
            System.out.println("Este producto no se encuentra en la maquina");
        }
        if(buscarSnack(codigo).getUnidades()==0){
            System.out.println("El almacenamiento "+buscarSnack(codigo).getNombre()+" esta vacio");}
        else buscarSnack(codigo).setUnidades(buscarSnack(codigo).getUnidades() - 1);

    }
    public void sacarSnackPornombre(String nombre){
        if (this.buscarSnack(nombre)==null){
            System.out.println("Este producto no se encuentra en la maquina");
        }
        if(buscarSnack(nombre).getUnidades()==0){
            System.out.println("El almacenamiento "+buscarSnack(nombre).getNombre()+" esta vacio");}
        else buscarSnack(nombre).setUnidades(buscarSnack(nombre).getUnidades() - 1);
    }
    public void aumentarUnidades(String nombre){
        if (this.buscarSnack(nombre)==null){
            System.out.println("Este producto no se encuentra en la maquina");
        }
        if(buscarSnack(nombre).getUnidades()==6){
            System.out.println("El almacenamiento"+buscarSnack(nombre).getNombre()+" esta lleno");
        } else buscarSnack(nombre).setUnidades(buscarSnack(nombre).getUnidades() + 1);
    }
    public void aumentarUnidades(long codigo){
        if (this.buscarSnack(codigo)==null){
            System.out.println("Este producto no se encuentra en la maquina");
        }
        if(buscarSnack(codigo).getUnidades()==6){
            System.out.println("El almacenamiento"+buscarSnack(codigo).getNombre()+" esta lleno");}
        else buscarSnack(codigo).setUnidades(buscarSnack(codigo).getUnidades() + 1);
    }
    public void quitarSnack(String nombre){
        if (this.buscarSnack(nombre)==null){
            System.out.println("Este producto no se encuentra en la maquina");
        } else{
            this.dispensadora.remove(buscarSnack(nombre));
        }
    }
    public void cantidadUnidadesSnack(String nombre){
        if (this.buscarSnack(nombre)==null){
            System.out.println("Este producto no se encuentra en la maquina");
        } else{
            System.out.println("Las unidades del proeducto son : "+nombre+buscarSnack(nombre).getUnidades());
        }
    }
    public List<Snack> snacksAgotados(){
        List<Snack> snacksagotados = new ArrayList<>();
        boolean agotado = false;
        for(Snack snack : this.dispensadora){
            if(snack.getUnidades() == 0){
                snacksagotados.add(snack);
                agotado = true;
            }
        }
        if(!agotado){
            System.out.println("Cada snack de la dispensadora cuenta por lo menos con un elemento");
        }
        return snacksagotados;
    }
    public List<Snack> mostrarInventario(){
        return dispensadora;
    }
    public List<Snack> ordenarPorPrecio() {
        Collections.sort(dispensadora, Comparator.comparing(Snack::getPrecio).reversed());
        return dispensadora;
    }
    public List<Snack> ordenarPorCantidad() {
        Collections.sort(dispensadora, Comparator.comparing(Snack::getUnidades));
        return dispensadora;
    }
    public Snack buscarSnack(String nombre){
        Snack snackBuscado = null;
        for(Snack snack: this.dispensadora){
            if(snack.getNombre().equalsIgnoreCase(nombre)){
                snackBuscado = snack;
            }
            }
        return snackBuscado;
    }
    public Snack buscarSnack(long codigo){
        Snack snackBuscado = null;
        for(Snack snack: this.dispensadora){
            if(snack.getCodigo()==codigo){
                snackBuscado = snack;
            }
        }
        return snackBuscado;
    }

    }

