/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP3;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Lucas
 */
public class TP3EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        double inversionfutura;
        double inversion = 10.000;
        double tasa = 0.06;
      
        for( int año=1; año<=5;año++){
            inversionfutura = inversion*Math.pow(1 + tasa, año);
            System.out.println("En el año numero "+año+" la inversion fue de "+inversionfutura);
            
            System.out.println("la inversion redondeada del año "+año+" es de:"+Math.round(inversionfutura));
           
           
        }
        
        
        
    }
    
}
