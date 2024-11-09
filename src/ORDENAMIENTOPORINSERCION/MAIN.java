/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORDENAMIENTOPORINSERCION;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};  // Arreglo que queremos ordenar
        
        // Llamamos al método de ordenación desde la clase InsertionSort
        INSERCION.insertionSort(arr);
        
        // Imprimimos el arreglo ordenado
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

}
