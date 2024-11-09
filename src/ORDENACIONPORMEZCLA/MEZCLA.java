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
public class MEZCLA {
public class MergeSort {

    // Método para combinar dos subarreglos ordenados
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;  // Tamaño del subarreglo izquierdo
        int n2 = right - mid;     // Tamaño del subarreglo derecho

        // Crear arreglos temporales para almacenar los subarreglos
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copiar datos a los subarreglos temporales
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Índices iniciales de los subarreglos izquierdo y derecho
        int i = 0, j = 0;
        // Índice inicial del arreglo combinado
        int k = left;

        // Mezclamos los subarreglos en el arreglo original
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];  // Si el elemento izquierdo es menor o igual, lo colocamos primero
                i++;
            } else {
                arr[k] = R[j];  // Si el elemento derecho es menor, lo colocamos primero
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes del subarreglo izquierdo (si hay alguno)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes del subarreglo derecho (si hay alguno)
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

} 
}
