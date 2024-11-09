/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMPLEJIDADLINEAL;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void imprimirElementos(ArrayList<Integer> lista) {
        // Recorremos cada elemento de la lista
        for (int elemento : lista) {
            System.out.println(elemento); // Imprimimos cada elemento
        }
    }

    public static void main(String[] args) {
        // Lista de ejemplo
        ArrayList<Integer> miLista = new ArrayList<>();
        miLista.add(10);
        miLista.add(20);
        miLista.add(30);
        miLista.add(40);
        miLista.add(50);

        // Llamada a la función
        imprimirElementos(miLista);
    }
}

