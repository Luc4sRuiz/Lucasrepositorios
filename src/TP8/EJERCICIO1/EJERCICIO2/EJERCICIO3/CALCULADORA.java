/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1.EJERCICIO2.EJERCICIO3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class CALCULADORA {

    public void calcularPropina(float total, float porcentaje) {
        float propina = (total * porcentaje) / 100;

        if (porcentaje < 10) {
            System.out.println("ERROR: La propina debe ser de al menos un 10%.");
        } else {
            System.out.println("La propina es de: " + propina);
            System.out.println("Gracias por dar una propina del " + porcentaje + "%.");
        }
    }
}

        
    
    
        

    
    

