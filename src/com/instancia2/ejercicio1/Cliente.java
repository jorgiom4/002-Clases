package com.instancia2.ejercicio1;

import java.util.Scanner;

public class Cliente {

    int radio;

    public Cliente(int r){
        super();
        this.radio = r;

        Circulo myCirculo = new Circulo(radio);
        System.out.println("El perimetro es: " + myCirculo.getRadio());
        System.out.println("El area es: " + myCirculo.getArea());
        System.out.println("El perimetro es: " + myCirculo.getPerimetro());

    }













}
