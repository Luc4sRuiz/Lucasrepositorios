/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENAMIENTORAPIDO;

import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class MAIN {
      private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Encuentra la posición correcta del pivote
            int pi = partition(arr, low, high);

            // Ordena recursivamente la sublista izquierda (menores al pivote)
            quickSort(arr, low, pi - 1);
            // Ordena recursivamente la sublista derecha (mayores al pivote)
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Arreglo original: " + Arrays.toString(arr));
        
        // Llamamos al método quickSort con el índice inicial y final del arreglo
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Arreglo ordenado por Quick Sort: " + Arrays.toString(arr));
    }

    private static int partition(int[] arr, int low, int high) {
        throw new UnsupportedOperationException("Not supported yet."); // 
    }
}

