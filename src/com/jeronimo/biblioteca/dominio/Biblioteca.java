package com.jeronimo.biblioteca.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;
    public Biblioteca(){this.libros = new ArrayList<>();}

    //Metodos
    public void agregarLibro(String nombre,String autor,int añoDePublicacion,long identificador){

        Libro libro = new Libro(nombre,autor,añoDePublicacion,identificador,false);
        if(this.buscarLibroPorAutor(nombre)==null){
            this.libros.add(libro);
        }else System.out.println("El libro "+nombre+" ya se encuentra el la biblioteca");

    }
    public void eliminarLibro(String nombre){
        if(this.buscarLibroPorAutor(nombre)==null){
            System.out.println("El libro "+nombre+" no se encuentra en la biblioteca" );
        }else this.libros.remove(buscarLibroPorNombre(nombre));
    }
    public void eliminarLibro(long identificador){
        if(this.buscarPorCodigo(identificador)==null){
            System.out.println("El libro con el identificador"+identificador+" no se encuentra en la biblioteca" );
        }else this.libros.remove(buscarPorCodigo(identificador));
    }
    public void prestrarLibro(String nombre){


    }
    public Libro buscarLibroPorNombre(String nombre){
        Libro libroBuscado = null;
        for(Libro libro : this.libros){
            if(libro.getNombre().equalsIgnoreCase(nombre)){
                libroBuscado=libro;
            }
        }
        return libroBuscado;
    }
    public List<Libro> buscarLibroPorAutor(String autor){
        List<Libro> libroBuscado = new ArrayList<>();
        for(Libro libro : this.libros){
            if(libro.getNombre().equalsIgnoreCase(autor)){
                libroBuscado.add(libro);
            }
        }
        return libroBuscado;
    }

    public Libro buscarPorCodigo(long identificador){
        Libro libroBuscado = null;
        for(Libro libro:this.libros){
            if(libro.getIdentificador()==identificador){
                libroBuscado = libro;
            }
        }
        return libroBuscado;
    }
    public List<Libro> buscarLibroPorAñoDePublicacion(int añoDePublicacion){
        return null;
    }
    public List<Libro> mostrarLibrosenorden(){
        Collections.sort(libros, Comparator.comparing(Libro::getNombre ));
        return null;
    }
    public List<Libro> mostrarLibrosPrestados(){
        return null;
    }

}
