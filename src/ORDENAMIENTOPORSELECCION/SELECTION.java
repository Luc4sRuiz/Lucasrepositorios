/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENAMIENTOPORSELECCION;

/**
 *
 * @author Lucas
 */
public class SELECTION {
    public class SelectionSort {
    // Método para realizar el ordenamiento por selección
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Recorremos todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  // Suponemos que el elemento actual es el mínimo

            // Buscamos el valor mínimo en el resto del arreglo
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Actualizamos el índice del mínimo
                }
            }

            // Intercambiamos el elemento actual con el mínimo encontrado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
 }
  }    
