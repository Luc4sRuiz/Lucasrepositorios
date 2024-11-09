/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMPLEJIDADLOGARITMICA;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public static int busquedaBinaria(int[] lista, int n, int objetivo) {
        int izquierda = 0;
        int derecha = n - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (lista[medio] == objetivo) {
                return medio;  // Elemento encontrado
            } else if (lista[medio] > objetivo) {
                derecha = medio - 1;
            } else {
                izquierda = medio + 1;
            }
        }

        return -1;  // Elemento no encontrado
    }

    public static void main(String[] args) {
        int[] miLista = {10, 20, 30, 40, 50};
        int objetivo = 30;

        int resultado = busquedaBinaria(miLista, miLista.length, objetivo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}


