/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HASHING.OVERFLOW.CHANING;

/**
 *
 * @author Lucas
 */
public class PERSONA {
    private String nombre;
    private int edad;

    public PERSONA setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PERSONA setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

