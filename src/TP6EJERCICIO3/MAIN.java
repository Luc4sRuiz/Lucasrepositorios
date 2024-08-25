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
public class MAIN {
      public static void main(String[] args) {
      // Crear productos
        PRODUCTOSALIMENTICIOS productoAlimenticio = new PRODUCTOALIMENTICIOIMPLEMENTADO("CAFE", 1700, LocalDate.of(2025, 4, 23));
        PRODUCTOSELECTRONICOS productoElectronicos = new PRODUCTOSELECRONICOSIMPLEMENTADOS("CARGADOR", 350450, 5);
        PRODUCTOSDEROPA productoRopa = new PRODUCTOSDEROPAIMPLEMENTADOS ("BUZO", 12500, "L", "Algodón");

        // Mostrar características de los productos
        System.out.println("Características del Producto Alimenticio:");
        productoAlimenticio.mostrarCaracteristicas();
        System.out.println();

        System.out.println("Características del Producto Eléctrico:");
        productoElectronicos.mostrarCaracteristicas();
        System.out.println();

        System.out.println("Características del Producto de Ropa:");
        productoRopa.mostrarCaracteristicas();
    }
}
