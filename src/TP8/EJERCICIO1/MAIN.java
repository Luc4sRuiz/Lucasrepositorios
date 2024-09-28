/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
        // Creando un objeto de Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Creando un objeto de la clase VIAJE
        VIAJE viajando = new VIAJE();
        
        try {
            // Solicitando el año al usuario
            System.out.print("Introduce el año al que quieres viajar: ");
            int numero1 = scanner.nextInt();
            
            // Llamamos al método para verificar el viaje
            viajando.viajes1(numero1);
        } 
        catch (Exception e) {
            // Si ocurre algún error, mostramos este mensaje
            System.out.println("¡CUIDADO! Es peligroso viajar en el tiempo.");
        } 
        finally {
            // Cerramos el Scanner para liberar recursos
            scanner.close();
        }
    }
}


