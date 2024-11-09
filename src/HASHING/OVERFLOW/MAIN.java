/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HASHING.OVERFLOW;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE; // Valor máximo de un entero en Java
        System.out.println("Valor máximo de int: " + maxInt);
        
        int result = maxInt + 1; // Intentamos sobrepasar el límite
        System.out.println("Resultado tras el desbordamiento: " + result);
    }
}


