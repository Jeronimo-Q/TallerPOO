package com.jeronimo.dispensadora.dominio;

public class Snack {
    private long codigo;
    private String nombre;
    private int precio;
    private int unidades;

    public Snack(String nombre,long codigo, int precio, int unidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
