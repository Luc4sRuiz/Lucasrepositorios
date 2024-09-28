/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8.EJERCICIO1;

/**
 *
 * @author Lucas
 */
public class VIAJE {
    
    // Límites de los años permitidos
    public int año1 = 1900;
    public int año2 = 2100;
    
    // Método que verifica si el año está dentro o fuera del rango
    public void viajes1(int anio) {
        if (anio < año1 || anio > año2) {
            // Si el año está fuera del rango permitido, mostramos advertencia
            System.out.println("¡Cuidado! Viajar al año " + anio + " es demasiado peligroso. "
                + "Podrías terminar en tiempos desconocidos.");
        } else {
            // Si el año está dentro del rango permitido, se permite el viaje
            System.out.println("BUEN VIAJE al año " + anio + "...");
        }
    }
}

    
     
        

    

