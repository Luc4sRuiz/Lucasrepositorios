/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6Nº2;
import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class GENERAL extends TAREAS {
    public GENERAL(String nombre, LocalDate fechaInicio, LocalDate fechafin, String responsable){
        super(nombre, fechaInicio, fechafin, responsable);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(this);
    }  
}
