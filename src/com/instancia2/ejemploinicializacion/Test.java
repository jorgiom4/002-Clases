package com.instancia2.ejemploinicializacion;

/**
 * Ejemplo de incializacion de clase con atributos por defecto
 */
public class Test {

    private int numeroEntero; //0
    private double numeroReal; //0.0
    private boolean esCierto; //false
    private char caracter; //[] -> caracter ascii
    private String nombre; //null -> Es el objeto de tipo String se incializa por defecto a null

    @Override
    public String toString() {
        return "Test{" +
                "numeroEntero=" + numeroEntero +
                ", numeroReal=" + numeroReal +
                ", esCierto=" + esCierto +
                ", caracter=" + caracter +
                ", nombre=" + nombre  +
                '}';
    }

    //Copia valor
    int numero = 10;
    int numeroEntero1 = numero; //Aqui numero = 10 y numeroEntero1 = 10
    //numero = 20; //Aqui numero = 20 y numeroEntero = 10

    //Copia valor
    String nombre1 = "Gustavo";
    String nombre2 = nombre1; // Aqui nombre2 = Gustavo
    //nombre = "Antonio"; //Aqui nombre1 = Antonio nombre2 = Gustavo


}
