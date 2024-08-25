/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6Nº2;
import java.util.ArrayList;
import java.util.List;

      
/**
 *
 * @author Lucas
 */
public class PROYECTOS {
    private String nombre;
    private List<TAREAS> Tareas;
    
    public PROYECTOS(String nombre){
        this.nombre = nombre;
        this.Tareas = new ArrayList<>();   
    }
    
    public void AgregarTAREA(TAREAS tareass){
        Tareas.add(tareass);
        
    }
    
    public void generarInformePROGRESO(){
        System.out.println("informe de Progreso del Proyecto" + nombre);
        for (TAREAS tareass : Tareas){
            tareass.mostrarDetalles();
            System.out.println();

        }
    }
    
}
