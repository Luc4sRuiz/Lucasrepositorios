/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6EJERCICIO3;

/**
 *
 * @author Lucas
 */
public class PRODUCTOSDEROPAIMPLEMENTADOS  implements PRODUCTOSDEROPA{
    private String nombre;
    private double precio;
    private String talla;
    private String material;

    public PRODUCTOSDEROPAIMPLEMENTADOS(String nombre, double precio, String talla, String material) {
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
        this.material = material;
    }
    
    @Override
    public String getnombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getTalla() {
        return talla;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Talla: " + talla);
        System.out.println("Material: " + material);
    }

}

