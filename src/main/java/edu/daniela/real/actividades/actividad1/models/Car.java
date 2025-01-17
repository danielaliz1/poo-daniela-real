package edu.daniela.real.actividades.actividad1.models;

public class Car {
    private String modelo;

    private String marca;

    private int numLlantas;

    private String color;


    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' + 
                ", numeroLlantas=" + numLlantas +
                ", color=" + color + '\'' + 
                '}';
    }

    public Car(String modelo, String marca, int numeroLlantas, String color){
        this.modelo = modelo;
        this. marca = marca;
        this.color = color;
        setNumeroLlantas(numeroLlantas);
    }

    public int getNumeroLlantas(){return numLlantas; }

    /**
     * 
     * 
     */

     public void setNumeroLlantas(int numeroLlantas) {
        if(numeroLlantas<3 || numeroLlantas>6){
            throw new IllegalArgumentException("Numero de llantas valido esta entre 3 y 6");
        }

        this.numLlantas = numeroLlantas;
     }

     public String getModelo(){
        return modelo;
     }

     public void SetModelo (String modelo){
        this.modelo = modelo;
     }

     public String getMarca(){
        return marca;
     }

     public void SetMarca (String marca){
        this.marca = marca;
     }

     public String getColor(){
        return color;
     }

     public void SetColor (String color){
        this.color = color;
     }
}




