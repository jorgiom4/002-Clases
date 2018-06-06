package com.instancia2;

import com.instancia2.coches.Coche;
import com.instancia2.contador.Contador;
import com.instancia2.cuenta.Cuenta;

import java.util.Scanner;

/**
 * Miercoles 06/06
 * Clase para el tema 2 - Clases
 */
public class Main {

    public static void main(String[] args) {

        //Instanciamos la clase coche
        Coche miCoche = new Coche();
        Coche miCoche1 = new Coche();
        Coche miCoche2 = new Coche();

        //Establecemos el atributo nombre del coche
        miCoche.setNombre("Ferrari");
        miCoche1.setNombre("Mercedes");
        miCoche2.setNombre("Audi");

        //Sacamos por pantalla el valor del atributo coche
        System.out.println(miCoche.getNombre());
        System.out.println(miCoche1.getNombre());
        System.out.println(miCoche2.getNombre());

        //Instanciamos la clase Cuenta
        Cuenta miCuenta = new Cuenta();

        miCuenta.setCantidadEnCuenta();
        miCuenta.setIngreso();
        miCuenta.setReintegro();
        miCuenta.setTransferencia();

        //Instanciamos la clase Contador
        Contador miContador = new Contador();
        miContador.setContador(100);
        miContador.incrementarContador(50);
        miContador.decrementarContador(20);




    }
}
