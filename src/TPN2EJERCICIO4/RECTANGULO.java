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
public abstract class RECTANGULO  extends FIGURASGEOEMTRICAS{
    @Override
    public void Areayperimetro(){
        System.out.println("Area del Rectangulo");
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo"));
        Alt = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura del rectangulo"));
        
        Area = base * Alt;
        
        System.out.println("El Area del rectangulo es: "+Area);     
        
        
        double Perimetro = 2*(base + Alt);
        System.out.println("El Perimetro del rectangulo es: "+Perimetro);
        
    }
}
