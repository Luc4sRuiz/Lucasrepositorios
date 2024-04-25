/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2.tp1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejercicio2Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        float nota1, nota2, nota3, prom, suma;
        
        System.out.println("Ingrese la primera nota de la materia INGLES");
        nota1 = entrada.nextFloat();
        System.out.println("Ingrese la segunda nota de la materia INGLES");
        nota2 = entrada.nextFloat();
        System.out.println("Ingrese la tercera nota de la materia INGLES");
        nota3 = entrada.nextFloat();
        suma = nota1 + nota2 + nota3;
        prom = suma / 3;
        if (prom >= 8){
               
            System.out.println("El Alumno esta promocionado");
        }
        if (prom < 8){
            System.out.println("El Alumno no esta promocionado");
        }    
       
        
    }
    
    
}
//Se uso condicionales para poder calcular el promedio de una materia para
//saber si el alumno estaba promocionado o no, un error que tuve que a la hora 
//de poner el condicional if (prom >=8) es que no sabia que se ponia al reves 
//porque en otros lenguajes como C, aprendi que dentro de los condicionales se  
//ponia de la siguiente forma if (prom => 8)//
