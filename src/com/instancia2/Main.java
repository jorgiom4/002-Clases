package com.instancia2;

import com.instancia2.ejemploinicializacion.ClaseEstatica;
import com.instancia2.ejemploinicializacion.Test;

/**
 * Miercoles 06/06
 * Clase para el tema 2 - Clases
 */
public class Main {

    public static void main(String[] args) {

        //Instanciamos la clase coche
        /*
        Coche miCoche = new Coche();
        Coche miCoche1 = new Coche();
        Coche miCoche2 = new Coche();

        //Establecemos el atributo nombre del coche
        miCoche.setNombre("Ferrari");
        miCoche1.setNombre("Mercedes");
        miCoche2.setNombre("Audi");

        */

        //Sacamos por pantalla el valor del atributo coche
        /*
        System.out.println(miCoche.getNombre());
        System.out.println(miCoche1.getNombre());
        System.out.println(miCoche2.getNombre());

        //Instanciamos la clase Cuenta
        Cuenta miCuenta = new Cuenta();
        */

        /*
        miCuenta.setCantidadEnCuenta();
        miCuenta.setIngreso();
        miCuenta.setReintegro();
        miCuenta.setTransferencia();

        //Instanciamos la clase Contador
        Contador miContador = new Contador();
        miContador.setContador(100);
        miContador.incrementarContador(50);
        miContador.decrementarContador(20);
        */

        //Instanciamos la clase Calculadora
        //Calculadora myCalculadora = new Calculadora();

        //System.out.println("La suma de " + myCalculadora.getValor1() + " mas " + myCalculadora.getValor2() + " es: " + myCalculadora.Sumar());

        //Instanciamos el ejercicio1
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el radio: ");
        int radio = sc.nextInt(); //leer un entero

        Cliente cliente = new Cliente(radio);
        */

        //Instanciamos la clase Test

        /*
        Test myTest = new Test();

        System.out.println(myTest.toString());

        */

        //Intanciamos ClaseEstatica
        ClaseEstatica.nombreCompuesto("Gustavo", "Antonio"); // Podemos hacer uso del metodo estatico sin instanciar la clase
        ClaseEstatica estatica1 = new ClaseEstatica();
        estatica1.numeroEstatico = 15;

        ClaseEstatica estatica2 = new ClaseEstatica();
        System.out.println(estatica2.numeroEstatico);

        ClaseEstatica estatica3 = new ClaseEstatica();
        System.out.println(estatica3.numeroEstatico);

        ClaseEstatica estatica4 = new ClaseEstatica();
        System.out.println(estatica4.numeroEstatico);

        //Todas las instancias de la clase mantienen el mismo valor de la variable static









    }
}
