/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1.EJERCICIO2.EJERCICIO3;
import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CALCULADORA calculadora = new CALCULADORA();

        try {
            System.out.println("Ingrese el total de la cuenta:");
            float total = scanner.nextFloat();
            System.out.println("Ingrese el porcentaje de propina que desea dar:");
            float porcentaje = scanner.nextFloat();

            calculadora.calcularPropina(total, porcentaje);
        } catch (Exception e) {
            System.out.println("ERROR: Se produjo un error al ingresar los valores. Asegúrese de ingresar números válidos.");
        } finally {
            scanner.close(); // Cerrar el scanner
        }
    }
 }


