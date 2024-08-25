/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6Nº2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lucas
 */
public abstract class TAREAS {
    protected String nombre;
    protected LocalDate fechaInicio;
    protected LocalDate fechafin;
    protected String responsable;   
 
public TAREAS(String nombre, LocalDate fechaInicio, LocalDate fechafin, String responsable){
  this.nombre = nombre;
  this.fechaInicio = fechaInicio;
  this.fechafin = fechafin;
  this.responsable = responsable; 
}

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public String getResponsable() {
        return responsable;
    }

    public long calcularTiempoInvertido(){
    
        return  ChronoUnit.DAYS.between(fechaInicio, fechafin) + 1; // +1 para incluir el último día ;
    } 
 
    public abstract void mostrarDetalles();
    
   @Override
   public String toString(){
       return "Tareas"+nombre+ "\n" +
               "Inicio: " + fechaInicio + "\n" +
               "Fin: " + fechafin + "\n" +
               "Responsable: " + responsable + "\n" +
               "Tiempo invertido: " + calcularTiempoInvertido() + " días";
   }   
}
                


    


