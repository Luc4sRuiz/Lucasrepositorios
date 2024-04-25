/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4.tp1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Ejercicio4Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dia, mes, año;
       
       dia = Integer.parseInt(JOptionPane.showInputDialog("Escriba el dia "));
       mes = Integer.parseInt(JOptionPane.showInputDialog("Escriba el mes "));
       año = Integer.parseInt(JOptionPane.showInputDialog("Escriba el año "));
     
        if((dia>=1) && (dia<= 30)){   
        }
            if((mes>= 1) && (mes<= 3)){
             System.out.println("La fecha ingresada corresponde al Primer cuatrimestre");
             
                
            }else if((mes>=4) && (mes<=6)){
                System.out.println("La fecha ingresada corresponde al Segundo cuatrimestre");
            }if ((mes>=7) && (mes<=9)){
                System.out.println("La fecha ingresada corresponde al Tercer cuatrimestre");  
            }else if((mes>=10) && (mes<=12)){
                System.out.println("La fecha ingresada corresponde al Cuarto cuatrimestre");
            }
              if((año !=0)){   
                }
        }
}
//utilice condicionales para hacer el ejercicio, en lo que respecta el mes y dias donde varia puse este condicional 
//if((mes>=4) && (mes<=6) para que llegue hasta cierta fecha y en el año puse que sea distinto de 0