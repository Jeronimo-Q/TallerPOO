package com.jeronimo.dispensadora.App;

import com.jeronimo.dispensadora.dominio.MaquinaDispensadora;
import com.jeronimo.dispensadora.dominio.Snack;

import java.util.List;

public class AppDispensadora {
    public static void main(String[] args) {
        MaquinaDispensadora dispensadora = new MaquinaDispensadora();

        dispensadora.agregarSnack("risadas",1,20000);
        dispensadora.agregarSnack("margarita",1,50000);
        dispensadora.quitarSnack("margarita");
        dispensadora.agregarSnack("lays",3,40000);
        dispensadora.agregarSnack("chocolatina",4,3000);
        dispensadora.aumentarUnidades("risadas");
        dispensadora.aumentarUnidades("risadas");
        List<Snack> inventario = dispensadora.mostrarInventario();
        dispensadora.mostrarInventario().forEach(snack->{
            System.out.println(snack.getPrecio());
        });
        List<Snack> agotado = dispensadora.snacksAgotados();
        List<Snack> ordenados = dispensadora.ordenarPorPrecio();
        agotado.forEach(c -> System.out.println(c.getNombre() + " " + c.getUnidades()));
        inventario.forEach(c -> System.out.println(c.getNombre() + " " + c.getUnidades()));
        System.out.println();
        ordenados.forEach(c -> System.out.println(c.getNombre() + " " + c.getUnidades()));

        Snack buscado = dispensadora.buscarSnack("risadas");
        System.out.println(buscado.getUnidades());
        System.out.println();
    }
}
