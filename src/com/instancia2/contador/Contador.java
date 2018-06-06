package com.instancia2.contador;

/**
 * Ejercicio de clases Contador
 */
public class Contador {

    int iCuenta;

    /**
     * Incrementamos el contador
     * @param cantidad
     */
    public void incrementarContador(int cantidad){
        iCuenta += cantidad;
        System.out.println("El estado del contador es: " + getContador());
    }

    /**
     * Decrementamos el contador
     * @param cantidad
     */
    public void decrementarContador(int cantidad){
        iCuenta -= cantidad;
        System.out.println("El estado del contador es: " + getContador());
    }

    /**
     * Establecemos la cantidad incial del contador
     * @param cantidad
     */
    public void setContador(int cantidad){
        iCuenta = cantidad;
        System.out.println("El contador inicial es: " + getContador());
    }

    /**
     * Obtenemos el estado del contador
     */
    public int getContador(){
        return iCuenta;
    }


}
