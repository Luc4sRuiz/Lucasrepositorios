/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENACIONPORMEZCLA;

import java.util.Arrays;

/**
 *
 * @author Lucas
 */
public class MAIN {
     // Método principal de Merge Sort que aplica recursión
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Calculamos el punto medio del arreglo
            int mid = (left + right) / 2;

            // Aplicamos mergeSort en la primera mitad del arreglo
            mergeSort(arr, left, mid);
            // Aplicamos mergeSort en la segunda mitad del arreglo
            mergeSort(arr, mid + 1, right);

            // Finalmente combinamos las dos mitades ordenadas
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Arreglo original: " + Arrays.toString(arr));
        
        // Llamamos al método mergeSort con el índice inicial y final del arreglo
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Arreglo ordenado por Merge Sort: " + Arrays.toString(arr));
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

