/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TPN2EJERCICIO4;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas
 */
public abstract class CUADRADO extends FIGURASGEOEMTRICAS{
    @Override
    public void Areayperimetro(){
        System.out.println("Area del Cuadrado");
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
        
        Area = lado * lado;
        
        System.out.println("El Area del cuadrado es: "+Area);     
        
        double Perimetro = lado + lado + lado + lado;
        System.out.println("El Perimetro del Cuadrado es: "+Perimetro);
        
    }
   
    }
    
    
    

