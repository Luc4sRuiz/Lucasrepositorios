/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENAMIENTOPORBURBUJA;

/**
 *
 * @author Lucas
 */
public class BURBUJA {
    public static void ordenarPorBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambioRealizado;

        // Recorremos todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            intercambioRealizado = false; // Para optimizar si no se realiza ningún intercambio

            // Comparar elementos adyacentes y cambiar si están en orden incorrecto
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;

                    intercambioRealizado = true;
                }
            }

            // Si no se realizó ningún intercambio, el arreglo ya está ordenado
            if (!intercambioRealizado) {
                break;
            }
        }
    }
}
