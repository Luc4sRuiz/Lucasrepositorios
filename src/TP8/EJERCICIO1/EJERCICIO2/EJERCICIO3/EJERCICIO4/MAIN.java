/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1.EJERCICIO2.EJERCICIO3.EJERCICIO4;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class MAIN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CONVERSOR conversor = new CONVERSOR();

        try {
            System.out.print("Ingrese el tipo de medida (peso, longitud, volumen): ");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.print("Ingrese el valor a convertir: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            String unidadDestino = "";
            double resultado = 0;

            if (tipo.equals("peso")) {
                System.out.print("Ingrese la unidad de destino (kg, hg, dag, g, dg, cg, mg): ");
                unidadDestino = scanner.nextLine();
                resultado = conversor.convertirPeso(valor, unidadDestino);
            } else if (tipo.equals("longitud")) {
                System.out.print("Ingrese la unidad de destino (km, hm, dam, m, dm, cm, mm): ");
                unidadDestino = scanner.nextLine();
                resultado = conversor.convertirLongitud(valor, unidadDestino);
            } else if (tipo.equals("volumen")) {
                System.out.print("Ingrese la unidad de destino (km³, hm³, dam³, m³, dm³, cm³, mm³): ");
                unidadDestino = scanner.nextLine();
                resultado = conversor.convertirVolumen(valor, unidadDestino);
            } else {
                System.out.println("Tipo de medida no válido.");
                return; // Salir del programa si el tipo es inválido
            }

            if (resultado != 0) {
                System.out.println("El resultado de la conversión es: " + resultado + " " + unidadDestino);
            } else {
                System.out.println("Error en la conversión. Unidad no válida.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Por favor, ingrese valores válidos.");
        } finally {
            scanner.close(); // Cerrar el scanner
        }
    }
}

