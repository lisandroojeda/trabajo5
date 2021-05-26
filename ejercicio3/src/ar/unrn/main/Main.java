package ar.unrn.main;

import ar.unrn.decorador.Combo;
import ar.unrn.decorador.ComboX;
import ar.unrn.decorador.PorcionAdicional;

public class Main {

    public static void main (String []args) {
        System.out.println("Sistema de compras por Decorate");
        Combo comboA = new PorcionAdicional("Simple beacon", 100.0,
                new PorcionAdicional("Sprite", 45.0,
                        new PorcionAdicional("Doble burguer", 125.0,
                                new ComboX("Coca Cola", 50.0)
                        )
                )
        );

        System.out.println(comboA.obtenerDescripcion()+
                                   " \n Monto total "+ comboA.obtenerPrecio());

    }

}
