/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TPN1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejerciciotp1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int calif = 0;
       
        System.out.printf("Ingrese la nota de la materia Algebra:");
        calif = scanner.nextInt();
        
        if(calif < 4 ){
            System.out.println("Estas desaprobado");     
        }else if(calif > 4){
            System.out.println("Estas aprobado");
        }
        if(calif == 10){
            System.out.println("Eres un alumno sobresaliente");
       }  
    }   
    
 //en el primer ejercicio trate de usar un while pero me tiraba el mensaje infinito, entonces elegi uan estructura de condicionales//
    
    
}
