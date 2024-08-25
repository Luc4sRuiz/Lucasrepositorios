/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6Nº1;

/**
 *
 * @author Lucas
 */
public class CAMARA extends DISPOSITIVOS {


    public CAMARA(String nombre) {
        super(nombre);
    }

    @Override
    public void funcionEspecifica() {
        System.out.println("Cámara " + nombre + " está grabando video.");
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("Cámara " + nombre + " está grabando.");
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Cámara " + nombre + " ha dejado de grabar.");
    }
}

