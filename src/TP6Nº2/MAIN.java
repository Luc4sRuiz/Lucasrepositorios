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
public class MAIN {
    public static void main (String[] args){
        //CREAR EL PROYECTO
        PROYECTOS proyectos = new PROYECTOS("DESARROLLO EN SISTEMAS DE ROBOTICA AUTOMATIZADA");
        
        //CREAE TAREAS
        TAREAS tarea1 = new GENERAL("PROGRAMACION DE AUTOMATIZACION ", LocalDate.of(2022, 6, 12),LocalDate.of(2022, 6, 18),"Tony");
        TAREAS tarea2 = new GENERAL("DISEÑO DE LOS DIAGRAMAS", LocalDate.of(2022, 7, 4),LocalDate.of(2022, 7, 7),"Coni");
        TAREAS tarea3 = new GENERAL("CONTRUCCION DE LAS PARTES INTERNAS", LocalDate.of(2022, 9, 22),LocalDate.of(2022, 9, 30),"Richard");
        TAREAS tarea4 = new GENERAL("ARMADO E INSTALACION DEL APARATO", LocalDate.of(2022, 11, 18),LocalDate.of(2022, 11, 29),"Zack");
        TAREAS tarea5 = new GENERAL("TEST DEL APARATO FINAL", LocalDate.of(2022, 12, 15),LocalDate.of(2022, 12, 20),"Jacob");
        
        //AGREGAR TAREAS AL PROYECTO
        proyectos.AgregarTAREA(tarea1);
        proyectos.AgregarTAREA(tarea2);
        proyectos.AgregarTAREA(tarea3);
        proyectos.AgregarTAREA(tarea4);
        proyectos.AgregarTAREA(tarea5);
        
        //GENERAR INFORME 
        proyectos.generarInformePROGRESO();
        
    }
    
}
