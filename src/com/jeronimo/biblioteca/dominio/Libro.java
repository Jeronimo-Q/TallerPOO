package com.jeronimo.biblioteca.dominio;

public class Libro {
    private String nombre;
    private String autor;
    private int añoDePublicacion;
    private long identificador;
    private boolean prestamo;


    public Libro(String nombre, String autor, int añoDePublicacion, long identificador, boolean prestamo) {
        this.nombre = nombre;
        this.autor = autor;
        this.añoDePublicacion = añoDePublicacion;
        this.identificador = identificador;
        this.prestamo = prestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public long getIdentificador() {
        return identificador;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }
}
