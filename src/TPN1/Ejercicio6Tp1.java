/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6.tp1;
import java.util.Scanner;

//Realizar un programa que lea los lados de n triángulos, e informar:
//a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales), isósceles 
//(dos lados iguales), o escaleno (ningún lado igual)
//b) Cantidad de triángulos de cada tipo.
//c) Tipo de triángulo que posee menor cantidad
/**
 *
 * @author Lucas
 */
public class Ejercicio6Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer =new Scanner (System.in);
         int lado1, lado2, lado3;
         System.out.println("Escriba el 1er lado:");
         lado1 = leer.nextInt();
         System.out.println("Escriba el 2do lado:");
         lado2 = leer.nextInt();
         System.out.println("Escriba el 3er lado:");
         lado3 = leer.nextInt();
         
         //Triangulo Equilátero (tres lados iguales)
         if((lado1 == lado2)&&(lado2 == lado3)&&(lado1 == lado3)){
             System.out.println("El triangulo es Equilatero");
         //Triangulo Escaleno (ninguno de los lados son iguales)    
         }else if((lado1 != lado2)&&(lado2 != lado3)&&(lado1 != lado3)){
              System.out.println("El triangulo es Escaleno");  
        //Triangulo Isosceles (dos lados son iguales y uno distinto)
         }if((lado1 == lado2)&&(lado1 != lado3)&&(lado2 != lado3)){
             System.out.println("El triangulo es Isosceles"); 
         }else if((lado1 != lado2)&&(lado1 != lado3)&&(lado2 == lado3)){
             System.out.println("El triangulo es Isosceles"); 
         }if((lado1 != lado2)&&(lado2 != lado3)&&(lado1 == lado3)){
             System.out.println("El triangulo es Isosceles"); 

         }
              
    }
}
