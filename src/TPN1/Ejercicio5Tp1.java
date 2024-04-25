/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5.tp1;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Lucas
 */
public class Ejercicio5Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int puntox=0, puntoy=0;
       
       Scanner leer = new Scanner (System.in);
       System.out.println("Escribir el valor para x");
       puntox = leer.nextInt();
       System.out.println("Escribir el valor para y");
       puntoy = leer.nextInt();
       
       if((puntox >0) && (puntoy >0)){
           System.out.println("X e Y se encuentran en el 1º Cuadrante");
       }else if ((puntox < 0) && (puntoy >0)){
           System.out.println("X e Y se encuentran en el 2º Cuadrante");
           
       }
       if((puntox<0) && (puntoy<0)){
           System.out.println("X e Y se encuentran en el 3º Cuadrante");
       }else if((puntox>0) && (puntoy<0)){
           System.out.println("X e Y se encuentran en el 4º Cuadrante");
       }
    } 
}
