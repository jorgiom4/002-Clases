package com.instancia2.calculadora;

import java.util.Scanner;

public class Calculadora {

    private  int valor1;
    private  int valor2;

    public Calculadora(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca valor1: ");
        valor1 = sc.nextInt(); //leer un entero

        System.out.print("Introduzca valor2: ");
        valor2 = sc.nextInt(); //leer un entero

    }
    //Constructor
    public Calculadora(int a, int b ){
        valor1 = a;
        valor2 = b;
    }

    //metodo suma dos valores pasados por consola
    public int Sumar (){
        return valor1 + valor2;
    }


    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
}
