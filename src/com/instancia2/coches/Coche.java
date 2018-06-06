package com.instancia2.coches;

/**
 * Clase Coche
 */
public class Coche {

    //Atributos
    private String sNombre;
    private String sColor;
    private int iPotencia;
    private String sModelo;
    private String sBastidor;
    private String sMarca;

    /**
     * Método arracancar
     */
    public void arrancarCoche(){
        System.out.printf("Estoy arrancando el coche....");
    }

    /**
     * Método acelerar
     */
    public void acelerar(){
        System.out.printf("Estoy acelerando el coche...");
    }

    /**
     * Método frenar
     */
    public void frenar(){
        System.out.printf("Estoy frenando el coche...");
    }

    /**
     * Método parar
     */
    public void parar(){
        System.out.printf("Estoy pardo...");
    }

    /**
     * Obtenemos el nombre del coche
     * @return Nombre
     */
    public String getNombre() {
        return sNombre;
    }

    /**
     * Asignamos el Nombre del coche
     * @param sNombre
     */
    public void setNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    /**
     * Obtenemos el color del coche
     * @return color
     */
    public String getColor() {
        return sColor;
    }

    /**
     * Asignamos el color del coche
     * @param sColor
     */
    public void setColor(String sColor) {
        this.sColor = sColor;
    }

    /**
     * Obtenemos la potencia del coche
     * @return sPotencia
     */
    public int getPotencia() {
        return iPotencia;
    }

    /**
     * Asignamos la potencia del coche
     * @param iPotencia
     */
    public void setPotencia(int iPotencia) {
        this.iPotencia = iPotencia;
    }

    /**
     * Obtenemos el modelo del coche
     * @return sModelo
     */
    public String getModelo() {
        return sModelo;
    }

    /**
     * Asignamos el modelo del coche
     * @param sModelo
     */
    public void setModelo(String sModelo) {
        this.sModelo = sModelo;
    }

    /**
     * Obtenemos el numero de bastidor del coche
     * @return sBastidor
     */
    public String getBastidor() {
        return sBastidor;
    }

    /**
     * Asignamos el nombre del bastidor del coche
     * @param sBastidor
     */
    public void setBastidor(String sBastidor) {
        this.sBastidor = sBastidor;
    }

    /**
     * Obtenemos la marca del coche
     * @return sMarca
     */
    public String getMarca() {
        return sMarca;
    }

    /**
     * Asignamos la marca del coche
     * @param sMarca
     */
    public void setMarca(String sMarca) {
        this.sMarca = sMarca;
    }
}
