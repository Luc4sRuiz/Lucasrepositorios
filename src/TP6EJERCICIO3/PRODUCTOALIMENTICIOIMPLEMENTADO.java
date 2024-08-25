/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6EJERCICIO3;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class PRODUCTOALIMENTICIOIMPLEMENTADO implements PRODUCTOSALIMENTICIOS {
    private String Nombre;
    private double precio;
    private LocalDate fechaVencimiento;

    public PRODUCTOALIMENTICIOIMPLEMENTADO(String Nombre, double precio, LocalDate fecchaVencimiento) {
        this.Nombre = Nombre;
        this.precio = precio;
        this.fechaVencimiento = fecchaVencimiento;
    }
    
    

    @Override
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public boolean estaProximoAVencer() {
         LocalDate hoy = LocalDate.now();
        LocalDate fechaLimite = hoy.plusDays(7); // Considera productos próximos a vencer en 7 días
        return fechaVencimiento.isBefore(fechaLimite);
        
    } 

    @Override
    public String getnombre() {
        return Nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
        System.out.println("Próximo a vencer: " + (estaProximoAVencer() ? "Sí" : "No"));
    } 
}
