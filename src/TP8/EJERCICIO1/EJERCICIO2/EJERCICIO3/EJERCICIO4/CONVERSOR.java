/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1.EJERCICIO2.EJERCICIO3.EJERCICIO4;

/**
 *
 * @author Lucas
 */
public class CONVERSOR {
    // Método para convertir peso
    public double convertirPeso(double valor, String unidadDestino) {
        switch (unidadDestino.toLowerCase()) {
            case "kg":
                return valor / 1000; // Gramos a Kilogramos
            case "hg":
                return valor / 100; // Gramos a Hectogramos
            case "dag":
                return valor / 10; // Gramos a Decagramos
            case "g":
                return valor; // Gramos a Gramos
            case "dg":
                return valor * 10; // Gramos a Decigramos
            case "cg":
                return valor * 100; // Gramos a Centigramos
            case "mg":
                return valor * 1000; // Gramos a Miligramos
            default:
                System.out.println("Unidad de peso no válida.");
                return 0; // Indica error
        }
    }

    // Método para convertir longitud
    public double convertirLongitud(double valor, String unidadDestino) {
        switch (unidadDestino.toLowerCase()) {
            case "km":
                return valor / 1000; // Metros a Kilómetros
            case "hm":
                return valor / 100; // Metros a Hectómetros
            case "dam":
                return valor / 10; // Metros a Decámetros
            case "m":
                return valor; // Metros a Metros
            case "dm":
                return valor * 10; // Metros a Decímetros
            case "cm":
                return valor * 100; // Metros a Centímetros
            case "mm":
                return valor * 1000; // Metros a Milímetros
            default:
                System.out.println("Unidad de longitud no válida.");
                return 0; // Indica error
        }
    }

    // Método para convertir volumen
    public double convertirVolumen(double valor, String unidadDestino) {
        switch (unidadDestino.toLowerCase()) {
            case "km³":
                return valor / Math.pow(1000, 3); // Metros cúbicos a Kilómetros cúbicos
            case "hm³":
                return valor / Math.pow(100, 3); // Metros cúbicos a Hectómetros cúbicos
            case "dam³":
                return valor / Math.pow(10, 3); // Metros cúbicos a Decámetros cúbicos
            case "m³":
                return valor; // Metros cúbicos a Metros cúbicos
            case "dm³":
                return valor * Math.pow(10, 3); // Metros cúbicos a Decímetros cúbicos
            case "cm³":
                return valor * Math.pow(100, 3); // Metros cúbicos a Centímetros cúbicos
            case "mm³":
                return valor * Math.pow(1000, 3); // Metros cúbicos a Milímetros cúbicos
            default:
                System.out.println("Unidad de volumen no válida.");
                return 0; // Indica error
        }
    }
}


