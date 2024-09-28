/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1.EJERCICIO2;



/**
 *
 * @author Lucas
 */
public class FECHAS {
    public void fechas(int dia, int mes, int anio) {
        // Verificar si la fecha ingresada es de una persona menor de edad (asumiendo que la mayoría de edad es a los 13 años)
        if (anio > 2011) { // Si el año es mayor a 2011, significa que la persona tiene 13 años o menos en 2024
            System.out.println("No puedes acceder a esta app, porque eres menor de edad. Se te dirigirá a otra app.");
        } else {
            System.out.println("Eres mayor de edad. Sigue las siguientes instrucciones.");
            // Aquí puedes agregar más lógica para lo que debería suceder si el usuario es mayor de edad.
        }
    }
}


