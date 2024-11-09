/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLIMORFISMO;

/**
 *
 * @author Lucas
 */
public class MAIN {
    public static void main(String[] args) {
        ANIMAL miAnimal1 = new PERRO();  // Polimorfismo
        ANIMAL miAnimal2 = new GATO();   // Polimorfismo

        miAnimal1.hacerSonido();  // Salida: El perro dice: ¡Guau!
        miAnimal2.hacerSonido();  // Salida: El gato dice: ¡Miau!
    }
}

