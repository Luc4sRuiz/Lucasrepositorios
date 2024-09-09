/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7Nº1;

/**
 *
 * @author Lucas
 */
public class DIETA {
    private String codigo;
    private String tipo; // Carnívoro, Herbívoro, Omnívoro

    public DIETA(String codigo, String tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Dieta: " + tipo;
    }

    Object getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


