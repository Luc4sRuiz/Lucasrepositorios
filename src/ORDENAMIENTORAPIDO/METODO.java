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
public class METODO {
public class QuickSort {

    // Método para intercambiar dos elementos en el arreglo
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; // Guardamos temporalmente el valor en la posición i
        arr[i] = arr[j];   // Asignamos el valor de j a la posición i
        arr[j] = temp;     // Colocamos el valor temporal en la posición j
    }

    // Particiona el arreglo usando el último elemento como pivote
    // Coloca el pivote en la posición correcta y devuelve su índice
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Elegimos el último elemento como pivote
        int i = low - 1;        // i será el índice que separa los elementos menores y mayores al pivote

        // Recorremos el arreglo desde 'low' hasta 'high - 1'
        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor que el pivote, lo intercambiamos
            if (arr[j] < pivot) {
                i++;  // Incrementamos el índice del elemento menor
                swap(arr, i, j); // Intercambiamos el elemento menor con el actual
            }
        }
        // Finalmente, colocamos el pivote en su posición correcta
        swap(arr, i + 1, high);
        return i + 1; // Devolvemos el índice del pivote
    }
  }
}