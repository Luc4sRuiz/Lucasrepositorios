/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMPLEJIDADLINEALLOGARITMICA;
import java.util.Arrays;
/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void fusionar(int[] lista, int[] izquierda, int tamIzq, int[] derecha, int tamDer) {
        int i = 0, j = 0, k = 0;

        // Fusionar mientras ambos subarreglos tengan elementos
        while (i < tamIzq && j < tamDer) {
            if (izquierda[i] < derecha[j]) {
                lista[k++] = izquierda[i++];
            } else {
                lista[k++] = derecha[j++];
            }
        }

        // Copiar los elementos restantes de la mitad izquierda
        while (i < tamIzq) {
            lista[k++] = izquierda[i++];
        }

        // Copiar los elementos restantes de la mitad derecha
        while (j < tamDer) {
            lista[k++] = derecha[j++];
        }
    }

    public static void mergeSort(int[] lista, int n) {
        // Si la lista tiene más de un elemento
        if (n > 1) {
            // Calculamos el punto medio
            int medio = n / 2;

            // Creamos subarreglos para la parte izquierda y derecha
            int[] izquierda = Arrays.copyOfRange(lista, 0, medio);
            int[] derecha = Arrays.copyOfRange(lista, medio, n);

            // Llamadas recursivas a mergeSort
            mergeSort(izquierda, medio);
            mergeSort(derecha, n - medio);

            // Fusionamos las dos mitades
            fusionar(lista, izquierda, medio, derecha, n - medio);
        }
    }

    public static void main(String[] args) {
        int[] miLista = {50, 30, 20, 10, 40};
        int n = miLista.length;

        // Llamada a la función mergeSort
        mergeSort(miLista, n);

        // Imprimir la lista ordenada
        System.out.print("Lista ordenada: ");
        for (int elemento : miLista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}

