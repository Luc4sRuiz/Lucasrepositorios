/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.tp1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejercicio3Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        
        Scanner leer = new Scanner (System.in);
         
        System.out.println("Escriba un numero");
        a = leer.nextInt();
        
        if(a < 10){
            System.out.println("El numero ingresado es de 1 digito");   
        } else if (a >= 10){
            System.out.println("El numero ingresado es de 2 digitos");
        }
    }
}
//se uso una variable de tipo scanner para poder ller datos del teclado: Scanner leer = new Scanner (System.in); y se uso condicionales para saber si un numero es de dos o un digito
