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
public abstract class CIRCULO extends FIGURASGEOEMTRICAS {
    @Override
    public void Areayperimetro(){
        System.out.println("Area del Circulo");
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        diametro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el diametro del circulo"));
        
        Area = Math.PI *Math.pow(radio,2);
        
        System.out.println("El Area del circulo es: "+Area);     
        
        
        double Perimetro = Math.PI *diametro;
        System.out.println("El Perimetro del circulo es: "+Perimetro);
        
    }
    
}
