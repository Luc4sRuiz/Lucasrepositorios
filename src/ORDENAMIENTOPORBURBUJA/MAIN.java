/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENAMIENTOPORBURBUJA;

import static ORDENAMIENTOPORBURBUJA.BURBUJA.ordenarPorBurbuja;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Arreglo original:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        
        ordenarPorBurbuja(arreglo);
        
        System.out.println("\nArreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}

