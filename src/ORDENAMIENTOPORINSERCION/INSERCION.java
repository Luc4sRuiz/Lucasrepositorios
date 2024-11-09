/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENAMIENTOPORINSERCION;

/**
 *
 * @author Lucas
 */
public class INSERCION {
    // Método para ordenar un arreglo usando la ordenación por inserción
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // Tomamos el elemento actual
            int j = i - 1;

            // Movemos los elementos mayores a la derecha
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;  // Insertamos la clave en su lugar correcto
        }
    }
}


