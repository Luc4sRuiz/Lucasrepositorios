/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7Nº1;

/**
 *
 * @author Lucas
 */
public class ANIMAL {
    private String codigo;
    private String nombre;
    private int edad;
    private double peso;
    private String tipo; // Mamífero, Ave, Reptil, etc.
    private DIETA dieta;

    public ANIMAL(String codigo, String nombre, int edad, double peso, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipo = tipo;
    }

    // Getters y setters
    public void setDieta(DIETA dieta) {
        this.dieta = dieta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Animal: " + nombre + " (" + tipo + "), Edad: " + edad + ", Peso: " + peso;
    }

    Object getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


