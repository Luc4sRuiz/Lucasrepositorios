/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMPLEJIDADCUADRATICA;
import java.util.ArrayList;
/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void imprimirPares(ArrayList<Integer> lista) {
        // Recorremos cada elemento de la lista
        for (int i = 0; i < lista.size(); i++) {
            // Segundo bucle anidado para recorrer cada par
            for (int j = 0; j < lista.size(); j++) {
                // Imprimimos el par de elementos
                System.out.println(lista.get(i) + " " + lista.get(j));
            }
        }
    }

    public static void main(String[] args) {
        // Lista de ejemplo
        ArrayList<Integer> miLista = new ArrayList<>();
        miLista.add(10);
        miLista.add(20);
        miLista.add(30);

        // Llamada a la función
        imprimirPares(miLista);
    }
}


