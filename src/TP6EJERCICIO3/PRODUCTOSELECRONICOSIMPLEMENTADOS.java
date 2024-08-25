/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6EJERCICIO3;

/**
 *
 * @author Lucas
 */
public class PRODUCTOSELECRONICOSIMPLEMENTADOS implements PRODUCTOSELECTRONICOS {
    
    private String nombre;
    private double precio;
    private int potencia;

    public PRODUCTOSELECRONICOSIMPLEMENTADOS(String nombre, double precio, int potencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.potencia = potencia;
    }
    
    @Override
    public String getnombre(){
        return nombre;                
    }
    
    @Override
    public double getPrecio(){
        return precio;                
    }
    

    @Override
    public int getPotencia(){
        return potencia;                
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Potencia: " + potencia + " vatios");
    }
}
