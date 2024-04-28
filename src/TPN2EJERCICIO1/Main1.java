/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TPN2EJERCICIO1;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Main1{
    public static void main(String[] args) {
           Scanner sc = new Scanner (System.in);
                // Pedir al usuario que ingrese los datos del empleado
                String Nombre, Apellido;
                int Edad;
                int Salario;
                double incrementofijo,porcentajeDesempeno;
                
              System.out.println("Ingrese el nombre del empleado: ");
              Nombre = sc.next();
              System.out.println("Ingrese el apellido del empleado: ");
              Apellido = sc.next();
              System.out.println("Ingrese la edad del empleado: ");
              Edad = sc.nextInt();
              System.out.println("Ingrese el salario del empleado: ");
              Salario = sc.nextInt();  

             // Incrementar el salario del empleado según un incremento fijo
             System.out.println("Ingrese el incremento fijo del salario: ");
             incrementofijo = sc.nextDouble();
             System.out.println("Salario incrementado a: "+Salario+"");
             // Incrementar el salario del empleado según un incremento y un porcentaje de desempeño
             System.out.println("Ingrese el incremento adicional del salario: ");
             
             
             
            
                 
                
                
                
        }
          
    
}
    
