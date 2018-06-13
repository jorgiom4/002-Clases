package com.instancia2.cuenta;


import java.util.Scanner;


/**
 * pedrodelafuente@gmail.com
 * Ejercicio de clases Cuenta
 */
public class Cuenta {

    private int iCantidadEnCuenta;
    private int iBalance;

    /**
     * Establecemos la cantidad inicial que hay en la cuenta
     */
    public void setCantidadEnCuenta(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una cantidad inicial en la cuenta: ");
        iCantidadEnCuenta = sc.nextInt(); //leer un entero

        System.out.println("Tienes un balance inicial de: " + iCantidadEnCuenta);

    }

    /**
     * Hacemos un ingreso en la cuenta
     */
    public void setIngreso(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca cantidad a ingresar: ");
        int ingreso = sc.nextInt();
        iCantidadEnCuenta += ingreso;
        System.out.println("Has hecho un ingreso de: " + ingreso);
        System.out.println("Tienes un balance de: " + getCantidadEnCuenta());
    }


    /**
     * Hacemos un reintegro de una cantidad
     */
    public void setReintegro(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca cantidad del reintegro: ");
        int reintegro = sc.nextInt();
        iCantidadEnCuenta -= reintegro;
        System.out.println("Has hecho un reintegro de: " + reintegro);
        System.out.println("Tienes un balance de: " + getCantidadEnCuenta());
    }

    /**
     * Realizamos una transferencia de dinero
     */
    public void setTransferencia(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca cantidad del reintegro: ");
        int transferencia = sc.nextInt();
        iCantidadEnCuenta -= transferencia;
        System.out.println("Has hecho una transferencia de: " + transferencia);
        System.out.println("Tienes un balance de: " + getCantidadEnCuenta());
    }


    /**
     * Obtenemos el balance de la cuenta
     * @return iCantidadCuenta
     */
    public int getCantidadEnCuenta(){
        return iCantidadEnCuenta;
    }
}
