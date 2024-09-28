/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1.EJERCICIO2;


import java.util.Scanner;

/**
 *
 * @author Lucas
 */
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FECHAS fechas = new FECHAS();
        
        try {
            // Encabezado para la entrada de fecha
            System.out.println("=================================");
            System.out.println("         Introduce la fecha      ");
            System.out.println("=================================");
            
            // Solicitar el día, mes y año
            System.out.print("Día (1-31): ");
            int dia = scanner.nextInt();
            
            System.out.print("Mes (1-12): ");
            int mes = scanner.nextInt();
            
            System.out.print("Año (1700-2024): ");
            int anio = scanner.nextInt();
            
            // Llamar al método para verificar la fecha
            fechas.fechas(dia, mes, anio);
        } catch (Exception e) {
            // Manejo de excepciones para entradas no válidas
            System.out.println("Ocurrió un error en la entrada. Por favor, asegúrate de ingresar números válidos.");
        } finally {
            scanner.close(); // Cerrar el escáner al finalizar
        }
    }
}



